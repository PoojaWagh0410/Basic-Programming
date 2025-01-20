package com.qspiders.string_1;
//WAJP to count the number of words in a given string separated by comma.

import java.util.Arrays;
import java.util.Scanner;

public class CountNumOfWords {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		
		String[] array = str.split(",");
//		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
		
		scanner.close();
	}
}
