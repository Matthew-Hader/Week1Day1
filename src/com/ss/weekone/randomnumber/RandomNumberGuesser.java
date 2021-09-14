package com.ss.weekone.randomnumber;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Matthew Hader
 *
 */
public class RandomNumberGuesser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Generate random number between 1-100
		Random random = new Random();
		int randomNumber = (random.nextInt((100 - 1) + 1) + 1);
		
		Scanner scan = new Scanner(System.in);
		int userGuess = 0;
		
		//Ask user to guess if attemptNumber <= 5
		//Otherwise, show number
		for(int attemptNumber = 1; attemptNumber <= 5; attemptNumber++) {
			System.out.print("Guess a number between 1-100: ");
			userGuess = scan.nextInt();
			
			//Check if user guess is close enough
			if((userGuess - randomNumber) >= -10 && (userGuess - randomNumber) <= 10) {
				//Print number and exit loop
				System.out.printf("The correct answer was %d\n", randomNumber);
				attemptNumber += 10;
			} 
			//If user does not guess correctly after 5 attempts, show the answer
			else if(attemptNumber == 5) {
				System.out.printf("Sorry, the correct answer was %d\n", randomNumber);
			}
		}
	}

}
