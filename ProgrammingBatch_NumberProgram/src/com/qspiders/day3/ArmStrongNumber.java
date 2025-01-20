package com.qspiders.day3;

import java.util.Scanner;

public class ArmStrongNumber {

//1st way : 
//	public static boolean checkArmStrongNumber(int originalNum) {
//		int sum = 0;
//		int count = 0;
//		int temp = originalNum;
//		int num = originalNum;
//
//		while (temp > 0) {
//			count++;
//			temp /= 10;
//		}
//
//		while (num > 0) {
//			int product = 1;
//			int digit = num % 10;
//
//			for (int i = 1; i <= count; i++) {
//				product = product * digit;
//			}
//			sum += product;
//			num /= 10;
//		}
//
//		if (sum == originalNum)
//			return true;
//		else
//			return false;
//	}
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter number : ");
//		int originalNum = scanner.nextInt();
//
//		if(originalNum > 0) 
//			System.out.println(checkArmStrongNumber(originalNum));
//		else
//			System.out.println("Invalid Number");
//	}
	
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
	
//2nd way : 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int originalNum = scanner.nextInt();
		
		int sum = 0;
		int count = 0;
		int temp = originalNum;
		int num = originalNum;

		while (temp > 0) {
			count++;
			temp /= 10;
		}

		while (num > 0) {
			int power = 1;
			int digit = num % 10;

			for (int i = 1; i <= count; i++) {
				power = power * digit;
			}
			sum += power;
			num /= 10;
		}		
		System.out.println(sum == originalNum);		
		scanner.close();
	}
}
