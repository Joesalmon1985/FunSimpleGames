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
		System.out.println("Okay so what game would you like to play?\n1. Rock, Paper, Scissors\n2. Take the last carrot");
		String playerChoice = "error";
		while (!playerChoice.matches("1|2|3")) {
			playerChoice = GamesRoom.getHumanPlayerChoice123 ();
			if (playerChoice.equals("1")) {
				System.out.println("Okay, lets play Rock, Paper, Scissors.");
				GamesRoom.rockPaperScissorsStart ();
			}
			else if (playerChoice.equals("2")) {
				System.out.println("Okay, lets play Take the last carrot.");
				GamesRoom.carrotStart ();
			}
			else if (playerChoice.equals("3")) {
				System.out.println("Sorry I need more code.");
			}
		}
	}
	
	// This method is 10 lines long, I can't figure out how to split it into 5 lines.
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
		
//		Old stuff
	    
//		String stringComputerChoice;
//		int intComputerChoice;
//		Random rnd = new Random();
//		intComputerChoice = rnd.nextInt(3) + 1;
//		stringComputerChoice = Integer.toString(intComputerChoice);
//		return stringComputerChoice;
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
	public static void carrotStart () {
		String playAgain = "y";
				while (!playAgain.equals("n")) {
					if (playAgain.equals("y")) {
						GamesRoom.playCarrotGame ();
			}
						System.out.println("Want to play again?");
						playAgain = GamesRoom.getHumanPlayerChoiceYN();
		}
	}
	public static void playCarrotGame () {
		int carrots = 10, humanCarrotTake, computerCarrotTake;
		String humanChoice, computerChoice, talkCarrots;
		System.out.println("The winner is the one to take the final carrot.");
		while (carrots > 0) {
			talkCarrots = Integer.toString(carrots);
			System.out.println("There are " + talkCarrots+ " carrots left.");
			System.out.println("How many carrots would you like to take?");
			humanChoice = GamesRoom.getHumanPlayerChoice123();
			humanCarrotTake = Integer.valueOf(humanChoice);
			while (humanCarrotTake > carrots) {
				talkCarrots = Integer.toString(carrots);
				System.out.println("No, you can't take that many, there are only " + talkCarrots + " left.");
				humanChoice = GamesRoom.getHumanPlayerChoice123();
				humanCarrotTake = Integer.valueOf(humanChoice);
			}
			carrots = carrots - humanCarrotTake;
			if (carrots == 0) {
				System.out.println("You've WON!");
			}
			else {
				computerChoice = GamesRoom.getComputerPlayerChoice123();
				computerCarrotTake = Integer.valueOf(computerChoice);
				while (computerCarrotTake > carrots) {
					System.out.println("The computer is thinking.");
					computerChoice = GamesRoom.getComputerPlayerChoice123();
					computerCarrotTake = Integer.valueOf(computerChoice);
				}
				System.out.println("The computer wants to take " + computerCarrotTake);
				carrots = carrots - computerCarrotTake;
				if (carrots == 0) {
					System.out.println("You've lost.");
				}
			}
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

	
	


