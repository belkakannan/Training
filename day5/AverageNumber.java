package day5;
import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter count of numbers");
		count = sc.nextInt();
		int numbers,sum=0;
		float average=0;
		for(int i=0;i<count;i++)
		{
		numbers=sc.nextInt();
		sum=sum+numbers;
	}
	average=sum/count;
	System.out.println("entered the sum of numbers: "+sum);
	System.out.println("enter average numbers:"+average);
	
		
		
		

	}

}
