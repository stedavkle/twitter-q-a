package twitter_qa;

import java.util.Scanner;

import twitter4j.TwitterException;
import twitter4j.v1.GeoLocation;

public class main {	
	public static void main(String[] args) throws TwitterException{
	     
		System.out.println("Start");
		Scanner console = new Scanner(System.in);
		String input;
		
		TwitterQA twitter_qa = new TwitterQA();
		
		// rate limit for message retrieval 1/minute
		while (true) {
			input = console.nextLine();
			switch(input) {
			  case "t":
				  GeoLocation test = GeoLocation.of(40.52477105, -3.7707802235079573);
				  System.out.println(test);
				  System.out.println(test.latitude + test.longitude);
			  case "pf":
			      twitter_qa.printFollowers();
			      break;
			  case "pp":
				  twitter_qa.printPlayers();
				  break;
			  case "pm":
				  twitter_qa.printMessages();
				  break;
			  case "pt":
				  twitter_qa.printTweets();
				  break;
			  case "cg":
				  twitter_qa.createGames();
				  break;
			  case "up":
				  twitter_qa.updatePlayers();
				  twitter_qa.printPlayers();
				  break;
			  case "swm":
				  twitter_qa.sendWelcomeMsg();
				  break;
			  case "ggs":
				  twitter_qa.getGameSelection();
				  break;
			  case "sti":
				  twitter_qa.sendTestInstruction();
				  break;
			  case "cc":
				  System.out.println("Stop\n");
				  System.exit(0);
			  default:
				  System.out.println("INPUT");
				  System.out.println("pf : pp : pm : pt : cg : up : cc\n");
			}
		}
	}
}