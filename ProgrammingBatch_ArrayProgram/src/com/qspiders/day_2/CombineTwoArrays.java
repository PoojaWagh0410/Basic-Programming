package com.qspiders.day_2;

import java.util.Arrays;
//WAJP to combine two given arrays.
public class CombineTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 50, 60, 70, 80 };
		
		System.out.println("Before combining the arrays :");
		System.out.println("arr1 : "+Arrays.toString(arr1));
		System.out.println("arr2 : "+Arrays.toString(arr2));

		int[] arr3 = new int[arr1.length + arr2.length];
		int index = 0;
		
			for (int i = 0; i < arr1.length; i++) {
				arr3[index] = arr1[i];
				index++;
			}

			for (int i = 0; i < arr2.length; i++) {
				arr3[index] = arr2[i];
				index++;
			}		

		System.out.println("After combining the Arrays :");
		System.out.println("arr3 : "+Arrays.toString(arr3));
	}
}
