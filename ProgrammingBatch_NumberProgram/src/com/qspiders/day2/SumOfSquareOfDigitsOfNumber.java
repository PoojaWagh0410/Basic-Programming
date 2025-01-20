package com.qspiders.day2;

import java.util.Scanner;

public class SumOfSquareOfDigitsOfNumber {
	
	public static void sumOfSquareOfDigits(int num) {
		int sum = 0;
		int temp = num;
		while(num != 0) {
			int digit = num % 10 ;	//to extract last digit		
			
			sum += (digit * digit);
					
			num /= 10;
		}		
		System.out.println("Sum of square of each digit of number "+temp+" is : "+sum);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		
		sumOfSquareOfDigits(num);
		scanner.close();
	}
}