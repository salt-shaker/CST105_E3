package randomNumberGame;

import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		boolean cLoop = true;
		boolean clf = true;
		int answer = 0;

		int random = (int) (Math.random() * 10000 + 1);

		// Input Object
		Scanner input = new Scanner(System.in);

		System.out.println("Please pick a number between 1 and 10,000 ");

		// Main Loop
		while (cLoop) {

			// Validation Logic
			try {
				clf = true;
				answer = input.nextInt();
			} catch (java.util.InputMismatchException e) {
				cLoop = true;
				clf = false;
				System.out.println("Please enter a valid input. Numbers Only.");
				input.nextLine();
			}

			// Process input and determine if match found
			if (answer < 0 || answer > 10000) {
				cLoop = true;
			} else if (answer < random && clf == true) {
				System.out.println("Guess higher");
			} else if (answer > random && clf == true) {
				System.out.println("Guess lower");
			}
			
			if (answer == random) {
				cLoop = false;
				System.out.println("You Win!");
			}
		}

		input.close();
	}

}
