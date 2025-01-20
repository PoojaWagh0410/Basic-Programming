package com.qspiders.string_1;

import java.util.Scanner;

//WAJP to count the number of words having even length.where words are separated by commas.
public class Count_Length_Of_Words {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();

		String[] s = str.split(",");

//		for (int i = 0; i < s.length; i++) {
//			String word = s[i];
//			if (word.length() % 2 == 0) {
//				System.out.println(word);
//			}
//		}
		
		//--------------- OR ---------------
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() % 2 == 0) {
				System.out.println(s[i]);
			}
		}
		scanner.close();
	}
}
