package com.qspiders.day_2;

import java.util.Arrays;

//WAJP to find out the smallest element present inside a given array.

public class SmallestElementOfArray {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 4, 1 };

		System.out.println(Arrays.toString(arr));

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " is the smallest element of array");
	}

}
