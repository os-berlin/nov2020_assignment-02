package com.coderscampus.olaf.assignment02;

import java.util.Random;
import java.util.Scanner;

public class Assignment02Application {

	public static void main(String[] args) {
		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\"guess a number\" (this is fun!) \n------------------------------- \n");
		
		int guessCounter = 5;
		Boolean correctGuess = false;
		
		while (guessCounter > 0 && correctGuess == false) {
			System.out.print("\nPick a number between 1 and 100: ");
			int userInput = scanner.nextInt();
			
			if (userInput <= 0 || userInput >100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else if (userInput < numberToGuess) {
				System.out.println("Please pick a higher number");
			} else if (userInput > numberToGuess) {
				System.out.println("Please pick a lower number");
			} else {correctGuess = true;}
			
			guessCounter--;
		}
		
		if (correctGuess == true) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose!");
		}
		
		System.out.println("\nThe number to guess was: " + numberToGuess);
		
		scanner.close();
		

		
	}

}
