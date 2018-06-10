
public class GameCarrot {
	public static void main(String[] args) {
		String playAgain = "y";
				while (!playAgain.equals("n")) {
					if (playAgain.equals("y")) {
						GameCarrot.PlayGame ();
			}
						System.out.println("Want to play again?");
						playAgain = GamesRoom.GetHumanPlayerChoiceYN();
		}
	}
	public static void PlayGame () {
		int carrots = 10, humanCarrotTake, computerCarrotTake;
		String humanChoice, computerChoice, talkCarrots;
		System.out.println("The winner is the one to take the final carrot.");
		while (carrots > 0) {
			talkCarrots = Integer.toString(carrots);
			System.out.println("There are " + talkCarrots);
			System.out.println("How many carrots would you like to take?");
			humanChoice = GamesRoom.GetHumanPlayerChoice123();
			humanCarrotTake = Integer.valueOf(humanChoice);
			while (humanCarrotTake > carrots) {
				talkCarrots = Integer.toString(carrots);
				System.out.println("No, you can't take that many, there are only " + talkCarrots + " left.");
				humanChoice = GamesRoom.GetHumanPlayerChoice123();
				humanCarrotTake = Integer.valueOf(humanChoice);
			}
			carrots = carrots - humanCarrotTake;
			if (carrots == 0) {
				System.out.println("You've WON!");
			}
			else {
				computerChoice = GamesRoom.GetComputerPlayerChoice123();
				computerCarrotTake = Integer.valueOf(computerChoice);
				while (computerCarrotTake > carrots) {
					System.out.println("The computer is thinking.");
					computerChoice = GamesRoom.GetComputerPlayerChoice123();
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
}
	
