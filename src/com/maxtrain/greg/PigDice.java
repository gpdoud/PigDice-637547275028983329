package com.maxtrain.greg;

public class PigDice {
	
	public int Play() {
		var score = 0;
		var roll = Roll();
		while(roll != 1) {
			score += roll;
			roll = Roll();
		}
		return score;
	}
	
	private int Roll() {
		return (int)(Math.random() * 363654) % 6 + 1;
	}

}
