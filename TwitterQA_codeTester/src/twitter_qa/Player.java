package twitter_qa;

public class Player {
	  private long id;
	  private int points;
	  private String gameID;
	  private String testID;

	  public Player(long id, int points, String gameID, String testID) {
	      this.id = id;
	      this.points = points;
	      this.gameID = gameID;
	      this.testID = testID;
	  }

	  public long getID() {
	    return id;
	  }
	  public void setID(long id) {
	    this.id = id;
	  }
	  public int getPoints() {
	    return points;
	  }
	  public void setPoints(int points) {
	    this.points = points;
	  }
	  public String getGameID() {
	    return gameID;
	  }
	  public void setGameID(String gameID) {
	    this.gameID = gameID;
	  }
	  public String getTestID() {
	    return testID;
	  }
	  public void setTestID(String testID) {
	    this.testID = testID;
	  }
	}
