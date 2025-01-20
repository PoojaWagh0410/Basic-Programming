package com.qspiders.day3;

import java.util.Scanner;

public class StrongNumber {
	
//Strong Number : Sum of factorial of individual digit of number should be equal to that number itself

//1st way
	
//	public static int factorial(int digit) {
//		int fact = 1;
//		for(int i = 2; i <= digit ; i++) {
//			fact = fact* i;
//		}
//		return fact;
//	}
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		int num = scanner.nextInt();
//		
//		int temp = num;
//		int sum = 0;
//		
//		while(num > 0 ) {
//			int digit = num % 10;
//			sum += factorial(digit);
//			num /= 10;
//		}
//		
//		if(temp == sum)
//			System.out.println("true");
//		else
//			System.out.println("false");
//	}
	
//----------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------
	
//2nd way
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scanner.nextInt();
		
		int temp = num;
		int sum = 0;
		
		while(num > 0 ) {
			int digit = num % 10;
			int fact = 1;
			for(int i = 2; i <= digit; i++) {
				fact = fact*i;
			}
			
			sum+=fact;			
			num /= 10;			
		}
		System.out.println(sum == temp);
		scanner.close();
	}
	
}
