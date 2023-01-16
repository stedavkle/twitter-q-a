package twitter_qa;


import twitter4j.TwitterException;

public class main {	
	public static void main(String[] args) throws TwitterException, InterruptedException{
	     
		System.out.println("Start");
		
		
		TwitterQA twitter_qa = new TwitterQA();
		twitter_qa.run();
		//twitter_qa.debug();
	}
}