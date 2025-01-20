package com.qspiders.day4;

import java.util.Scanner;

//WAJP to calculate the sum all the even digits present inside the 
//given number and then check whether the sum is prime or not. 

public class CheckSumOfEvenDigitIsPrimeOrNot {

	public static boolean checkPrime(int num) {

		if (num == 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean SumOfEvenDigitsOfNumber(int num) {
		int temp = num;
		int sum = 0;

		while (temp > 0) {
			int digit = temp % 10;
			if (digit % 2 == 0) {
				sum += digit;
			}
			temp /= 10;
		}
		if (checkPrime(sum)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();

		System.out.println(SumOfEvenDigitsOfNumber(num));
		
		scanner.close();
	}
}
