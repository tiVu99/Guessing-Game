import java.util.Scanner;

public class NumberGame {
	
	public static void main(String arg[]) {
		
		// Get a auto generated random number 
		// It will never equal to 0 since plus 1
		int randomNumber = (int) (Math.random()*100) +1;
		boolean hasWon = false;
		
		// Introduction to the game
		System.out.println("Welcome to the Guessing Game");
		System.out.println("Simple rule: Guess a random number between [1 , 100]");
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 5; i >= 0; i--) {
			
			System.out.println("You have " + i + " guess(es) left");
			
			// Zero guesses equal lose
			if (i == 0) {
				hasWon = false;
				break;
			}
			
			// Take user input for guessing
			int input = scanner.nextInt();
			
			if (randomNumber < input) {
				System.out.println("It's smaller than " + input);
			}
			
			else if (randomNumber > input) {
				System.out.println("It's larger than " + input);
			}
			
			else {
				hasWon = true;
				break;
			}
			
			
		}
			if (hasWon) {
				System.out.println("CONGRATS ... YOU WIN");
				System.out.println("PEACE");
			}
			else {
				System.out.println("GAME OVER ... YOU LOOSE");
				System.out.println("The random number is " + randomNumber);	
			}	
	}		
}
