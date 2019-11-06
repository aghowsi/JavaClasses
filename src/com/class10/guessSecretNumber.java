package com.class10;

import java.util.Scanner;
 class guessSecretNumber {
	public static void main(String[] args) {
        
		
		/*Write a guessing game where the user has to guess a secret number between 1 and 20
		 * 
		 * 
		 */
		Scanner scan;
		int secretNumber, guessNumber;

		scan = new Scanner(System.in);
		secretNumber = 12;
		// for (int i=0; i<20; i++) -> you are limiting user to 20 inputs
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber = scan.nextInt();

			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		} while (guessNumber != secretNumber);

		System.out.println("Congratulations you got it");
	}
}
