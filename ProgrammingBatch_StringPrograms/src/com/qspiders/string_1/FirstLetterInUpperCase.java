package com.qspiders.string_1;

import java.util.Scanner;

// WAJP to convert the first alphabet of each word to upper case where the words are separated by commas.
public class FirstLetterInUpperCase {

//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter String : ");
//		String str = scanner.nextLine();

//		String[] s = str.split(",");
//
//		for (int i = 0; i < s.length; i++) {
//			String word = s[i];
//			
////			word = word.toUpperCase();
////			word = word.charAt(0)+word.substring(1).toLowerCase();
//-------------------- OR -----------------------
//			word = (char)(word.charAt(0)-32) + word.substring(1);
//			
//			if(i == s.length - 1 )
//				System.out.print(word);
//			else
//				System.out.print(word+", ");
//		}
//		scanner.close();
//	}

//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		String temp = "";
		String[] arr = str.split(",");

		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];

//			if (i == arr.length - 1)
//				temp = temp + (char) (word.charAt(0) - 32) + word.substring(1);
//			else
//				temp = temp + (char) (word.charAt(0) - 32) + word.substring(1) + ", ";
//------------------------- OR ----------------------
//---------------------------------------------------
			temp = temp + (char) (word.charAt(0) - 32) + word.substring(1);
			if (i != arr.length-1)
				temp += ",";
		}
		
		str = temp;
		System.out.println(str);
		scanner.close();
	}
}
