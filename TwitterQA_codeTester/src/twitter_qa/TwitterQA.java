package twitter_qa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

import twitter4j.*;
import twitter4j.v1.*;

public class TwitterQA {
	@SuppressWarnings("unused")
	
	private Twitter twitter;
	private long userID;
	private String userName;
	private String welcomeMessage = "Welcome to the Twitter Question&Answer game! \nPlease select one of the following games: \n\n";
	private LocalDateTime msgTimestamp = LocalDateTime.MIN;
	
	private HashMap<String, Game> games = new HashMap<String, Game>();
	private HashMap<Long, Player> players = new HashMap<Long, Player>();
	
	private List<Player> playersToDelete = new ArrayList<Player>();
	private Queue<Player> queueSendWelcomeMsg = new ConcurrentLinkedQueue<Player>();
	private Queue<Player> queueGetGameSelection = new ConcurrentLinkedQueue<Player>();
	private Queue<Player> queueSendTest = new ConcurrentLinkedQueue<Player>();
	private Queue<Player> queueGetAnswer = new ConcurrentLinkedQueue<Player>();
	
	
	public TwitterQA() throws TwitterException {
		this.twitter = Twitter.newBuilder()
	      .oAuthConsumer("nPty0JIv3o95dkuH7brLbYm7R", "nKfyaXeKEB0gb9QXU75C7meXlpIZMDOeW3GRrZ1NEnfYz5WqxH")
	      .oAuthAccessToken("339007027-dIc8sKZ1eOyQ59jgCL8eIrDcn9ukNuoTfgA4Jl6J", "WwnlVHwIO0RyGgm9UmOfusvJtkzQUtoNoJyJGhnyGTkO1")
	      .build();
		this.userName = this.twitter.v1().users().getAccountSettings().getScreenName();
		this.userID = this.twitter.v1().users().showUser(userName).getId();
		System.out.println(this.userName + " : " + userID);
		createGames();
	}
	
