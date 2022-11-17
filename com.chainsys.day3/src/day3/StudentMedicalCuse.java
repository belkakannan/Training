package day3;

import java.util.Scanner;

public class StudentMedicalCuse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("do you have a medical cause");
		String medicalcause = sc.nextLine();
		if (medicalcause.equals("yes")) {
			System.out.println("allow students to sit in exam hall");
		} else if (medicalcause.equals("no")) {
			System.out.println("do not allow the students to sit in exam hall");
		}

	}

}
