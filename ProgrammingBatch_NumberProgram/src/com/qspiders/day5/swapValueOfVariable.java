package com.qspiders.day5;

public class swapValueOfVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before swaping");
		System.out.println("a : " + a);
		System.out.println("b : " + b);

// 1) Without using 3rd variable

		b = a + b;// b = 10 + 20 = 30
		a = b - a;// a = 30 - 10 = 20
		b = b - a;// b = 30 - 20 = 10 4

		System.out.println("After swaping");
		System.out.println("a : " + a);
		System.out.println("b : " + b);

//-----------------------------------------------------------
// 2) with using 3rd variable

//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("After swaping");
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
	}

}
