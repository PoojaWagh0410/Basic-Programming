package com.qspiders.day1;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();		
		
//		for(int i = 1 ; i <= num ; i++) {
//			if(i % 2 == 0)
//				System.out.println(i);
//		}
		
//---------------------- OR ---------------------------
		
		for(int i = 2 ; i <= num ; i = i+2) {
				System.out.println(i);
		}
		scanner.close();
	}
}
