package com.qspiders.day_3;

import java.util.Arrays;

public class SecondSmallestElementOfArray {
	
//	public static void main(String[] args) {
//
//		int[] arr = { 10, 20, 30, 40, 30, 50, 20, 567 };
//
//		System.out.println(Arrays.toString(arr));
//		
//		int smallest = Integer.MAX_VALUE;
//		int secondSmallest = Integer.MAX_VALUE;
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			if(arr[i] < smallest) {
//				secondSmallest = smallest;
//				smallest = arr[i];
//			}
//		}
//		
//		for(int i = 0 ; i < arr.length ;  i++) {
//			if(arr[i] < secondSmallest && arr[i] != smallest) {
//				secondSmallest = arr[i];
//			}
//		}
//		
//		System.out.println(secondSmallest);
//		
//	}
	
//-----------------------------------------------------------------------
//-----------------------------------------------------------------------
//-----------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30, 40, 20, 50, 10, 30, 40 };
		System.out.println(Arrays.toString(arr));
		
		int smallest = Integer.MAX_VALUE;
		int SecondSmallest = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++	) {
			if(arr[i] < smallest) {
				SecondSmallest = smallest;
				smallest =  arr[i];
			}
			else if(arr[i] < SecondSmallest && arr[i] != smallest) {
				SecondSmallest = arr[i];
			}
		}
		
		System.out.println(SecondSmallest);
		
}
}
