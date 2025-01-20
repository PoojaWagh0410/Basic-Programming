package com.qspiders.day3;

import java.util.Scanner;

public class PrimeNumbers_inGivenRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter end Range : ");
		int end = scanner.nextInt();

		for (int num = 1; num <= end; num++) {
			int count = 2;

			if (num == 1)
				count = 1;

			for (int f = 2; f <= num / 2; f++) {
				if (num % f == 0)
					count++;

				if (count > 2)
					break;
			}

			if (count == 2) {
				System.out.println(num);
			}
		}
		scanner.close();
	}
}
