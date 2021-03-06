import java.util.Random;
import java.util.Scanner;

public class GamesRoom {
	public static void main(String[] args) {
		GamesRoom gamesRoom = new GamesRoom();
		System.out.println("Welcome to the games room, you can play Rock, Paper, Sicssors or take the last carrot. Would you like to play today?");
		    String gameToPlay = gamesRoom.getHumanPlayerChoiceYN();
		    while (!gameToPlay.toLowerCase().matches("y|n")) {
		        System.out.println("Invalid. Please enter y or n");
		        gameToPlay = gamesRoom.getHumanPlayerChoiceYN();
		    }
		    if (gameToPlay.toLowerCase().equals("y")) {
		        System.out.println("Okay");
		        gamesRoom.getHumanPlayerChoiceGame();
		    } else if (gameToPlay.toLowerCase().equals("n")) {
		        System.out.println("BORING!! Okay bye");
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
	
	public static void getHumanPlayerChoiceGame () {
		System.out.println("Okay so what game would you like to play?\n1. Rock, Paper, Scissors\n2. Take the last carrot against an idiot");
		String playerChoice = "error";
		while (!playerChoice.matches("1|2|3")) {
			playerChoice = GamesRoom.getHumanPlayerChoice123 ();
			if (playerChoice.equals("1")) {
				System.out.println("Okay, lets play Rock, Paper, Scissors.");
				GamesRoom.rockPaperScissorsStart ();
			}
			else if (playerChoice.equals("2")) {
				System.out.println("Okay, lets play Take the last carrot.");
				carrotGame = new GamesRoom.carrotGame ();
			}
			else if (playerChoice.equals("3")) {
				System.out.println("Sorry I need more code.");
			}
		}
	}
		

	public class carrotGame {
		int numberOfCarrots = 10;
				
	}
	
	public static String getHumanPlayerChoice123 () {
		String playerChoice = new Scanner(System.in).next();
		if (playerChoice.matches("1|2|3")) {
			return playerChoice;
			}
		else {
			System.out.println ("Sorry, that input was wrong. Enter 1, 2 or 3 only.");
			return "error";
		}	
	}
	
	public static String getComputerPlayerChoice123 () {
	    int intComputerChoice = new Random().nextInt(3) + 1;
	    String stringComputerChoice = Integer.toString(intComputerChoice);
	    return stringComputerChoice;
	}
	
	
	public static String getHumanPlayerChoiceYN () {
		System.out.println("Enter Y for Yes or N for No.");
		String playerChoice = new Scanner(System.in).next();
		if (playerChoice.matches("y|Y")) {
			return playerChoice;
			}
		else if (playerChoice.matches("n|N")) {
			return playerChoice;
			}
		else {
			System.out.println ("Sorry, that input was wrong.");
			return "error";
		}	
	}

	public static void rockPaperScissorsStart () {
		String playAgain = "y";
				while (!playAgain.equals("n")) {
					if (playAgain.equals("y")) {
						GamesRoom.playRockPaperScissorGame ();
			}
						System.out.println("Want to play again?");
						playAgain = GamesRoom.getHumanPlayerChoiceYN();
		}
	}
	public static void playRockPaperScissorGame () {
		System.out.println("Choose 1 for rock 2 for paper and 3 for scissors.");
		String humanChoice = GamesRoom.getHumanPlayerChoice123();
		String humanPlay = GamesRoom.getRockPaperScissors(humanChoice);
		String computerChoice = GamesRoom.getComputerPlayerChoice123();
		String computerPlay = GamesRoom.getRockPaperScissors(computerChoice);
		System.out.print("You have chosen " + humanPlay + " and the computer has chosen " + computerPlay + ", ");
		GamesRoom.getRockPaperScissorsWinner(humanPlay, computerPlay);
	}
	
	
	// This is very long, there must be a way to chop it down.
	public static void getRockPaperScissorsWinner (String humanPlay, String computerPlay) {
		if (humanPlay.equals(computerPlay)) {
			System.out.println("draw.");
		}
		else if (humanPlay.equals("rock")) {
			if (computerPlay.equals("scissors")) {
				System.out.println("you win the game!");
			}
			else {
				System.out.println("you loose the game.");
			}
		}
		else if (humanPlay.equals("paper")) {
			if (computerPlay.equals("rock")) {
				System.out.println("you win the game!");
			}
			else {
				System.out.println("you loose the game.");
			}
		}
		else if (humanPlay.equals("scissors")) {
			if (computerPlay.equals("paper")) {
				System.out.println("you win the game!");
			}
			else {
				System.out.println("you loose the game.");
			}
		}
		else { 
			System.out.println("something went wrong");
			}
		}
	
	public static String getRockPaperScissors (String choice) {
		System.out.println("The computer is thinking.");
		String computerChoice = choice;
		if (computerChoice.equals("1")) {
			return "rock";
		}
		else if (computerChoice.equals("2")) {
			return "paper";
		}
		else if (computerChoice.equals("3")) {
			return "scissors";
		}
		else {
			return "error";
		}
	}
}

	
	


