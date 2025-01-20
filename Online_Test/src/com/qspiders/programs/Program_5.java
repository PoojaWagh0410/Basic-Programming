package com.qspiders.programs;

import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();

		str = str.toUpperCase();
		boolean present = false;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			present = false;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
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
