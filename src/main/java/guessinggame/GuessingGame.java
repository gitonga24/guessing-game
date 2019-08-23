package guessinggame;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to guessing game");
		System.out.println("Make a guess");
		
		Scanner input = new Scanner (System.in);
		int guess = input.nextInt();
		
		if (guess == 0) {
			System.out.println("Guess another number");
		}
		

	}

}
