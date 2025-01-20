package com.qspiders.day3;

import java.util.Scanner;

public class PerfectNumber {
//1st way
	
//	public static boolean checkPerfectNumber(int num) {
//		int sum = 1;
//		
//		for(int i = 2; i <= num/2 ; i++) {
//			if(num % i== 0) {
//				sum = sum +i;			
//			}
//		}
//		if(sum == num)
//			return true;
//		else
//			return false;
//	}
//	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter number : ");
//		int num = scanner.nextInt();
//		
//		System.out.println(checkPerfectNumber(num));
//	}

//---------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------
	
//2nd way
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		
		int sum = 1;//sum starts from 1 because 1 is factor of all the numbers
		
		for(int i = 2; i <= num/2 ; i++) {//and for loop starts from 2 because , we initialized sum with 1. hence we saved 1 iteration here.
			if(num % i== 0) 
				sum = sum +i;			
		}		
		System.out.println(sum == num);		
		scanner.close();
	}
}
