package main;

import java.util.Scanner;

import print.Print;

public class Main {
	
	private static Match match;
	private static Scanner scanner;
	
	public static void main(String[] args) throws InterruptedException{

		scanner = new Scanner(System.in);
		
		/* match intro */
		Print.println("Realized by Daniele Mainella in 02/03/2020. All rights reserved.");
		Print.println();
		Thread.sleep(1000);
		Print.println("Hello, let's play chess!");
		Print.println("In this game a player plays with white (UPPER CASE) "
				+ "and onother player with black (lower case)");
		Print.println("I can't play so far... :(");
		Print.print("But I can speak to you! Say hello to me and we can start: ");
		String hi = scanner.nextLine();
		Thread.sleep(200);
		Print.println(hi + ", you too!\n\n");
		Thread.sleep(1000);
		
		/* start match */
		match = new Match();
		
		/* play until match isn't over */
		while(!match.isEnded()){
			boolean right = false;
			while(!right){
				match.getBoard().printBoard();
				String move;
				if (match.isWhiteTurn()){
					Print.print("WHITE turn! Digit your move: ");
					move = scanner.nextLine();
				}
				else{
					Print.print("BLACK turn! Digit your move: ");
					move = scanner.nextLine();
				}
				right = match.play(move);
				if (!right){
					Print.print("Invalid move, digit a valid one:");
					move = scanner.nextLine();
				}
			}
		}

		Print.println("\n\n=========== MATCH ENDED ===========\n");
		Thread.sleep(500);
		Print.println("I hope you enjoyed!");
		Thread.sleep(500);
		Print.print("See you next!");
		
	}

}
