package com.qspiders.string_2;
import java.util.Scanner;

public class findCharInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		System.out.print("Enter Char : ");
		char ch = scanner.next().charAt(0);

		boolean present = false;

		String[] arr = str.split(",");

		int start = Integer.parseInt(arr[1]);
		int end = Integer.parseInt(arr[2]);
		
		//My-logic
//		for (int i = start; i <= end; i++) {
//			if (str.charAt(start) == ch) {
//				present = true;
//				break;
//			}
//		}
		//-------------------------------------------
		//sir's logic--> use this, if we use str them it consider entire string, including that start index and end index
		for (int i = start; i <= end; i++) {
			if (arr[0].charAt(i) == ch) {
				present = true;
				break;
			}
		}
		System.out.println(present);
		scanner.close();
	}
}
