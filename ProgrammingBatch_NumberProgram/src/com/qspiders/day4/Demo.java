package com.qspiders.day4;

import java.util.Scanner;

public class Demo {

	public static void CheckOddNum(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
	}

	public static void fibonnacciSeries(int num) {
		int a = 0;
		int b = 1;

		if (num > 0) {
			if (num == 1)
				System.out.print(a + " ");
			else if (num == 2) {
				System.out.print(a + " ");
				System.out.print(b + " ");
			} else if (num > 2) {
				System.out.print(a + " ");
				System.out.print(b + " ");

				for (int i = 1; i <= num - 2; i++) {
					int sum = a + b;
					System.out.print(sum + " ");
					a = b;
					b = sum;
				}
			}
		}
	}

	public static void checkPrime(int num) {
		for (int i = 1; i <= num; i++) {
			int count = 2;

			if (i == 1)
				count = 1;

			for (int f = 2; f <= i / 2; f++) {
				if (i % f == 0)
					count++;

				if (count > 2)
					break;
			}

			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scanner.nextInt();

		CheckOddNum(num);
		System.out.println();

		fibonnacciSeries(num);
		System.out.println();

		checkPrime(num);
	}
}
