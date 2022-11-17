package day3;

import java.util.Scanner;

public class Gradingsystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks;
		System.out.println("enter marks");
		marks = sc.nextInt();
		if (marks < 25) {
			System.out.println("grade f");
		}

		else if (marks >= 25 && marks < 45) {
			System.out.println("grade e");
		} else if (marks >= 45 && marks < 50) {
			System.out.println("grade d");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("grade c");
		} else if (marks >= 60 && marks < 80) {
			System.out.println("grade b");
		} else if (marks < 80) {
			System.out.println("grade a");
		}

	}

}
