package com.qspiders.day1;

import java.util.Scanner;

public class PrintFirst_N_NaturalNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = scanner.nextInt();		
		
		for(int num = 1 ; num <= n ; num++) { 
			System.out.println(num);
		}

//----------------------- OR ------------------------
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Enter how many natural numbers you want to print : ");
//		int n = scanner.nextInt();
//		
//		int num = 1;
//
//		while (n > 0) {
//			System.out.println(num);
//			num++;
//			n--;
//		}
		
		scanner.close();
	}
}
