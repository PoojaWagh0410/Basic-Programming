package com.qspiders.day1;

import java.util.Scanner;

public class PerimeterOfCircle {

	static double pi = 3.14;

	public static void calculatePerimeter(double radius) {
		if (radius > 0) {
			double perimeter = Math.round(2 * pi * radius);
			System.out.println(perimeter + " is the perimeter of circle with radius " + radius);
		} else {
			System.out.println("Invalid radius");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius of circle : ");
		double radius = scanner.nextDouble();

		calculatePerimeter(radius);
		scanner.close();
	}
}
