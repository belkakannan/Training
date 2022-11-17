package day2;

import java.util.Scanner;

public class CallTest {

	public static void main(String[] args) {
		Call call = new Call();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 number to perform arithmetic operations");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		call.a = num1;
		call.b = num2;
		call.c = num3;
		System.out.println("Sum of given number : " + (num1 + num2 + num3));
		System.out.println(num1 / num2 / num3);

	}

}
