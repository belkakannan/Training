
package day3;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		long accountNumber;
		int aadharNumber, transactionPin = 4444, password = 7896;
		System.out.println("Enter account holder name");
		Scanner sc = new Scanner(System.in);
		String accountHolderName = sc.next();
		if (accountHolderName.trim() != null && (accountHolderName.length() > 3)) {
			System.out.println("Enter account number");
			accountNumber = sc.nextLong();
			System.out.println("Enter aadhar number");
			aadharNumber = sc.nextInt();
			if (aadharNumber == 2134) {
				System.out.println("Enter transaction pin and password");
				transactionPin = sc.nextInt();
				password = sc.nextInt();
				if ((transactionPin == 2134) && (password == 7896)) {
					System.out.println("Successfull Transaction");

				} else {
					System.out.println("Invalid Credentials");
				}
			} else {
				System.out.println("Invalid Aadhar details");
			}
		}

	}
}

// TODO Auto-generated method stub
