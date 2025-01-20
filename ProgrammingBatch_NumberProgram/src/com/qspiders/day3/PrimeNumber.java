package com.qspiders.day3;

import java.util.Scanner;

public class PrimeNumber {
//1st way : 
//	public static boolean checkprimeNumber(int num) {
//		int count = 2;
//		
//		if (num == 1)
//			count = 1;
//		
//			for (int i = 2; i <= num / 2; i++) {
//				if (num % i == 0) {
//					count++;
//				}
//			}
//		
//			System.out.println("The number of factors of number "+num+" is "+count);
//			if (count == 2) {
//				return true;
//			} else {
//				return false;
//			}
//	}
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter number : ");
//		int num = scanner.nextInt();
//
//		System.out.println(checkprimeNumber(num));
//	}

//------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------

//2nd way 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();

		int count = 2;// Initially, count = 2 , because every number have at least 2 factors(i.e., 1
						// and that number itself)

		if (num == 1)
			count = 1;// when num=1, 1 has only 1 factor i.e., 1

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				if (count > 2)// If count is greater than ,2 then this is not prime number then no need to
								// check other iterations
					break;
			}
		}
		System.out.println(count == 2);
		scanner.close();
	}
}