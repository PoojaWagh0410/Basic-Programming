package com.qspiders.day4;

//Online Test 1 : 
//Check if the number is pallindrome or not, if Not then find the nearest pallindrome number of that number.Number is in between 0 and 00.

import java.util.Scanner;

public class NearestPallindromeNumber {

//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//
//		if (num > 0) {
//			System.out.println(nearestPallindrome(num));
//		} else {
//			System.out.println(num);
//		}
//		scanner.close();
//	}
//
//	public static boolean isPallindrome(int num) {
//		int temp = num;
//		int reverse = 0;
//		while (temp > 0) {
//			int digit = temp % 10;
//			reverse = reverse * 10 + digit;
//			temp /= 10;
//		}
//
//		if (reverse == num)
//			return true;
//		else
//			return false;
//	}
//
//	public static int nearestPallindrome(int num) {
//		int lower = num;
//		int higher = num;
//
//		while (true) {
//			if (isPallindrome(lower)) 
//				return lower;
//			
//			if (isPallindrome(higher))
//				return higher;
//
//			lower--;
//			higher++;
//		}
//	}

//--------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scanner.nextInt();

		if (num == reverse(num)) {
			System.out.println(num);
		} else {
			int p1;
			int p2;
			int i = num + 1;

			while (true) {
				if (i == reverse(i)) {
					p1 = i;
					break;
				}
				i++;
			}

			i = num - 1;
			while (true) {
				if (i == reverse(i)) {
					p2 = i;
					break;
				}
				i--;
			}

			if (num - p2 == p1 - num)
				System.out.println(p1 + "," + p2);
			else if (num - p2 > p1 - num)
				System.out.println(p1);
			else
				System.out.println(p2);
		}
	}

	private static int reverse(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		return rev;
	}

}
