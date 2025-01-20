package com.qspiders.day1;

import java.util.Scanner;
//Zero and negative number cannot be classified as Even and odd
public class EvenOddNumber {
		
		public static void checkEvenOddNumber(int num) {
//			if(num > 0) {
//				if(num % 2 == 0)
//					System.out.println(num+" is Even number");
//				else
//					System.out.println(num+" is Odd number");
//			}
//			else {
//				System.out.println("Invalid Number");
//			}
			
//-----------------------------------------------------------------
//------------- Find even odd without using % and / operator -------
		
			int temp = num;
			if(num > 0) {
				while(num > 0 ) {
					num -= 2;
				}
				
				if(num == 0) {
					System.out.println(temp+" is even number");
				}else {
					System.out.println(temp+" is odd number");
				}
			}
			else {
				System.out.println("Invalid Number");
			}
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Number : ");
			int num = scanner.nextInt();
			checkEvenOddNumber(num);
		}
}
