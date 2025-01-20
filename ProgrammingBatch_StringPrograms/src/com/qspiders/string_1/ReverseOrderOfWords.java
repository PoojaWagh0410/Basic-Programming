package com.qspiders.string_1;

import java.util.Scanner;

//WAJP to reverse the order of words in a given string separated by comma.
public class ReverseOrderOfWords {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = scanner.nextLine();
		System.out.println("Orginal String : "+str);
		
		String temp = "";
		
		String[] arr = str.split(",");
		
		for(int i= arr.length-1 ; i >= 0 ; i--) {
			if(i != 0)
				temp += arr[i] +",";
			else
				temp += arr[i];
		}
		str = temp;
		System.out.println("reverse String : "+str);
		scanner.close();
	}

}
