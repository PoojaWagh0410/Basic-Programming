package com.qspiders.string_2;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			temp += c;
		}
//		if (temp.equalsIgnoreCase(str)) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//------------------ OR -------------------		
		System.out.println(temp.equalsIgnoreCase(str));
		scanner.close();
	}
}