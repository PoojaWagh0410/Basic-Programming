package com.qspiders.patternPrograms2;

import java.util.Scanner;

public class Pattern_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();

		for (int i = n; i >= 1; i--) 
		{
			for (int j = 1; j <= n - i; j++) 
			{
				System.out.print("  ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) 
			{
				if (i == n || j == 1 || j == 2 * i - 1) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		scanner.close();
	}
}


