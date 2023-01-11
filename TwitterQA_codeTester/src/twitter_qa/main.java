package twitter_qa;

import java.util.Scanner;

import twitter4j.TwitterException;

public class main {	
	public static void main(String[] args) throws TwitterException{
	     
		System.out.println("Start");
		Scanner console = new Scanner(System.in);
		
		TwitterQA twitter_qa = new TwitterQA();
		
		twitter_qa.createGames();
		
		//twitter_qa.printFollowers();
		//twitter_qa.printMessages();
		console.next();
		twitter_qa.updatePlayers();
		twitter_qa.printPlayers();
		console.next();
		twitter_qa.updatePlayers();
		twitter_qa.printPlayers();
		
		System.out.println("next");
		console.next();
		
		System.out.println("Stop\n");
	}
}