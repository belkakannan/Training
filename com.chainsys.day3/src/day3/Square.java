package day3;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int length = sc.nextInt();
		System.out.println("enter the breadth");
		int breadth = sc.nextInt();
		if(length==breadth)
		{
			System.out.println("it is square");
		}
		else
		{
			System.out.println("it is not square");
		}
		

	}

}
