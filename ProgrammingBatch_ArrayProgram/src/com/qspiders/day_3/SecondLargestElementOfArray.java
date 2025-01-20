package com.qspiders.day_3;

import java.util.Arrays;

//WAJP to find out the second largest element in a given array.

public class SecondLargestElementOfArray {

//	public static void main(String[] args) {
//
//		int[] arr = { 10, 20, 30, 40, 50, 10, 30, 40 };
//		System.out.println(Arrays.toString(arr));
//
//		int largest = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > largest) {
//				largest = arr[i];
//			}
//		}
//		
//		int secondLargest = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > secondLargest && arr[i] != largest) {
//				secondLargest = arr[i];
//			}
//		}
//		
//		System.out.println(secondLargest);
//	}
//-------------------------------------------------------------------------------
//-------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
				int[] arr = { 10, 20, 30, 40, 50, 10, 30, 40 };
				System.out.println(Arrays.toString(arr));
				
				int largest = Integer.MIN_VALUE;
				int SecondLargest = Integer.MIN_VALUE;
				
				for(int i = 0; i < arr.length; i++	) {
					if(arr[i] > largest) {
						SecondLargest = largest;
						largest =  arr[i];
					}
					else if(arr[i] > SecondLargest && arr[i] != largest) {
						SecondLargest = arr[i];
					}
				}
				
				System.out.println(SecondLargest);
				
	}
}





















