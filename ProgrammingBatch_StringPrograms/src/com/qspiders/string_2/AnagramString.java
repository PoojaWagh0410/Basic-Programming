package com.qspiders.string_2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String1 : ");
		String str1 = scanner.nextLine();
		System.out.print("Enter String2 : ");
		String str2 = scanner.nextLine();

		if (str1.length() == str2.length()) {

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			System.out.println(Arrays.equals(ch1, ch2));
		}else
			System.out.println(false);

		scanner.close();
	}
}
