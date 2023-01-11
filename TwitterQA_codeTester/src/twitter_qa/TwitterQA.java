package twitter_qa;

import java.util.ArrayList;
import java.util.List;

import twitter4j.*;
import twitter4j.v1.*;

public class TwitterQA {
	@SuppressWarnings("unused")
	
	private Twitter twitter;
	private ArrayList<Player> players;
	private long userID;
	
	public TwitterQA() throws TwitterException {
		this.twitter = Twitter.newBuilder()
	      .oAuthConsumer("nPty0JIv3o95dkuH7brLbYm7R", "nKfyaXeKEB0gb9QXU75C7meXlpIZMDOeW3GRrZ1NEnfYz5WqxH")
	      .oAuthAccessToken("339007027-dIc8sKZ1eOyQ59jgCL8eIrDcn9ukNuoTfgA4Jl6J", "WwnlVHwIO0RyGgm9UmOfusvJtkzQUtoNoJyJGhnyGTkO1")
	      .build();
		this.userID = this.twitter.v1().users().showUser(this.twitter.v1().users().getAccountSettings().getScreenName()).getId();
		System.out.println(Version.getVersion());
	}
	
	public void printFollowers() throws TwitterException {
		ArrayList<Long> ids = getFollowerIDs(339007027);
		for (long id : ids) {
			System.out.println(id);
			User user = this.twitter.v1().users().showUser(id);
			System.out.println(user.getName());
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
				System.out.println(twitter.v1().users().showUser(id).getScreenName());
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
	
	private void updatePlayers() throws TwitterException {
		ArrayList<Long> followers = getFollowerIDs(this.userID);
	}
	
	private void sendWelcomeMessageToNewFollowers(String welcomeMessage) throws TwitterException {
	    // Get the list of the authenticated user's followers
	    ArrayList<Long> followers = getFollowerIDs(339007027);
	    // Get the list of the authenticated user's friends (people they are following)
	    ArrayList<Long> friends = this.getFriendsIDs(339007027);

	    // Iterate through the list of followers
	    for (long follower : followers) {
	      // Check if the follower is not in the list of friends (i.e., they are a new follower)
	      if (!friends.contains(follower)) {
	        // Send the welcome message to the new follower
	    	  System.out.println(twitter.v1().users().showUser(follower).getName());
	    	  
	      //  sendDirectMessage(follower, welcomeMessage);
	        // Create a new Player object for the follower
	        Player player = new Player(follower, -1, "", "");
	        // Add the Player object to the list of players
	        this.players.add(player);
	      }
	    }
	  }
	
	private ArrayList<Long> intersection(ArrayList<Long> list1, ArrayList<Long> list2) {
		ArrayList<Long> list = new ArrayList<Long>();

        for (Long t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }
        return list;
    }
	
}
