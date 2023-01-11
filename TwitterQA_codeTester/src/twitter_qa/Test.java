package twitter_qa;

import java.util.List;

public class Test {
	  private String id;
	  private Location location;
	  private String question;
	  private List<String> answers;
	  private List<String> hints;
	  private int timelimit;
	  private int attempts;
	  private int reward;
	  private Test on_correct;
	  private Test on_timeout;
	  private Test on_fail;

	  public Test(String id, Location location, String question, List<String> answers, List<String> hints, int timelimit, int attempts, int reward, Test on_correct, Test on_timeout, Test on_fail) {
	    this.id = id;
	    this.location = location;
	    this.question = question;
	    this.answers = answers;
	    this.hints = hints;
	    this.timelimit = timelimit;
	    this.attempts = attempts;
	    this.reward = reward;
	    this.on_correct = on_correct;
	    this.on_timeout = on_timeout;
	    this.on_fail = on_fail;
	  }
	  public String getID() {
	    return id;
	  }
	  public Location getLocation() {
	      return location;
	  }
	  public int getTimelimit() {
	      return timelimit;
	  }
	  public String getQuestion() {
	      return question;
	  }
	  public List<String> getAnswers() {
	      return answers;
	  }
	  public int getAttempts() {
	      return attempts;
	  }
	  public List<String> getHints() {
	      return hints;
	  }
	  public int getreward() {
	      return reward;
	  }
	  public Test getTestOnCorrect() {
	      return on_correct;
	  }
	  public Test getTestOnTimeout() {
	      return on_timeout;
	  }
	  public Test getTestOnFail() {
	      return on_fail;
	  }
	}
