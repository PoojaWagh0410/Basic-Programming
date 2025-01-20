package com.qspiders.string_1;
import java.util.Scanner;
//WAJP to count upper case alphabets and lower case alphabets in a given string.
public class Count_Upper_lowerCase_alphabets {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();

		int upperCount = 0;
		int lowerCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {//this condition is to ignore the space.
				if (c >= 'A' && c <= 'Z')
					upperCount++;
				else
					lowerCount++;
			}
		}
		System.out.println("Upper case Alphabets : " + upperCount);
		System.out.println("Lower case Alphabets : " + lowerCount);

		scanner.close();
	}
}
