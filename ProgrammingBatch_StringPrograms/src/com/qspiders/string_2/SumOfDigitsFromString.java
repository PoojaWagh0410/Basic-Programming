package com.qspiders.string_2;

import java.util.Scanner;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		
		int sum = 0;
		
		for(int i = 0; i < str.length();i++) {	
			char ch =  str.charAt(i);
			if(ch >= '0' && ch <= '9') {
//				int num = ch - 48;//48 is the ascii value of character '0'
				int num = Integer.parseInt(ch+"");
				sum += num;
			}
		}
		System.out.println(sum);
		scanner.close();
	}
}
