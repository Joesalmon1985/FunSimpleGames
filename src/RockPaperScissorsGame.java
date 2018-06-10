import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main( String[] args ) {
		// The choice of the player as 1,2 or 3 for rock, paper or scissors.
		int playerChoice;
		// The choice of the computer as 1,2 or 3 for rock, paper or scissors.
		int computerChoice;
		
		// This generates the random number used for the computer choice
		Random rnd = new Random();  // Hey, I did use rnd... but its not an int.
		computerChoice = rnd.nextInt(3) + 1;  // returns int in the range [0, 3)
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Choose rock paper scissors\n 1= Rock,\n 2= Paper \n 3= Scissors");
		playerChoice = RockPaperScissors.getplayerChoice();
		if ( playerChoice == 1 ) {
			System.out.println ( "You chose Rock" );
			if (computerChoice == 1 ) {
				System.out.println ( "The computer chose Rock, the game is a draw");
			}
			else if (computerChoice == 2) {
				System.out.println ( "The computer chose Paper, you loose!");
			}
			else {
				System.out.println ("The computer chose Scissors, you win!");
			
			}
		}
		else if ( playerChoice == 2 ) {
			System.out.println ( "You chose Paper" );
			if (computerChoice == 1 ) {
				System.out.println ( "The computer chose Rock, the game is a win for you");
			}
			else if (computerChoice == 2) {
				System.out.println ( "The computer chose Paper, you draw with the computer.");
			}
			else {
				System.out.println ("The computer chose Scissors, you loose the game!");
			
			}
		}
		else if ( playerChoice == 3 ) {
			System.out.println ( "You chose Scissors" );
			if (computerChoice == 1 ) {
				System.out.println ( "The computer chose Rock, the game is a loss for you");
			}
			else if (computerChoice == 2) {
				System.out.println ( "The computer chose Paper, you beat with the computer!.");
			}
			else {
				System.out.println ("The computer chose Scissors, you draw the game!");
			
			}
		}
		else {
			System.out.print("you have not made a valid selection. The game won't work");
   	
		}
	}
	public static int getplayerChoice() {
		Scanner keyboard = new Scanner(System.in);
		int playerChoice;
		playerChoice = keyboard.nextInt();
			if (playerChoice == 1) {
				return playerChoice;
				}
			else {
				System.out.println ("Make a valid selection");
				return 0;
			}
	}
}