package com.qspiders.day_2;

import java.util.Arrays;

//WAJP to find out the largest element present inside a given array.

public class LargestElementOfArray {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 30, 50, 20, 567 };

		System.out.println(Arrays.toString(arr));

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max + " is the largest element of array");

	}

}
