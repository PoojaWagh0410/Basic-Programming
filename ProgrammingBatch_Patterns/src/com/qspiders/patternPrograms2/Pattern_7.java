package com.qspiders.patternPrograms2;

import java.util.Scanner;

public class Pattern_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - 1; j++) {
				if (i >= j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			for (int j = 1; j <= n; j++) {
				if (i + j >= n + 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
