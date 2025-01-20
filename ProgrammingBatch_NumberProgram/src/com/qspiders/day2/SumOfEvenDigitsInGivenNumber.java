package com.qspiders.day2;

import java.util.Scanner;

public class SumOfEvenDigitsInGivenNumber {
	
	public static void sumOfDigits(int num) {
		int sum = 0;
		int temp = num;
		while(num > 0) {
			int digit = num % 10 ;	//Extract last digit		
			if(digit % 2 == 0) {
				sum += digit;
			}			
			num /= 10;//Remove last digit
		}
		
		System.out.println("Sum of even digits of number "+temp+" is : "+sum);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		
		sumOfDigits(num);
		scanner.close();
	}

}
