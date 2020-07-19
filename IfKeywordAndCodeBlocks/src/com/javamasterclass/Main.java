package com.javamasterclass;

public class Main {

    public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

//		if(score < 5000 && score > 1000) {
//			System.out.println("Your score was less than 5000 but greater than 1000");
//		}
//		else if (score < 1000) {
//			System.out.println("Your score was less than 1000");
//		}
//		else {
//			System.out.println("Got here");
//		}
//
		if(gameOver) {
			printGameOverMessage(score, levelCompleted, bonus);
		}

		// Print out a second score on the screen with the following
		// score set to 10000
		// levelCompleted set to 8
		// bonus set to 200
		// but make sure the first printout above still displays as well

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if(gameOver) {
			printGameOverMessage(score, levelCompleted, bonus);
		}
    }

    public static void printGameOverMessage(int score, int levelCompeted, int bonus) {
		System.out.println("Your final score was " + (score + (levelCompeted * bonus)));
	}
}
