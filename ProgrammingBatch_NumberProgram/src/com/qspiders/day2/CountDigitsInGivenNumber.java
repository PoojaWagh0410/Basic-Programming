package com.qspiders.day2;

import java.util.Scanner;

public class CountDigitsInGivenNumber {
	
	public static void countDigits(int num) {
		int count = 0;
		int temp = num;
		
			while(num > 0) {
				count++;
				num /= 10;//Remove last digit
			}		
		
		System.out.println(count+" digits present in number "+temp);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		
		countDigits(num);
		
		scanner.close();
	}
}
