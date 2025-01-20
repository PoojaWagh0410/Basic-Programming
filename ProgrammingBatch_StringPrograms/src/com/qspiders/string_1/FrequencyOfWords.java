package com.qspiders.string_1;
//WAJP to print a character from a given string along with its frequency.
import java.util.Scanner;

public class FrequencyOfWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '*') {
				int count = 1;
				for (int j = i + 1; j < str.length(); j++) 
				{
					if (str.charAt(j) == str.charAt(i))
						count++;
				}
				System.out.println(str.charAt(i) + " : " + count);
				str = str.replace(str.charAt(i), '*');
			}
		}
		scanner.close();
	}
}
