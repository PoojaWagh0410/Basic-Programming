package com.qspiders.day2;

import java.util.Scanner;

public class n_Power_p {

	public static void nPowerp(int n, int p) {
		int power = 1;
		for (int i = 1; i <= p; i++) {
			power = n * power;
		}
		System.out.println("The value of " + n + " power " + p + " is : " + power);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();

		System.out.print("Enter p : ");
		int p = scanner.nextInt();

		nPowerp(n, p);

		scanner.close();
	}
}
