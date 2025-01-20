package com.qspiders.string_2;

import java.util.Scanner;

public class FindPossibleSubStringOfGivenString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String subStr = str.substring(i, j + 1);
				System.out.println(subStr);
			}
		}
		scanner.close();
	}
}
