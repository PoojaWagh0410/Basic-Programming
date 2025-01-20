package com.qspiders.day1;

import java.util.Scanner;

public class CheckPositiveNegativeNumber {
	
	public static void checkNumber(int num) {
		
//		if(num > 0)
//			System.out.println(num+" is positive number");
//		else if(num < 0)
//			System.out.println(num+" is negative number");
//		else
//			System.out.println("Number is equal to zero");
		
//----------------------------------------------------------
		
//		if(num != 0) {
//			if(num > 0)
//				System.out.println(num+" is negative number");
//			else
//				System.out.println(num+" is negative number");
//			}
//		else {
//			System.out.println("Number is equal to zero");
//		}
		
//----------------------------------------------------------------------
		
		String res = "Zero";
		
		if (num != 0) {
			if (num > 0)
				res = "Positive";
			else
				res = "Negative";
		}
		System.out.println(res);		
}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = scanner.nextInt();
		checkNumber(num);
	}
}















