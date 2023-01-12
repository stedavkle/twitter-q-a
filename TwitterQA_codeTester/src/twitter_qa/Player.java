package twitter_qa;

import java.time.LocalDateTime;

public class Player {
	  private long id;
	  private int points;
	  private String gameID;
	  private String test;
	  private LocalDateTime timestamp;
	  private Location nextLocation;
	  private int attempts;

	  public Player(long id) {
	      this.id = id;
	      this.points = 0;
	      this.gameID = "";
	      this.test = "";
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
		  return test;
	  }
	  public void setTestID(String testID) {
		  this.test = testID;
	  }
	  public LocalDateTime getTimestamp() {
		  return timestamp;
	  }
	  public void setTimestamp(LocalDateTime timestamp) {
		  this.timestamp = timestamp;
	  }
	  public Location getNextLocation() {
		  return nextLocation;
	  }
	  public void setNextLocation(Location location) {
		  this.nextLocation = location;
	  }
	  public int getAttempts() {
		  return attempts;
	  }
	  public void setAttempts(int attempts) {
		  this.attempts = attempts;
	  }
	}
