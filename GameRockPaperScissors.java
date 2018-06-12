
public class GameRockPaperScissors {

	public static void main(String[] args) {
		String playAgain = "y";
				while (!playAgain.equals("n")) {
					if (playAgain.equals("y")) {
						GameRockPaperScissors.playGame ();
			}
						System.out.println("Want to play again?");
						playAgain = GamesRoom.getHumanPlayerChoiceYN();
		}
	}
	public static void playGame () {
		String humanChoice = GameRockPaperScissors.getHumanPlayerChoice(); 
		String computerChoice = GameRockPaperScissors.getComputerPlayerChoice();
		System.out.print("You have chosen " + humanChoice + " and the computer has chosen " + computerChoice + ", ");
		if (humanChoice.equals(computerChoice)) {
			System.out.println("draw.");
		}
		else if (humanChoice.equals("rock")) {
			if (computerChoice.equals("scissors")) {
				System.out.println("you win the game!");
			}
			else {
				System.out.println("you loose the game.");
			}
		}
		else if (humanChoice.equals("paper")) {
			if (computerChoice.equals("rock")) {
				System.out.println("you win the game!");
			}
			else {
				System.out.println("you loose the game.");
			}
		}
		else if (humanChoice.equals("scissors")) {
			if (computerChoice.equals("paper")) {
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
	public static String getComputerPlayerChoice () {
		System.out.println("The computer is thinking.");
		String computerChoice = "error";
		while (computerChoice.equals("error")) {
			computerChoice = GamesRoom.getComputerPlayerChoice123 ();
		}
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
	
	public static String getHumanPlayerChoice () {
		System.out.println("Choose 1 for Rock, 2 for Paper or 3 for Scissors");
		String playerChoice = "error";
		while (playerChoice.equals("error")) {
			playerChoice = GamesRoom.getHumanPlayerChoice123 ();
		}
		if (playerChoice.equals("1")) {
			return "rock";
		}
		else if (playerChoice.equals("2")) {
			return "paper";
		}
		else if (playerChoice.equals("3")) {
			return "scissors";
		}
		else {
			return "error";	
		}
	}

}
