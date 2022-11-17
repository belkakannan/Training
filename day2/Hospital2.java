package day2;

import java.util.Scanner;

public class Hospital2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestHospital hospital = new TestHospital();

		System.out.println("Enter address of the hospital:");
		String addressofthehospital = sc.next();
		hospital.address = addressofthehospital;

		System.out.println("Enter phone number:");
		int phoneNumber = sc.nextInt();
		hospital.phoneNumber = phoneNumber;

		System.out.println(hospital.address);
		System.out.println(hospital.phoneNumber);

	}

}
