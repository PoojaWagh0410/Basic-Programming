package com.qspiders.string_2;

import java.util.Scanner;

public class PanagramString {

//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter String : ");
//		String str = scanner.nextLine();
//
//		str = str.toUpperCase();
//		int count = 0;
//		int k =0; //K is just used for debugging
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			k++;
//			boolean present = false;
//			for (int i = 0; i < str.length(); i++) {
//				if(str.charAt(i) != ' ') {
//					if (str.charAt(i) == ch) {
//						present = true;
//						count++;
//						break;
//					}
//				}
//			}
//			if (!present)
//				break;
//		}
//		System.out.println(k);
//		System.out.println(count == str.length());
//		scanner.close();
//	}
	
//---------------------------------------------------------------
//---------------------------------------------------------------
//---------------------------------------------------------------

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();

		str = str.toUpperCase();
		boolean present = false;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			present = false;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != ' ') {
					if (str.charAt(i) == ch) {
						present = true;
						break;
					}
				}
			}
			if (!present)
				break;
		}
		System.out.println(present);
		scanner.close();
	}
}
