package com.qspiders.day4;

import java.util.Scanner;

//WAJP to calculate the sum of all the prime numbers present between 1 and 50 and check that sum is prime or not.
public class SumIsPrimeNumbersOrNot {

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}			

	public static boolean findSumOfPrimeInGivenRange(int start, int end) {

		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) { // Check if the current number is prime
				sum += i; // Add the prime number to the sum
			}
		}
		System.out.println(sum + " is the sum of prime numbers between " + start + " and " + end);

		if (isPrime(sum))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter start range : ");
		int start = scanner.nextInt();
		System.out.print("Enter end range : ");
		int end = scanner.nextInt();

		if (findSumOfPrimeInGivenRange(start, end))
			System.out.println("sum is prime");
		else
			System.out.println("sum is not prime");
		
		scanner.close();
	}



	
}
