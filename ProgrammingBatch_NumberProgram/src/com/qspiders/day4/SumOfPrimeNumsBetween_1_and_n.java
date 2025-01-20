package com.qspiders.day4;

import java.util.Scanner;

//WAJP to calculate the sum of all the prime numbers present between 1 and 50.

public class SumOfPrimeNumsBetween_1_and_n {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter start range : ");
		int start = scanner.nextInt();
		System.out.print("Enter end range : ");
		int end = scanner.nextInt();

		int sum = 0;
		for (int i = start; i <= end; i++) {
			int num = i;
			int count = 2;

			if (num <= 1)
				count = 1;

			for (int f = 2; f <= num / 2; f++) {
				if (num % f == 0) {
					count++;
					break;
				}
			}
			if (count == 2)
				sum += num;
		}
		System.out.println(sum + " is the sum of prime numbers between " + start + " and " + end);
		scanner.close();

	}

}
