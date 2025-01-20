package com.qspiders.day1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.println("Sum of first "+num+" natural numbers is : "+sum);
	

//-------------------------- OR --------------------------------------------------

//		Scanner scanner = new Scanner(System.in);
//		int sum = 0;
//
//		System.out.print("Enter how many natural numbers sum you want to print : ");
//		int n = scanner.nextInt();
//		int num = 1;
//		while (n > 0) {
//			sum += n;
//			num++;
//			n--;
//		}
//		System.out.println("Sum of first " + num + " natural numbers is : " + sum);

		scanner.close();
	}
}
