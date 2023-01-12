package twitter_qa;

import java.time.LocalDateTime;

public class Tweet {
	public String screenname;
	public Location location;
	public LocalDateTime timestamp;
	public String text;
	public Tweet(String screenname, Location location, LocalDateTime timestamp, String text) {
		this.screenname = screenname;
		this.location = location;
		this.timestamp = timestamp;
		this.text = text;
	}
}
