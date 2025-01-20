package com.qspiders.day3;

import java.util.Scanner;

public class DisariumNumber {

//	public static boolean checkDisariumNumber(int originalNum) {
//		int temp = originalNum;
//		int num = originalNum;
//		int sum = 0;
//		int noOfDigits = 0;
//
//		while (temp > 0) {
//			noOfDigits++;
//			temp /= 10;
//		}
//
//		while (num > 0) {
//			int power = 1;
//			int digit = num % 10;
//
//			for (int i = 1; i <= noOfDigits; i++) {
//				power = power * digit;
//			}
//
//			sum = sum + power;
//			num /= 10;
//			noOfDigits--;
//		}
//
//		if (originalNum == sum)
//			return true;
//		else
//			return false;
//	}
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		int originalNum = scanner.nextInt();
//
//		System.out.println(checkDisariumNumber(originalNum));
//	}
	
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------
	
//2nd way :
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int originalNum = scanner.nextInt();
	
		int temp = originalNum;
		int num = originalNum;
		int sum = 0;
		int noOfDigits = 0;

		while (temp > 0) {
			noOfDigits++;
			temp /= 10;
		}

		while (num > 0) {
			int power = 1;
			int digit = num % 10;

			for (int i = 1; i <= noOfDigits; i++) {
				power = power * digit;
			}

			sum = sum + power;
			num /= 10;
			noOfDigits--;
		}
		
		System.out.println(sum == originalNum);
		scanner.close();
	}
}