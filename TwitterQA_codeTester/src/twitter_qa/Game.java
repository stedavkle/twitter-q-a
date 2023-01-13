package twitter_qa;

import java.util.HashMap;

public class Game {
	  private String name;
	  private Test initialTest;
	  private HashMap<String, Test> tests;
	  private String city;
	  private String description;
	  private int highscore;

	  public Game(String name, Test initialTest, HashMap<String, Test> tests, String city, String description) {
	    this.name = name;
	    this.initialTest = initialTest;
	    this.tests = tests;
	    this.city = city;
	    this.description = description;
	    this.highscore = 0;
	  }
	  public String getID() {
	    return name;
	  }
	  public Test getInitialTest() {
	    return initialTest;
	  }
	  public HashMap<String, Test> getTests() {
	    return tests;
	  }
	  public String getCity() {
	    return city;
	  }
	  public String getDescription() {
	    return description;
	  }
	  public void setHighscore(int score) {
		  this.highscore = Math.max(highscore, score);
	  }
	  public int getHighscore() {
		  return this.highscore;
	  }
	}
