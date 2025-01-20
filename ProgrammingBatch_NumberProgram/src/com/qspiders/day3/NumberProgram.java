package com.qspiders.day3;

import java.util.Scanner;

public class NumberProgram {

	// WAJP to count the number of digits in a given number, if the count is odd
	// then reverse the given number, if the count is even then swap first half of
	// the number with second half.

	public static void checkCount(int num) {
		int temp = num;
		int count = 0;

		while (num > 0) {
			count++;
			num /= 10;
		}

		if (count % 2 == 0) {
			System.out.println("count is even, swap first half of the number with second half");
			String copy = String.valueOf(temp);

			String firstHalf = copy.substring(0, copy.length() / 2);
			String secondHalf = copy.substring(copy.length() / 2);

			String copy2 = secondHalf + firstHalf;
			int temp2 = Integer.parseInt(copy2);

			System.out.println(temp2);

		} else {
			System.out.println("count is odd, reverse the given number");
			int reverse = 0;
			while (temp > 0) {
				int digit = temp % 10;
				reverse = reverse * 10 + digit;
				temp /= 10;
			}
			System.out.println(reverse);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scanner.nextInt();

		checkCount(num);
		scanner.close();
	}
}