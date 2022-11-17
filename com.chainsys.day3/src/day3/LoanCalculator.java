package day3;

import java.util.Scanner;

public class LoanCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		int principleAmount = sc.nextInt();
		System.out.println("Enter the interest percentage");
		int interestPercentage = sc.nextInt();
		System.out.println("Enter the terms");
		int term = sc.nextInt();
		int rate = (principleAmount / interestPercentage) * term;
		System.out.println("Rate of interst," + rate);
		int total = principleAmount + rate;
		System.out.println("total amount to be paid:" + total);
		int month = total / (term * 12);
		System.out.println("paid per month : " + month);
		for (int i = total; i > +0;) {
			System.out.println("" + i);
			i = i - month;
		}

		// TODO Auto-generated method stub

	}

}
