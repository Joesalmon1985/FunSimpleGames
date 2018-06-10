
public class GameRockPaperScissors {

	public static void main(String[] args) {
		System.out.println("Hellos");
		String humanChoice = GameRockPaperScissors.GetHumanPlayerChoice(), computerChoice = "rock";
		// TODO Auto-generated method stub

	}
	public static String GetHumanPlayerChoice () {
		System.out.println("Choose 1 for Rock, 2 for Paper or 3 for Scissors");
		String playerChoice = "error";
		while (playerChoice.equals("error")) {
			playerChoice = GamesRoom.GetHumanPlayerChoice123 ();
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
			return "not rock";
			
		}
	}

}
