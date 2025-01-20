package com.qspiders.day2;

import java.util.Scanner;

public class PrintMultipleOf_5 {
	
public static void findMultipleOf_5(int num) {	
		
		for(int i = 1 ; i <= num ; i++) {
			if(i % 5 == 0)
				System.out.println(i);
		}		
}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		
		findMultipleOf_5(num);
		scanner.close();
	}
}
