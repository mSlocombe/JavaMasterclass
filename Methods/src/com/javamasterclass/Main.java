package com.javamasterclass;

public class Main {

	private static boolean gameOver = false;
	private static int score = 0;
	private static int levelCompleted = 0;
	private static int bonus = 0;

    public static void main(String[] args) {
		gameOver = true;
		score = 800;
		levelCompleted = 5;
		bonus = 100;

		int highScore = calculateScore();
		System.out.println("Your final score was " + highScore);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		highScore = calculateScore();
		System.out.println("Your final score was " + highScore);

		// Create a method called displayHighScorePosition
		// It should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
		// You should dispay the players name along wiht a message like "managed to get into position " and the
		// position they got and a further message " on the high score table."
		//
		// Create a 2nd method called calculateHighScorePosition
		// It should be sent one argument only, the player score
		// it should return an int
		// 1 if the score is > 1000
		// 2 if the score is > 500 and < 1000
		// 3 if the score is > 100 and < 500
		// 4 in all other cases
		// call both methods and display the results of the following
		// a score of 1500, 900, 400 and 50

		displayHighScorePosition("Jack", calculateHighScorePosition(1500));
		displayHighScorePosition("Sam", calculateHighScorePosition(900));
		displayHighScorePosition("Tony", calculateHighScorePosition(400));
		displayHighScorePosition("Mel", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
	}

	public static int calculateHighScorePosition(int score) {
    	if(score >= 1000) {
    		return 1;
		}
    	else if(score >= 500) {
    		return 2;
		}
    	else if(score >= 100) {
    		return 3;
		}
    	else {
    		return 4;
		}
	}

    public static int calculateScore() {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		}
		return -1;
	}
}