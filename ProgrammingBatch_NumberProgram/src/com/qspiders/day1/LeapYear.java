package com.qspiders.day1;

import java.util.Scanner;

//The year of month Feb contains only 29 days is leap year
//Leap year comes after 4 months
public class LeapYear {

	public static void checkLeapYear(int year) {
		if (year > 0) {
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
				System.out.println(year + " is a leap year");// 1988, 1992, 1996, 2000, 2004
			else
				System.out.println(year + " is not a leap year");
		} else {
			System.out.println("Invalid year");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int year = scanner.nextInt();
		
		checkLeapYear(year);
		scanner.close();
	}
}
