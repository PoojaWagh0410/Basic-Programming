package com.qspiders.string_1;

import java.util.Scanner;

///WAJP to print the unique characters from a given string.
public class UniqueCharactersFromString {

//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter String : ");
//		String str = scanner.nextLine();
//		String temp = "";
//		
//		for(int i = 0 ; i < str.length() ; i++) {
//			char c = str.charAt(i);
//			if(!(temp.contains(c+"")))
//				temp += str.charAt(i);
//		}
//		str = temp;
//		System.out.println(str);
//		
//		scanner.close();		
//	}

//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '*') {
				int count = 1;
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(j) == str.charAt(i))
						count++;
				}
				if (count == 1)
					System.out.println(str.charAt(i));
				str = str.replace(str.charAt(i), '*');
			}
		}
		scanner.close();
	}

// ------------------------------------------------------------------
// ------------------------------------------------------------------
// ------------------------------------------------------------------

	
}
