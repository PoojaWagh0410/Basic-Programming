package com.qspiders.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char a[] = new char[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.next().charAt(0);
		}

		int i = 0;
		int j = a.length - 1;

		while (i < j) {
			if ((a[i] >= 'a' && a[i] <= 'z' || a[i] >= 'A' && a[i] <= 'Z') && (a[j] >= 'a' && a[j] <= 'z'
					|| a[j] >= 'A' && a[j] <= 'Z')) {
				char temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			} else if ((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z')) {
				j--;
			} else if ((a[j] >= 'a' && a[j] <= 'z') || (a[j] >= 'A' && a[j] <= 'Z')) {
				i++;
			} else {
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
