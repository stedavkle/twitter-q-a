package twitter_qa;

import java.time.LocalDateTime;

public class Player {
	  private long id;
	  private int points;
	  private Game game;
	  private Test test;
	  private LocalDateTime timestamp;
	  private Location nextLocation;
	  private int attempts;

	  public Player(long id) {
	      this.id = id;
	      this.points = 0;
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
	  public Game getGame() {
		  return game;
	  }
	  public void setGame(Game game) {
		  this.game = game;
		  this.test = game.getInitialTest();
	  }
	  public Test getTest() {
		  return test;
	  }
	  public void setTest(Test test) {
		  this.test = test;
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
