package com.qspiders.string_1;

import java.util.Scanner;

//	WAJP to remove duplicate characters from a given string.
public class RemoveDuplicateFromString {

//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter String : ");
//		String str = scanner.nextLine();
//		String result = "";
//
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if (!(result.contains(c + ""))) {
//				result += str.charAt(i);
//			}
//		}
//		System.out.println("String without duplicates : " + result);
//
//		scanner.close();
//	}

// -------------------------------------------------------
// --------------------- OR ------------------------------
// -------------------------------------------------------

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();

		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			boolean present = false;
			for(int j = 0 ; j < temp.length() ; j++) {
				if(temp.charAt(j) == c) {
					present = true;
					break;
				}
			}
			if(!present)
				temp = temp + c;
		}
		System.out.println(temp);
		scanner.close();
	}

}
