package com.qspiders.string_1;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		
		String[] arr = str.split(",");
		
		for(int i = 0 ; i < arr.length ; i++) {
			String word = arr[i];
			word = word.toUpperCase();			
			
			if(i != arr.length-1)
				word = word.charAt(0)+word.substring(1, word.length()).toLowerCase()+",";
			else
				word = word.charAt(0)+word.substring(1).toLowerCase();
			
			System.out.print(word);
		}		
		
		scanner.close();		
	}
}