package com.qspiders.day1;

import java.util.Scanner;

public class LargestBetweenTwoNumbers {
	
	public static void findLargestNum(int num1, int num2) {
//		if(num1 > num2)
//			System.out.println(num1+" is largest");
//		else if(num2 > num1)
//			System.out.println(num2+" is largest");
//		else
//			System.out.println("Both the numbers are equal to zero");

//------------------------------ OR ---------------------------------------------
			
//		if(num1 - num2 > 0) {
//			System.out.println(num1+" is largest");
//		}
//		System.out.println(num2+" is largest");
		
//------------------------------ OR ---------------------------------------------	
		
		int largest = num1;
		if(num1 < num2) {
			largest = num2;
		}
		System.out.println(largest+" is largest");
//-------------------------------------------------------------------------------		
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter second number : ");
		int num2 = scanner.nextInt();
		
		findLargestNum(num1, num2);
	}

}
