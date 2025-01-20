package com.qspiders.programs;

import java.util.Arrays;
import java.util.Scanner;

// WAJP to manipulate given String
// Input : [1,H,e,2,l,3,l,4,o,5]
// Output : [1,o,l,2,l,3,e,4,H,5]

public class Program_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[] a = new char[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.next().charAt(0);
		}

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			if(Character.isAlphabetic(a[start]) && Character.isAlphabetic(a[end])) {
				char temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}else if(Character.isAlphabetic(a[start])) {
				end--;
			}else if(Character.isAlphabetic(a[end])) {
				start++;
			}else {
				start++;
				end--;
			}

		}
		System.out.println(Arrays.toString(a));
		
		
	}
}
