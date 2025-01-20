package com.qspiders.string_1;

import java.util.Scanner;
//WAJP to count the vowels, consonants in a given string containing alphabets.

public class Count_Vowels_Consonents {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		str = str.toLowerCase();
		
		int vowelsCount = 0;
		int consonantsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >='a' && c <= 'z' || c >= 'A' && c<= 'Z') {  //Ttis condition is to ignore the spaces
//			if (c != ' ') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
					vowelsCount++;
				else
					consonantsCount++;
			}
		}

		System.out.println("Vowels : " + vowelsCount);
		System.out.println("consonants : " + consonantsCount);

		scanner.close();
	}

}
