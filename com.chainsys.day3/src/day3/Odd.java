package day3;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be checked");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "is Even");
		} else {
			System.out.println(num + "is odd");
		}
		// TODO Auto-generated method stub

	}

}
