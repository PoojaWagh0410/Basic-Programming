package com.qspiders.string_1;
import java.util.Scanner;
//WAJP to reverse the sequence of characters in a given string.
public class Reverse_Sequence_Of_Charachters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		String temp = "";

//		for (int i = 0; i < str.length(); i++) {
//			reverse_str = str.charAt(i) + reverse_str;
//		}
//-------------OR----------
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}		
		str = temp;
		
		System.out.println("Reverse String : " + str);
		scanner.close();
	}
}
