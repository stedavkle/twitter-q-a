package twitter_qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import twitter4j.*;
import twitter4j.v1.*;

public class TwitterQA {
	@SuppressWarnings("unused")
	
	private Twitter twitter;
	private HashMap<Long, Player> players = new HashMap<Long, Player>();
	private long userID;
	private String userName;
	private String welcomeMessage = "Welcome to the Twitter Question&Answer game! \nPlease select one of the following games: \n\n";
	private List<Game> games = new ArrayList<Game>();
	
	public TwitterQA() throws TwitterException {
		this.twitter = Twitter.newBuilder()
	      .oAuthConsumer("nPty0JIv3o95dkuH7brLbYm7R", "nKfyaXeKEB0gb9QXU75C7meXlpIZMDOeW3GRrZ1NEnfYz5WqxH")
	      .oAuthAccessToken("339007027-dIc8sKZ1eOyQ59jgCL8eIrDcn9ukNuoTfgA4Jl6J", "WwnlVHwIO0RyGgm9UmOfusvJtkzQUtoNoJyJGhnyGTkO1")
	      .build();
		this.userName = this.twitter.v1().users().getAccountSettings().getScreenName();
		this.userID = this.twitter.v1().users().showUser(userName).getId();
		System.out.println(this.userName + " : " + userID);
	}
	
	public void printFollowers() throws TwitterException {
		System.out.println("FOLLOWERS");
		ArrayList<Long> ids = getFollowerIDs(userID);
		for (long id : ids) {
			User user = this.twitter.v1().users().showUser(id);
			System.out.println(user.getScreenName() + " : " + id);
		}
	}
	public void printMessages() throws TwitterException {
		System.out.println("MESSAGES");
		DirectMessageList messagesBatch = twitter.v1().directMessages().getDirectMessages(20);
		System.out.println(messagesBatch.getNextCursor());
		for (DirectMessage m : messagesBatch) {
			System.out.println(m.getId() + " : " + m.getRecipientId() + " : " + m.getText());
		}
	}
	public void printPlayers() throws TwitterException {
		System.out.println("PLAYERS");
		for (Long id : players.keySet()) {
			User user = this.twitter.v1().users().showUser(id);
			System.out.println(user.getScreenName() + " : " + id);
		}
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
	
	private List<DirectMessage> getNewDirectMessages() throws TwitterException {
		String cursor = "1";
		String prev_cursor;
	      // Create a list to store the messages
	      List<DirectMessage> messages = new ArrayList<DirectMessage>();

	      // Retrieve the messages in batches of 200
	      DirectMessageList messagesBatch;
	      do {
	        messagesBatch = twitter.v1().directMessages().getDirectMessages(20, cursor);
	        messages.addAll(messagesBatch);
	        prev_cursor = cursor;
	        cursor = messagesBatch.getNextCursor();
	      } while (!prev_cursor.equals(cursor));

	      return messages;
		}
	
	public void updatePlayers() throws TwitterException {
		ArrayList<Long> followers = getFollowerIDs(userID);
		for (Long followerID : followers) {
			if (!players.containsKey(followerID)) {
				Player player = new Player(followerID, -1, "", "");
		        players.put(followerID, player);
		        sendWelcomeMessage(followerID);
			}
		}
		for (Long player : players.keySet()) {
			if (!followers.contains(player)) {
		        players.remove(player);
			}
		}
	}
	
	private void sendWelcomeMessage(long userID) throws TwitterException {
		twitter.v1().directMessages().sendDirectMessage(userID, welcomeMessage);
	}
	
	public void createGames() {
		StringBuilder sb = new StringBuilder();
		
		Location tuebingen_stadt = new Location("Tübingen", 48.521637, 9.057645);
		Test tuebingen01 = new Test("0", tuebingen_stadt, "What is the official name of the Univerity of Tübingen?", Arrays.asList("Eberhard-Karls-Universität", "Eberhard-Karls-Universitaet"), null, 360, 3, 100, null, null, null);
		Game game = new Game("0", tuebingen01, null, "Tübingen", "The first game in a small city in the south of germany");
		this.games.add(game);
		sb.append(welcomeMessage).append(game.getID()).append(". \t").append(game.getDescription()).append("\n");
		welcomeMessage = sb.toString();
	}
}
