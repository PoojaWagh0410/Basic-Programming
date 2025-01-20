package com.qspiders.day2;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public static void factorial(int num) {
		int fact = 1;
		int temp = num;
		
//		while(num > 0) {
//			fact *= num;
//			num--;
//		}
		
		for(int i =2 ; i <= num ; i++) {
			fact *= i;
		}	
		
		System.out.println("factorial of number "+temp+" is : "+fact);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		
		factorial(num);
		scanner.close();
	}

}
