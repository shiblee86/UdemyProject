package methodoverloading;

public class CalculateScore {
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		
		System.out.println("Unnammed player scored " + score + " points");
		return score * 1000;
	}
	
public static int calculateScore() {
		
		System.out.println("No player name, no player score");
		return 0;
	}
	
	public static void main(String[] args) {
		
		calculateScore("Syed", 588);
		
		System.out.println("New score is " + calculateScore("Tim", 500));
		
		System.out.println(calculateScore(20));
		
		System.out.println(calculateScore());
	}

}
