package com.qspiders.day1;

import java.util.Scanner;

public class AreaOfRectangle {
	
	public static void calculateArea(double length, double breadth) {
		if(length > 0 && breadth > 0) {
			double area = length * breadth;
			System.out.println("Area of rectangle with length="+length+" and breadth="+breadth+" is : "+area);
		}
		else {
			System.out.println("Invalid length or breadth");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length : ");
		double length = scanner.nextDouble();
		
		System.out.print("Enter Breadth : ");
		double breadth = scanner.nextDouble();
		
		calculateArea(length,breadth);
	}

}
