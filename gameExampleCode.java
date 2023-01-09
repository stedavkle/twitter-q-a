import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.ArrayList;
import java.util.List;

public class twitter_qa {
  // Static variable for the main account name
  private static final String MAIN_ACCOUNT = "accountName";
  // Create a list to store the Player objects
  private List<Player> players = new ArrayList<Player>();

  public static void main(String[] args) throws TwitterException {
    Twitter twitter = getTwitterInstance();
  }

  public static Twitter getTwitterInstance(){
    // Set up the Twitter4J configuration
    ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setDebugEnabled(true)
      .setOAuthConsumerKey("consumerKey")
      .setOAuthConsumerSecret("consumerSecret")
      .setOAuthAccessToken("accessToken")
      .setOAuthAccessTokenSecret("accessTokenSecret");
    TwitterFactory tf = new TwitterFactory(cb.build());
    Twitter twitter = tf.getInstance();
    return twitter;
  }

  public static List<User> getFollowers(Twitter twitter, String screenName) throws TwitterException {
    // Set the initial cursor value to -1 to get the first batch of followers
    long cursor = -1;

    // Create a list to store the followers
    List<User> followers = new ArrayList<User>();

    // Retrieve the followers in batches of 200
    PagableResponseList<User> followersBatch;
    do {
      followersBatch = twitter.getFollowersList(screenName, cursor, 200);
      followers.addAll(followersBatch);
      cursor = followersBatch.getNextCursor();
    } while (followersBatch.hasNext());

    return followers;
  }

  public static void sendDirectMessage(Twitter twitter, String screenName, String messageText) throws TwitterException {
    // Create a new direct message
    DirectMessage message = new DirectMessage();
    message.setText(messageText);

    // Set the recipient of the message
    message.setRecipientScreenName(screenName);

    // Send the message
    twitter.sendDirectMessage(message);
  }

  public static List<DirectMessage> getNewDirectMessages(Twitter twitter) throws TwitterException {
      // Set the initial cursor value to 0 to get the first batch of messages
      long cursor = 0;

      // Create a list to store the messages
      List<DirectMessage> messages = new ArrayList<DirectMessage>();

      // Retrieve the messages in batches of 200
      DirectMessageList messagesBatch;
      do {
        messagesBatch = twitter.getDirectMessages(200, cursor);
        messages.addAll(messagesBatch);
        cursor = messagesBatch.getNextCursor();
      } while (messagesBatch.hasNext());

      return messages;
  }

  public static void sendWelcomeMessageToNewFollowers(Twitter twitter, String welcomeMessage) throws TwitterException {
    // Get the list of the authenticated user's followers
    List<User> followers = getFollowers(twitter, twitter.getScreenName());
    // Get the list of the authenticated user's friends (people they are following)
    List<User> friends = getFollowers(twitter, twitter.getScreenName());

    // Iterate through the list of followers
    for (User follower : followers) {
      // Check if the follower is not in the list of friends (i.e., they are a new follower)
      if (!friends.contains(follower)) {
        // Send the welcome message to the new follower
        sendDirectMessage(twitter, follower.getScreenName(), welcomeMessage);
        // Create a new Player object for the follower
        Player player = new Player(follower.getScreenName(), -1, -1, -1);
        // Add the Player object to the list of players
        this.players.add(player);
      }
    }
  }
}

public class Player {
  private String screenName;
  private int points;
  private int gameID;
  private int testID;

  public Player(String screenName, int points, int gameID, int testID) {
      this.screenName = screenName;
      this.points = points;
      this.gameID = gameID;
      this.testID = testID;
  }

  public String getScreenName() {
    return screenName;
  }
  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }
  public int getPoints() {
    return points;
  }
  public void setPoints(int points) {
    this.points = points;
  }
  public int getGameID() {
    return gameID;
  }
  public void setGameID(int gameID) {
    this.gameID = gameID;
  }
  public int getTestID() {
    return testID;
  }
  public void setTestID(int testID) {
    this.testID = testID;
  }
}

public class Location {
  public String name;
  public double longitude;
  public double latitude;

  public Location(String name, double longitude, double latitude) {
    this.name = name;
    this.longitude = longitude;
    this.latitude = latitude;
  }
}


public enum TestType {
  INITIAL("INIT"), INTERMEDIATE("INTER"), FINAL("FIN");
  private TestType(String abbreviation) {
    this.abbreviation = abbreviation;
  }
}

public class Test {
  private int id;
  private TestType type;
  private String location;
  private int timeLimit;
  private String question;
  private List<String> possibleAnswers;
  private int numAttempts;
  private List<String> hints;
  private int points;
  private Test nextTestCorrect;
  private Test nextTestIncorrect;
  private Test nextTestFail;

  public Test(int id, TestType type, String location, int timeLimit, String question, List<String> possibleAnswers, int numAttempts,
            List<String> hints, int points, Test nextTestCorrect, Test nextTestIncorrect, Test nextTestFail) {
    this.id = id;
    this.type = type;
    this.location = location;
    this.timeLimit = timeLimit;
    this.question = question;
    this.possibleAnswers = possibleAnswers;
    this.numAttempts = numAttempts;
    this.hints = hints;
    this.points = points;
    this.nextTestCorrect = nextTestCorrect;
    this.nextTestIncorrect = nextTestIncorrect;
    this.nextTestFail = nextTestFail;
  }
  public int getID() {
    return id;
  }
  public String getLocation() {
      return location;
  }
  public int getTimeLimit() {
      return timeLimit;
  }
  public String getQuestion() {
      return question;
  }
  public List<String> getPossibleAnswers() {
      return possibleAnswers;
  }
  public int getNumAttempts() {
      return numAttempts;
  }
  public List<String> getHints() {
      return hints;
  }
  public int getPoints() {
      return points;
  }
  public Test getNextTestCorrect() {
      return nextTestCorrect;
  }
  public Test getNextTestIncorrect() {
      return nextTestIncorrect;
  }
  public Test getNextTestFail() {
      return nextTestFail;
  }
}

public class Game {
  private int id;
  private Test initialTest;
  private List<Test> finalTests;
  private int timeLimit;
  private int numAttempts;

  public Game(int id, Test initialTest, List<Test> finalTests, int timeLimit, int numAttempts) {
    this.id = id;
    this.initialTest = initialTest;
    this.finalTests = finalTests;
    this.timeLimit = timeLimit;
    this.numAttempts = numAttempts;
  }
  public int getID() {
    return id;
  }
  public Test getInitialTest() {
    return initialTest;
  }
  public List<Test> getFinalTests() {
    return finalTests;
  }
  public int getTimeLimit() {
    return timeLimit;
  }
  public int getNumAttempts() {
    return numAttempts;
  }
}