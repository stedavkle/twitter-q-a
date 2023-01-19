package twitter_qa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

import twitter4j.*;
import twitter4j.v1.*;

public class TwitterQA {
	private Twitter twitter;
	private long userID;
	private String userName;
	private String welcomeMessage = "Welcome to the Twitter Question&Answer game! \nPlease select one of the following games: \n\n";
	private LocalDateTime msgTimestamp = LocalDateTime.MIN;
	
	private HashMap<String, Game> games = new HashMap<String, Game>();
	private HashMap<Long, Player> players = new HashMap<Long, Player>();
	private HashMap<String, Location> locations = new HashMap<String, Location>();

	private List<Player> playersToDelete = new ArrayList<Player>();
	private Queue<Player> queueSendWelcomeMsg = new ConcurrentLinkedQueue<Player>();
	private Queue<Player> queueGetGameSelection = new ConcurrentLinkedQueue<Player>();
	private Queue<Player> queueSendTest = new ConcurrentLinkedQueue<Player>();
	private Queue<Player> queueGetAnswer = new ConcurrentLinkedQueue<Player>();
	
	
	public TwitterQA() throws TwitterException {
		this.twitter = Twitter.newBuilder()
	      .oAuthConsumer("", "")
	      .oAuthAccessToken("", "")
	      .build();
		this.userName = this.twitter.v1().users().getAccountSettings().getScreenName();
		this.userID = this.twitter.v1().users().showUser(userName).getId();
		System.out.println(this.userName + " : " + userID);
		createGames();
	}
	public void run() throws TwitterException, InterruptedException {
		while (true) {
			updatePlayers();
			sendWelcomeMsg();
			getGameSelection();
			sendTestInstruction();
			getAnswer();
			TimeUnit.SECONDS.sleep(60);
		}
	}
	public void debug() throws TwitterException {
		Scanner console = new Scanner(System.in);
		String input;
		while (true) {			
			input = console.nextLine();
			switch(input) {
			  case "t":
				  GeoLocation test = GeoLocation.of(40.52477105, -3.7707802235079573);
				  System.out.println(test);
				  System.out.println(test.latitude + test.longitude);
			  case "pf":
			      printFollowers();
			      break;
			  case "pp":
				  printPlayers();
				  break;
			  case "pm":
				  printMessages();
				  break;
			  case "pt":
				  printTweets();
				  break;
			  case "up":
				  updatePlayers();
				  printPlayers();
				  break;
			  case "swm":
				  sendWelcomeMsg();
				  break;
			  case "ggs":
				  getGameSelection();
				  break;
			  case "sti":
				  sendTestInstruction();
				  break;
			  case "ga":
				  getAnswer();
				  break;
			  case "cc":
				  System.out.println("Stop\n");
				  console.close();
				  System.exit(0);
			  default:
				  System.out.println("INPUT");
			}
		}
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
		HashMap<Long, DirectMessage> messages = getNewDirectMessages();
		for (Long senderID : messages.keySet()) {
			System.out.println(senderID + " : " + messages.get(senderID).getText());
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
		HashMap<Long, Status> tweets = getMentionTweets();
		
		for (Long userID : tweets.keySet()) {
			Status tweet = tweets.get(userID);
			Location loc = extractLocation(tweet.getPlace().getFullName(), tweet.getPlace().getBoundingBoxCoordinates());
			System.out.println(tweet.getUser() + " : " + loc.latitude + ", " + loc.longitude + " : " + tweet.getCreatedAt() + " : " + tweet.getText());			
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
	private HashMap<Long, DirectMessage> getNewDirectMessages() throws TwitterException {
		  DirectMessageList messagesBatch;
		  DirectMessageList messages = twitter.v1().directMessages().getDirectMessages(20);
		  if (messages.isEmpty()) {
			  System.out.println("\t-API no msg");
			  return new HashMap<Long, DirectMessage>();
		  }
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
	      
	      HashMap<Long, DirectMessage> messages_map = new HashMap<Long, DirectMessage>();
	      // loop in reverse to get newest message of user
	      System.out.printf("\t-API %d messages\n", messages.size());
	      for (int i=messages.size()-1; i>=0; i--) {
	    	  DirectMessage message = messages.get(i);
	    	  //System.out.println("\t-msg from: " + twitter.v1().users().showUser(message.getSenderId()).getScreenName());
	    	  if (message.getCreatedAt().isAfter(msgTimestamp))
	    	  messages_map.put(message.getSenderId(), message);
	      }
	      msgTimestamp = messages.get(0).getCreatedAt();
	      return messages_map;
		}
	private HashMap<Long, Status> getMentionTweets() throws TwitterException {
		ResponseList<Status> tweets = twitter.v1().timelines().getMentionsTimeline();
		//System.out.println(tweets.size() + " Tweets with mentions.");
		HashMap<Long, Status> tweets_map = new HashMap<Long, Status>();
		// iterate backwards to get newest tweet
		for (int i=tweets.size()-1; i>=0; i--) {
			Status tweet = tweets.get(i);
			tweets_map.put(tweet.getUser().getId(), tweet);
		}
		return tweets_map;		
	}
	public void createGames() {
		StringBuilder sb = new StringBuilder();	
		sb.append(welcomeMessage);
		
		locations.put("Tuebingen", new Location("Tuebingen", 48.521637, 9.057645));
		locations.put("UAM", new Location("UAM", 40.5466989, -3.7139596));

		HashMap<String, Test> tests = new HashMap<String, Test>();
		
		tests.put("tue1", new Test("tue1", locations.get("Tuebingen"), "What is the main bridge through Tübingen called", Arrays.asList("Neckarbrücke;Neckarbruecke;".split(";")), Arrays.asList("It is the bridge over the main river.;The river is called \"Neckar\";".split(";")), 360, 3, 100,null, null, null));
		Test tueinit = new Test("tueinit", locations.get("Tuebingen"), "What is the official name of the Univerity of Tübingen?", Arrays.asList("Eberhard-Karls-Universität;Eberhard-Karls-Universitaet;".split(";")), Arrays.asList("It was founded 1477 by \"Eberhard im Bart\" also \"Karl Eugen\" plays a major role.;".split(";")), 360, 3, 100, tests.get("tue1"), null, null);
		Game tue = new Game("tue", tueinit, tests, "Tuebingen", "The first game in a small city in the south of germany");
		games.put(tue.getID(), tue);
		sb.append(tue.getID()).append(" - ").append(tue.getDescription()).append("\n\n");
		tests.clear();
		tests.put("uam1", new Test("uam1", locations.get("UAM"), "", Arrays.asList("Joseph Fourier;".split(";")), Arrays.asList("He invented one of the most important transformations for signals.;".split(";")), 360, 3, 100,null, null, null));
		Test uaminit = new Test("uaminit", locations.get("UAM"), "What person is mentioned on the top of the entrance from  \"Edificio A\"?", Arrays.asList("Alan Turing;".split(";")), Arrays.asList("He invented the Turing-Machine.;".split(";")), 360, 3, 100, tests.get("uam1"), null, null);
		Game uam = new Game("uam", uaminit, tests, "Madrid", "A small game at the UAM campus of madrid.");
		games.put(uam.getID(), uam);
		sb.append(uam.getID()).append(" - ").append(uam.getDescription()).append("\n\n");
		tests.clear();
		welcomeMessage = sb.toString();
	}
	public void updatePlayers() throws TwitterException {
		System.out.println("PU");
		ArrayList<Long> followers = getFollowerIDs(userID);
		for (Long followerID : followers) {
			if (!players.containsKey(followerID)) {
				Player player = new Player(followerID);
				players.put(followerID, player);
		        queueSendWelcomeMsg.add(player);
		        System.out.println("\t-" + twitter.v1().users().showUser(followerID).getScreenName());
			}
		}
		for (Long player : players.keySet()) {
			if (!followers.contains(player)) {
		        playersToDelete.add(players.get(player));
			}
		}
	}	
	public void sendWelcomeMsg() throws TwitterException {
		System.out.println("WM");
		while (!queueSendWelcomeMsg.isEmpty()) {
			
			Player player = queueSendWelcomeMsg.poll();
			if (playersToDelete.contains(player)) {
				continue;
			}
			twitter.v1().directMessages().sendDirectMessage(player.getID(), welcomeMessage);
			System.out.println("\t-" + twitter.v1().users().showUser(player.getID()).getScreenName());
			queueGetGameSelection.add(player);
		}
	}
	public void getGameSelection() throws TwitterException {
		System.out.println("GS");
		if (queueGetGameSelection.isEmpty()) {
			System.out.println("\t-queue empty");
			return;
		}
		
		HashMap<Long, DirectMessage> messages = getNewDirectMessages();
		
//		for (Long mID : messages.keySet()) {
//			System.out.printf("%d, %d%n", mID, messages.get(mID).getRecipientId());
//		}
		//System.out.printf("\t- %d messages\n", messages.size());
		if (messages.isEmpty()){return;}
		
		Long firstPlayer = queueGetGameSelection.peek().getID();
		Boolean alldone = false;
		while (!queueGetGameSelection.isEmpty() && !alldone) {
			Player player = queueGetGameSelection.poll();
			
			if (playersToDelete.contains(player)) {continue;}
			DirectMessage message = messages.get(player.getID());
			//System.out.println("\t-" + twitter.v1().users().showUser(player.getID()).getScreenName() + " : " + message);
			if (message == null || player.latestMessage == message.getId()) {
				queueGetGameSelection.add(player);
				alldone = interatedThroughQueue(queueGetGameSelection, firstPlayer);
				continue;
			}
			
			String selection = message.getText();
			player.latestMessage = message.getId();
			
			System.out.println("\t-answer: " + selection + " : " + twitter.v1().users().showUser(player.getID()).getScreenName());
			if (!games.containsKey(selection)) {
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Please send a correct game id.");
				queueGetGameSelection.add(player);
			}
			else {
				player.setGame(games.get(selection));
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "You selected: " + player.getGame().getID());
				queueSendTest.add(player);
			}
			
			alldone = interatedThroughQueue(queueGetGameSelection, firstPlayer);
		}
	}
	public void sendTestInstruction() throws TwitterException {
		System.out.println("TI");
		while (!queueSendTest.isEmpty()) {			
			Player player = queueSendTest.poll();
			
			if (player.getTest() == null) {
				player.getGame().setHighscore(player.getPoints());
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Congratulation, you finished the game with " + player.getPoints() + " points.\n" + "The highscore of this game is: " + player.getGame().getHighscore());
				player.setPoints(0);
				System.out.println("\t-done " + twitter.v1().users().showUser(player.getID()).getScreenName());
				queueSendWelcomeMsg.add(player);
				continue;
			}
			
			if (playersToDelete.contains(player)) {
				continue;
			}
			DirectMessage message = twitter.v1().directMessages().sendDirectMessage(player.getID(), player.getTest().getQuestion());
			player.setTimestamp(message.getCreatedAt().plusSeconds((long)player.getTest().getTimelimit()));
			player.setAttempts(player.getTest().getAttempts());
			System.out.println("\t-sent " + player.getGame().getID() + ":" + player.getTest().getID() + " " + twitter.v1().users().showUser(player.getID()).getScreenName());
			queueGetAnswer.add(player);
		}
	}
	public void getAnswer() throws TwitterException {
		System.out.println("GA");
		if (queueGetAnswer.isEmpty()) {
			System.out.println("\t-queue empty");
			return;
			}
		
		HashMap<Long, Status> answers = getMentionTweets();
		
		if (answers.isEmpty()){return;}
		
		Long firstPlayer = queueGetAnswer.peek().getID();
		Boolean alldone = false;
		while (!queueGetAnswer.isEmpty() && !alldone) {
			Player player = queueGetAnswer.poll();
			
			if (playersToDelete.contains(player)) {
				continue;
			}
			
			Status answer = answers.get(player.getID());
			if (player.latestTweet == answer.getId()) {
				System.out.println("\t-no answer " + twitter.v1().users().showUser(player.getID()).getScreenName());
				queueGetAnswer.add(player);
				alldone = interatedThroughQueue(queueGetAnswer, firstPlayer);
				continue;
			}
			
			if (answer.getPlace() == null) {
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "No location specified in tweet.");
				queueGetAnswer.add(player);
				alldone = interatedThroughQueue(queueGetAnswer, firstPlayer);
				continue;
			}
			
			System.out.println(answer.getId() + " : " + answer.getText());
			player.latestTweet = answer.getId();
			
			Boolean inTime = answer.getCreatedAt().isBefore(player.getTimestamp());
			Boolean atLocation = nearLocation(player.getTest().getLocation(), extractLocation(answer.getPlace().getFullName(), answer.getPlace().getBoundingBoxCoordinates()));
			Boolean correct = player.getTest().getAnswers().contains(answer.getText().split(";")[0]);
		
			if (!inTime) {
				System.out.println("M-Timeout");
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "You provided the answer to late.");
				player.setTest(player.getTest().getTestOnTimeout());
				queueSendTest.add(player);
			}
			else if (!atLocation) {
				System.out.println("M-WrongLoc");
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "You are not at the right location.");
				queueGetAnswer.add(player);
			}
			else if (!correct) {
				System.out.println("M-Incorrect");
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Your answer is incorrect.\n");
				
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Remaining attempts: " + player.getAttempts());
				
				
				int hintNo = player.getTest().getAttempts()-player.getAttempts();
				//System.out.printf("%d, %d, %d", player.getTest().getAttempts(), player.getAttempts(), hintNo);
				//System.out.print(!(player.getTest().getHints() == null));
				//System.out.print(hintNo<player.getTest().getHints().size());
				
				if (!(player.getTest().getHints() == null) && hintNo<player.getTest().getHints().size()) {
					twitter.v1().directMessages().sendDirectMessage(player.getID(), "Here is a hint:\n" + player.getTest().getHints().get(hintNo));
				}
				player.setAttempts(player.getAttempts()-1);
				if (player.getAttempts() == 0) {
					player.setTest(player.getTest().getTestOnFail());
					queueSendTest.add(player);
				}
				else {
					queueGetAnswer.add(player);
				}
			}
			else {
				System.out.println("M-Correct");
				player.setPoints(player.getPoints()+player.getTest().getReward());
				player.setTest(player.getTest().getTestOnCorrect());
				twitter.v1().directMessages().sendDirectMessage(player.getID(), "Congratulations! Your answer was correct.\nYour points: " + player.getPoints());
				queueSendTest.add(player);
			}
			alldone = interatedThroughQueue(queueGetAnswer, firstPlayer);
			sendTestInstruction();
		}
	}
	private Boolean interatedThroughQueue(Queue<Player> queue, Long playerID) {
		return queue.isEmpty() || queue.peek().getID() == playerID;
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
        // latitude and longitude are interchanged
        Location location = new Location(name, centroid[1], centroid[0]);
        return location;
    }
	private Boolean nearLocation(Location playerLoc, Location tweet) {
		double lonDiff = Math.abs(Math.abs(playerLoc.longitude) - Math.abs(tweet.longitude));
		double latDiff = Math.abs(Math.abs(playerLoc.latitude) - Math.abs(tweet.latitude));
		//System.out.println("Loc:" + playerLoc.longitude + ", " + playerLoc.latitude + " : " + tweet.longitude + ", " + tweet.latitude);
		//System.out.println("Loc-Diff: " + lonDiff + ", " + latDiff);
		return (lonDiff < 0.015 && latDiff < 0.015);
	}
}

