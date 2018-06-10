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
			GamesRoom.GetHumanPlayerChoiceGame ();
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
	public static void GetHumanPlayerChoiceGame () {
		System.out.println("Okay so what game would you like to play?\n1. Rock, Paper, Scissors\n2. Take the last carrot");
		String playerChoice = "error";
		while (playerChoice.equals("error")) {
			playerChoice = GamesRoom.GetHumanPlayerChoice123 ();
		}
		System.out.println("Sadly I need more code");
	}
	public static String GetHumanPlayerChoice123 () {
		System.out.println("Enter 1, 2 or 3 only.");
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
			System.out.println ("Sorry, that input was wrong.");
			return "error";
		}	
	}
	public static String GetHumanPlayerChoiceYN () {
		System.out.println("Enter Y for Yes or N for No.");
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
			System.out.println ("Sorry, that input was wrong.");
			return "error";
		}	
	}
}
