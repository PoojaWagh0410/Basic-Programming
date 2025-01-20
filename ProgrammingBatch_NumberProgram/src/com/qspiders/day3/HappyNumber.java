package com.qspiders.day3;

import java.util.Scanner;

public class HappyNumber {

//	public static int checkHappyNumber(int num) {
//
//		int product = 1;
//		int sum = 0;
//			while (num > 0) {
//				int digit = num % 10;
//				product = digit * digit;
//				sum = sum + product;
//				num /= 10;
//			}
//			return sum;
//	}
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		int num = scanner.nextInt();
//		int result = num;
//		
//		while(result != 1 && result != 4)
//			result = checkHappyNumber(result);
//		
//		if(result == 1)
//			System.out.println(num+" is happy number");
//		else if(result==4)
//			System.out.println(num+" is sad number");
//	}

//-----------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scanner.nextInt();

		while (num != 1 && num != 4) {
			int sum = 0;
			while (num > 0) {
				int digit = num % 10;
				int sq = digit * digit;
				sum = sum + sq;
				num /= 10;
			}
			num = sum;
		}
		System.out.println(num == 1);
		scanner.close();
	}
}
