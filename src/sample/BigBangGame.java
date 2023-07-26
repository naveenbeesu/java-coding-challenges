package sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class BigBangGame {

	public static void main(String[] args) {
		beat_sheldon(3, 2, 3, 3);
	}

	public static void beat_sheldon(int input1, int input2, int input3, int input4) {

		int sheldonScore = calculateScore(input1, input2);
		int pennyScore = calculateScore(input3, input4);
		if (sheldonScore > pennyScore) {
			System.out.println("Sheldon " + sheldonScore);
		} else if (sheldonScore < pennyScore) {
			System.out.println("Penny " + pennyScore);
		} else {
			System.out.println("Equal " + pennyScore);
		}

	}

	static int calculateScore(int a, int b) {
		int count = 0;
		for (int i = 1; i <= a; i++) {
			for (int j = i; j <= a; j++) {
				count++;
			}
		}
		return count/b;
	}
}