	public void printFollowers() throws TwitterException {
		System.out.println("FOLLOWERS");
		ArrayList<Long> ids = getFollowerIDs(userID);
		for (long id : ids) {
			User user = this.twitter.v1().users().showUser(id);
			System.out.println(user.getScreenName() + " : " + id);
		}
		System.out.println("-----\n");
	}
	public void printMessages() throws TwitterException {
		System.out.println("MESSAGES");
		HashMap<Long, String> messages = getNewDirectMessages();
		for (Long senderID : messages.keySet()) {
			System.out.println(senderID + " : " + messages.get(senderID));
		}
		System.out.println("-----\n");
	}
	public void printPlayers() throws TwitterException {
		System.out.println("PLAYERS");
		for (Long id : players.keySet()) {
			User user = this.twitter.v1().users().showUser(id);
			System.out.println(user.getScreenName() + " : " + id);
		}
		System.out.println("-----\n");
	}
	public void printTweets() throws TwitterException {
		System.out.println("TWEETS");
		HashMap<Long, Tweet> tweets = getMentionTweets();
		
		for (Long userID : tweets.keySet()) {
			Tweet tweet = tweets.get(userID);
			System.out.println(tweet.screenname + " : " + tweet.location.latitude + ", " + tweet.location.longitude + " : " + tweet.timestamp + " : " + tweet.text);			
		}
		System.out.println("-----\n");
	}
	private ArrayList<Long> getFollowerIDs(long userID) throws TwitterException {
		long cursor = -1;
	    IDs ids;
	    ArrayList<Long> idArray = new ArrayList<Long>();

		do {
			ids = twitter.v1().friendsFollowers().getFollowersIDs(userID, cursor);
			for (long id : ids.getIDs()) {
				idArray.add(id);
			}
		} while ((cursor = ids.getNextCursor()) != 0);
		
		return idArray;
	}	
	private HashMap<Long, String> getNewDirectMessages() throws TwitterException {
		  DirectMessageList messagesBatch;
		  DirectMessageList messages = twitter.v1().directMessages().getDirectMessages(20);
		  if (messages.isEmpty()) {return new HashMap<Long, String>();}
		  //System.out.println("limit : " + messages.getRateLimitStatus());
		  String cursor = messages.getNextCursor();
		  String prev_cursor = null;
		  //System.out.println(cursor + " : " + prev_cursor);
	      
	      while (!Objects.equals(cursor, prev_cursor) && msgTimestamp.isBefore(messages.get(messages.size()-1).getCreatedAt())) {
	    	messagesBatch = twitter.v1().directMessages().getDirectMessages(20, messages.getNextCursor());
	        messages.addAll(messagesBatch);
	        prev_cursor = cursor;
	        cursor = messagesBatch.getNextCursor();
	        //System.out.println(cursor + " : " + prev_cursor);
	      }
	      
	      HashMap<Long, String> messages_map = new HashMap<Long, String>();
	      // loop in reverse to get newest message of user
	      for (int i=messages.size()-1; i>=0; i--) {
	    	  DirectMessage message = messages.get(i);
	    	  //System.out.print(message.getText() + ", ");
	    	  if (message.getCreatedAt().isAfter(msgTimestamp))
	    	  messages_map.put(message.getSenderId(), message.getText());
	      }
	      msgTimestamp = messages.get(0).getCreatedAt();
	      return messages_map;
		}
	private HashMap<Long, Tweet> getMentionTweets() throws TwitterException {
		ResponseList<Status> tweets = twitter.v1().timelines().getMentionsTimeline();
		System.out.println(tweets.size());
		HashMap<Long, Tweet> tweets_map = new HashMap<Long, Tweet>();
		// iterate backwards to get newest tweet
		for (int i=tweets.size()-1; i>=0; i--) {
			Status tweet = tweets.get(i);
			tweets_map.put(tweet.getUser().getId(),
							new Tweet(tweet.getUser().getScreenName(),
										extractLocation(tweet.getPlace().getFullName(), tweet.getPlace().getBoundingBoxCoordinates()),
										tweet.getCreatedAt(),
										tweet.getText()));
		}
		return tweets_map;		
	}
	public void createGames() {
		StringBuilder sb = new StringBuilder();
		
		Location tuebingen_stadt = new Location("Tübingen", 48.521637, 9.057645);
		
		HashMap<String, Test> tests = new HashMap<String, Test>();
		Test tuebingen00 = new Test("0", tuebingen_stadt, "What is the official name of the Univerity of Tübingen?", Arrays.asList("Eberhard-Karls-Universität", "Eberhard-Karls-Universitaet"), null, 360, 3, 100, null, null, null);
		Test tuebingen01 = new Test("1", tuebingen_stadt, "What is the main bridge through Tübingen called?", Arrays.asList("Neckarbrücke", "Neckarbruecke"), null, 360, 3, 100, null, null, null);

		tests.put(tuebingen01.getID(), tuebingen01);
		
		Game game = new Game("0", tuebingen00, tests, "Tübingen", "The first game in a small city in the south of germany");
		games.put(game.getID(), game);
		sb.append(welcomeMessage).append(game.getID()).append(". \t").append(game.getDescription()).append("\n");
		welcomeMessage = sb.toString();
	}
	public void updatePlayers() throws TwitterException {
		ArrayList<Long> followers = getFollowerIDs(userID);
		for (Long followerID : followers) {
			if (!players.containsKey(followerID)) {
				Player player = new Player(followerID);
				players.put(followerID, player);
		        queueSendWelcomeMsg.add(player);
		        //twitter.v1().directMessages().sendDirectMessage(followerID, welcomeMessage);
			}
		}
		for (Long player : players.keySet()) {
			if (!followers.contains(player)) {
		        playersToDelete.add(players.get(player));
			}
		}
	}	
	public void sendWelcomeMsg() throws TwitterException {
		while (!queueSendWelcomeMsg.isEmpty()) {
			
			Player player = queueSendWelcomeMsg.poll();
			if (playersToDelete.contains(player)) {
				playersToDelete.remove(player);
				continue;
			}
			twitter.v1().directMessages().sendDirectMessage(player.getID(), welcomeMessage);
			queueGetGameSelection.add(player);
		}
	}
	public void getGameSelection() throws TwitterException {
		HashMap<Long, String> messages = getNewDirectMessages();
		System.out.println(messages.toString());
		
		if (messages.isEmpty()){return;}
		
		Long firstPlayer = queueGetGameSelection.peek().getID();
		Boolean alldone = false;
		while (!queueGetGameSelection.isEmpty() && !alldone) {
			Player player = queueGetGameSelection.poll();
			
			if (playersToDelete.contains(player)) {
				continue;
			}
			String selection = messages.get(player.getID());
			//System.out.println("SELECTION" + selection + " : " + games.keySet().toString());
			if (!games.containsKey(selection)) {
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Please send a correct selction.");
				queueGetGameSelection.add(player);
			}
			else {
				player.setGame(games.get(selection));
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "You selected: " + player.getGame().getID());
				queueSendTest.add(player);
			}
			
			if (!queueGetGameSelection.isEmpty() && queueGetGameSelection.peek().getID() == firstPlayer) {
				alldone = true;
			}
		}
	}
	public void sendTestInstruction() throws TwitterException {
		while (!queueSendTest.isEmpty()) {
			
			Player player = queueSendTest.poll();
			if (playersToDelete.contains(player)) {
				continue;
			}
			DirectMessage message = twitter.v1().directMessages().sendDirectMessage(player.getID(), player.getTest().getQuestion());
			player.setTimestamp(message.getCreatedAt().plusSeconds((long)player.getTest().getTimelimit()));
			player.setAttempts(player.getTest().getAttempts());
			queueGetGameSelection.add(player);
		}
	}
	
	public void getAnswer() throws TwitterException {
		HashMap<Long, Tweet> answers = getMentionTweets();
		
		if (answers.isEmpty()){return;}
		
		Long firstPlayer = queueGetAnswer.peek().getID();
		Boolean alldone = false;
		while (!queueGetAnswer.isEmpty() || !alldone) {
			Player player = queueGetGameSelection.poll();
			
			if (playersToDelete.contains(player)) {
				continue;
			}
			Tweet answer = answers.get(player.getID());
			
			Boolean inTime = answer.timestamp.isBefore(player.getTimestamp());
			Boolean atLocation = nearLocation(player.getNextLocation(), answer.location);
			Boolean correct = player.getTest().getAnswers().contains(answer.text.split(";")[0]);
			
			String message;
			if (!inTime) {
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "You provided the answer to late.");
				player.setTest(player.getTest().getTestOnTimeout());
				queueSendTest.add(player);
			}
			else if (!atLocation) {
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "You are not at the right location.");
				queueGetAnswer.add(player);
			}
			else if (!correct) {
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Your answer is incorrect.\n");
				player.setAttempts(player.getAttempts()-1);
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Remaining attempts: " + player.getAttempts());
				if (player.getAttempts() == 0) {
					player.setTest(player.getTest().getTestOnFail());
					queueSendTest.add(player);
				}
				else {
					queueGetAnswer.add(player);
				}
			}
			else {
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Congratulations! Your answer is correct.\n");
				player.setTest(player.getTest().getTestOnCorrect());
				queueSendTest.add(player);
			}
			if (!queueGetGameSelection.isEmpty() && queueGetGameSelection.peek().getID() == firstPlayer) {
				alldone = true;
			}		
		}
	}
	private Location extractLocation(String name, GeoLocation[][] boundingboxcoor) {
        double[] centroid = new double[2];
        int count = 0;
        for (GeoLocation[] gls : boundingboxcoor) {
            for (GeoLocation g : gls) {
                centroid[0] += g.longitude;
                centroid[1] += g.latitude;
                count++;
            }
        }

        centroid[0] /= count;
        centroid[1] /= count;
        Location location = new Location(name, centroid[0], centroid[1]);
        return location;
    }
	private Boolean nearLocation(Location playerLoc, Location tweet) {
		double lonDiff = Math.abs(playerLoc.longitude) - Math.abs(tweet.longitude);
		double latDiff = Math.abs(playerLoc.latitude) - Math.abs(tweet.latitude);
		
		return (lonDiff < 0.015 && latDiff < 0.015);
	}
}
