package com.qspiders.day3;

import java.util.Scanner;

//Neon Number : The sum of digits from the square of number is equal to original number(9*9 = 81 ---> 8 + 1 = 9)

public class NeonNumber {
//	public static boolean checkNeonNumber(int num) {
//		int square = num * num;
//		int sum = 0;
//		System.out.println("Square of " + num + " is : " + square);
//
//		while (square > 0) {
//			int digit = square % 10;
//			sum = sum + digit;
//			square /= 10;
//		}
//
//		if (num == sum)
//			return true;
//		else
//			return false;
//	}
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		int num = scanner.nextInt();
//
//		System.out.println(checkNeonNumber(num));
//	}

//-------------------------------------------------------
//-------------------------------------------------------
//-------------------------------------------------------
//-------------------------------------------------------

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scanner.nextInt();

		if (num > 0) {
			int sq = num * num;
			int sum = 0;
			while (sq > 0) {
				int digit = sq % 10;
				sum += digit;
				sq /= 10;
			}
			System.out.println(num == sum);
		}
		scanner.close();
	}
}
