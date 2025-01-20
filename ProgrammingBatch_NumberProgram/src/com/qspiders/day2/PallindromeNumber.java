package com.qspiders.day2;

import java.util.Scanner;

public class PallindromeNumber {

	public static void pallindromeNumber(int num) {
		int temp = num;
		int reverse = 0;
		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}

		System.out.println("Reverse number is : " + reverse);

		if (reverse == temp) 
			System.out.println(temp + " is pallindrome number");
		else
			System.out.println(temp + " is not pallindrome number");

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number to check it is pallindrome or not : ");
		int num = scanner.nextInt();

		pallindromeNumber(num);
		scanner.close();
	}
}
