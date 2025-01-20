package com.qspiders.day1;

import java.util.Scanner;

public class AreaOfCircle {

	static double pi = 3.14;

	public static void calculateArea(double radius) {
		if (radius > 0) {
			double area = pi * radius * radius;
			System.out.println(area + " unit squares is the area of circle with radius " + radius);
		} else {
			System.out.println("Invalid radius value");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Radius of circle : ");
		double radius = scanner.nextDouble();

		calculateArea(radius);
		
		scanner.close();
	}
}
