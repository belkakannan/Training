package day3;

import java.util.Scanner;

public class CricketScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String teamX, teamY;
		int score;
		System.out.println("enter team name:");

		teamX = sc.nextLine();
		teamY = sc.nextLine();
		System.out.println("enter the target score:");
		score = sc.nextInt();
		if (score > 80) {
			System.out.println("team X is winner");
		} else if (score < 80) {
			System.out.println("team Y is winner");
		}

		// TODO Auto-generated method stub

	}

}
