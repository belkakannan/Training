package day5;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array;
		System.out.println("Enter the size of array");
		array = sc.nextInt();
		int ar[] = new int[array];
		System.out.println("Enter the element of the array");
		for(int i=0;i<array;i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("The even numbers are :");
		for( int i=0;i<array;i++)
		{
			if(ar[array]%2==0)
			{
				System.out.println(ar[array]+" ");
			}
		}
		System.out.println("The odd numbers are :");
		for(int i=0;i<array;i++)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]+" ");
			}
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
