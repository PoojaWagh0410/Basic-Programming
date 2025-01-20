package com.qspiders.day4;

import java.util.Scanner;

public class checkProductOfDigitsOfNumIsPrime {

	// WAJP to calculate the product of all the digits present inside given number
	// and then check whether the product is perfect number or not.

	public static int findProductOfDigitsOfNum(int num) {
		int product = 1;
		while (num > 0) {
			int digit = num % 10;
			product *= digit;
			num /= 10;
		}

		return product;
	}

	public static boolean checkProductIsPerfectNum(int num) {
		num = findProductOfDigitsOfNum(num);
		int sum = 1;

		if (num <= 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
//		System.out.println(sum);
//		System.out.println(findProductOfDigitsOfNum(num));

		if (num == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scanner.nextInt();

		System.out.println(checkProductIsPerfectNum(num));
		scanner.close();
	}
}
