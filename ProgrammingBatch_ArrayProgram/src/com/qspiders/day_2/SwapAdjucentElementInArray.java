package com.qspiders.day_2;

import java.util.Arrays;

//WAJP to swap adjucent elements in an array

public class SwapAdjucentElementInArray {

//	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 40, 50, 60 };
//		System.out.println("Before swaping");
//		System.out.println(Arrays.toString(arr));
//
//		int i = 0;
//		int j = i + 1;
//
////		while (i < arr.length - 1) {
//		while (j < arr.length ) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			i = i + 2;
//			j = j + 2;
//		}
//
//		System.out.println("------------------");
//		System.out.println("After swaping");
//		System.out.println(Arrays.toString(arr));
//	}

//--------------------------------------------------------------------
	// -------------------------------------------------------

//	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 40, 50, 60 ,70};
//		System.out.println("Before swaping");
//		System.out.println(Arrays.toString(arr));
//
//		int i =1;
//
//		while (i < arr.length ) {
//			int temp = arr[i - 1];
//			arr[i - 1] = arr[i];
//			arr[i] = temp;
//			i = i + 2;
//		}
//
//		System.out.println("------------------");
//		System.out.println("After swaping");
//		System.out.println(Arrays.toString(arr));
//	}
//------------------------------------------------------
//------------------------------------------------------
//------------------------------------------------------

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("Before swaping");
		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i += 2) {
			int temp = arr[i - 1];
			arr[i - 1] = arr[i];
			arr[i] = temp;
		}
		System.out.println("After swaping");
		System.out.println(Arrays.toString(arr));
	}
}
