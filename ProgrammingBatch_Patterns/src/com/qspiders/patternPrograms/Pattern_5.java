package com.qspiders.patternPrograms;

import java.util.Scanner;

//	      *       
//      * *     
//    * * *   
//  * * * *       
//* * * * * 

public class Pattern_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Eneter n : ");
		int n = scanner.nextInt();
		
		for(int i = 1 ; i <= n ; i++) 
		{
			for(int j = 1 ; j <= n ; j++) 
			{
				if (i+j >= n+1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
