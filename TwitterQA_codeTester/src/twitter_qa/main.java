package twitter_qa;

import twitter4j.TwitterException;

public class main {	
	public static void main(String[] args) throws TwitterException{
	     
		System.out.println("Start");
		
		TwitterQA twitter_qa = new TwitterQA();
		twitter_qa.printFollowers();
		
		
//		DirectMessageList messagesBatch = twitter.v1().directMessages().getDirectMessages(20);
//		System.out.println(messagesBatch.getNextCursor());
//		for (DirectMessage m : messagesBatch) {
//			System.out.println(m.getText());
//		}
		
		System.out.println("Stop\n");
	}
}