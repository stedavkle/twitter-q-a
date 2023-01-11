package twitter_qa;

import java.util.List;

public class Game {
	  private String id;
	  private Test initialTest;
	  private List<Test> tests;
	  private String city;
	  private String description;

	  public Game(String id, Test initialTest, List<Test> tests, String city, String description) {
	    this.id = id;
	    this.initialTest = initialTest;
	    this.tests = tests;
	    this.city = city;
	    this.description = description;
	  }
	  public String getID() {
	    return id;
	  }
	  public Test getInitialTest() {
	    return initialTest;
	  }
	  public List<Test> getTests() {
	    return tests;
	  }
	  public String getCity() {
	    return city;
	  }
	  public String getDescription() {
	    return description;
	  }
	}
