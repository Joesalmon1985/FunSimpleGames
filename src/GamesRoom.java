import java.util.Random;
import java.util.Scanner;

public class GamesRoom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gameToPlay = "error";
		System.out.println("Welcome to the games room, we only have Rock Paper Scissors, would you like to play that today?");
		while (gameToPlay.equals("error")) {
			gameToPlay = GetHumanPlayerChoiceYN();
		}
		if (gameToPlay.equals("y")) {
			System.out.println("Okay");
		}
		else if (gameToPlay.equals("n")) {
			System.out.println("BORING!! Okay bye");
		}
		else {
			System.out.println("I'm very confused!!");
		}
	
	}
	public class HumanPlayer {
		String humanPlayerName, playChoice;
		int humanGamesWon, humanGamesLost;
		
	}
	public class ComputerPlayer {
		String computerPlayerName, computerPlayChoice;
		int computerGamesWon, computerGamesLost;
		
	}
	public static String GetHumanPlayerChoice123 () {
		System.out.println("Make your selection.");
		Scanner keyboard = new Scanner(System.in);
		String playerChoice;
		playerChoice = keyboard.next();
		if (playerChoice.equals("1")) {
			return playerChoice;
			}
		else if (playerChoice.equals("2")) {
			return playerChoice;
			}
		else if (playerChoice.equals("3")) {
			return playerChoice;
			}

		else {
			System.out.println ("Make a valid selection");
			return "error";
		}	
	}
	public static String GetHumanPlayerChoiceYN () {
		System.out.println("Make your selection.");
		Scanner keyboard = new Scanner(System.in);
		String playerChoice;
		playerChoice = keyboard.next();
		if (playerChoice.equals("y")) {
			return playerChoice;
			}
		else if (playerChoice.equals("Y")) {
			return "y";
			}
		else if (playerChoice.equals("N")) {
			return "n";
			}
		else if (playerChoice.equals("n")) {
			return playerChoice;
			}
		else {
			System.out.println ("Make a valid selection");
			return "error";
		}	
	}
}
