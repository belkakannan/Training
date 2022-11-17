package day3;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your accountNumber");
		long accountNumber = sc.nextLong();
		System.out.println("Enter your phoneNumber");
		long phoneNumber = sc.nextLong();
		System.out.println("Enter your pinNumber");
		int pinNumber = sc.nextInt();
		if ((pinNumber == 1234) || (phoneNumber == 9894039445l)) {
			System.out.println("Enter your withdrawal amount");
			int amount = sc.nextInt();
			System.out.println("successfuly withdrawaled");
		} else {
			System.out.println("pin number not valid");

		}

	}

}
