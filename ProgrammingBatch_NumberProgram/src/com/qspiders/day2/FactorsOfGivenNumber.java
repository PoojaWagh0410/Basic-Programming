package com.qspiders.day2;

import java.util.Scanner;

public class FactorsOfGivenNumber {
	
	public static void factorialOfNumber(int num) {
		System.out.println("1");
		for(int i = 2; i <= num/2 ; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number to find its factorial : ");
		int num = scanner.nextInt();

		factorialOfNumber(num);
		
		scanner.close();
	}
}
