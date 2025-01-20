package com.qspiders.day1;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void calculateSimpleInterest(double principal, double time, double rateOfInterest ) {
		double simpleInterest = (principal * time * rateOfInterest) / 100;
		System.out.println("The simple interest is : "+simpleInterest);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter principal amount : ");
		double p = scanner.nextDouble();
		
		System.out.print("Enter time duration : ");
		double t = scanner.nextDouble();
		
		System.out.print("Enter Rate of Interest : ");
		double r = scanner.nextDouble();
		
		calculateSimpleInterest(p, t, r);
		
		scanner.close();
	}

}
