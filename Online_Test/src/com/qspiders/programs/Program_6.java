package com.qspiders.programs;
//WAJP to print characters from a given where ASCII value of given character is even.
import java.util.Scanner;

public class Program_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		for(int i = 0; i < str.length() ; i++) {
			char ch = str.charAt(i);
			if((int)ch % 2 == 0) {
				System.out.println(ch);
			}
		}			
		scanner.close();
	}

}
