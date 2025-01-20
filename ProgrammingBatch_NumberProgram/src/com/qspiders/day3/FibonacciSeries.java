package com.qspiders.day3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		int a = 0;
		int b = 1;

		if (num > 0) {
			if (num == 1) {
				System.out.print(a + " ");
			} else if (num == 2) {
				System.out.print(a + " ");
				System.out.print(b + " ");
			} else if (num >= 3) {
				System.out.print(a + " ");
				System.out.print(b + " ");

				for (int i = 1; i <= num-2; i++) {// num-2 because first 2 elements(i.e., 0 and 1) are already
													// printed.
					int sum = a + b;
					System.out.print(sum + " ");
					a = b;
					b = sum;
				}
			}
		} else {
			System.out.println("Number should be greater than 0");
		}
		scanner.close();
	}
}
