package day3;

import java.util.Scanner;

public class StudentAttendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of class held:");
		int a = sc.nextInt();
		System.out.println("no of class attended");
		int b = sc.nextInt();
		float ab;
		ab = (b * 100 / a);
		if (ab >= 75) {
			System.out.println("eligible:" + b);
		} else {
			System.out.println("not eligible:" + b);
		}
		// TODO Auto-generated method stub

	}
}
