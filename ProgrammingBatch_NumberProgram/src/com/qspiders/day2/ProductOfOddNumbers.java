package com.qspiders.day2;

import java.util.Scanner;

public class ProductOfOddNumbers {

	public static void findProduct(int num) {

		int product = 1;

		for (int i = 1; i <= num; i = i + 2) {
			product = product * i;
		}

//--------------------- OR -----------------------------

//		for(int i = 2 ; i <= num ; i++) {
//			if(i % 2 == 1) {
//				product *= i;
//			}
//		}		
		System.out.println("Product of odd numbers from 1 to " + num + " is : " + product);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		findProduct(num);
		scanner.close();
	}

}
