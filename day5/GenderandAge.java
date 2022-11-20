package day5;

import java.util.Scanner;

public class GenderandAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the gender 'Male' or 'Female':");
		String gender = sc.next();
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		if(gender.equals("male")&&age>=25)
		{
			System.out.println("Man");
		}
		else if(gender.equals("male")&&age<25)
		{
			System.out.println("boy");
		}
		else if(gender.equals("female")&&age>20)
		{
			System.out.println("Girl");
		}
		else
		{
			System.out.println("Enter valid data:");
		}
		

	}

}
