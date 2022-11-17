package day3;

import java.util.Scanner;

public class PurchaseCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the purchased quantity");
		Double prQuantity = sc.nextDouble();

		if (prQuantity > 1000) {
			System.out.println("total cost=" + (prQuantity - (prQuantity / 100 * 10)));
		} else {
			System.out.println("total cost=" + prQuantity);
		}

	}

}
