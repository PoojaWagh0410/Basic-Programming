package com.qspiders.day2;

import java.util.Scanner;

public class ProductOfOddDigitsOfNumber {
	
	public static void productOfOddDigits(int num) {
		int product = 1;
		int temp = num;
		while(num > 0) {
			int digit = num % 10 ;			
			if(digit % 2 == 1) {
				product *= digit;
			}			
			num /= 10;
		}		
		System.out.println("Product of odd digits of number "+temp+" is : "+product);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		
		productOfOddDigits(num);
		scanner.close();
	}

}
