package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		char xy;
		System.out.println("enter the number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("enter the operator(+,-,*,/)");
		xy = sc.next().charAt(0);
		if (xy == '-') {
			d = a - b - c;
			System.out.println(d);
		} else if (xy == '*') {
			d = a * b * c;
			System.out.println(d);
		} else if (xy == '+') {
			d = a + b + c;
			System.out.println(d);
		} else if (xy == '/') {
			d = a / b / c;
			System.out.println(d);
		}

	}

}
