public class ArcheryGame{


public static String gameWelcomeMenu() {
	
	return """
	 <<--<<--<<-- Welcome to Semicolon ArcheryGame -->>-->>-->>
	 __________________________________________________________
	""";
}


public static int[][] generateRandomNumbers(int[][] scores) {
	for (int players = 0; players < 4; players++) {
		for (int chance = 0; chance < 3; chance++) {
			scores[player][chance] = random.nextInt(11);
		}
	}
}


public static int calculateTotalScores (int[] totalScores) {
	for (int player = 0; player < 4; player++) {
		totalScores[player] = scores[player][0] + scores[player][1] + scores[player][2];
	}
} 


public static int determineTheWiner (int winner) {
	for (int player = 0; player < 4; player++) {
		if (totalScores[player] > highestScore) {
			highestScore = totalScore[player];
			winner = player;
		}
	}
}



public static void main (String... args) {
	
	Random random = new Random();
	
	int[][] scores = new int [4]]3];
	int[] totalScores = new int[4];
	int higestScore = 0;
	int winner = -1;
	
	
	
}


}