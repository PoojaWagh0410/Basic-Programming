package com.qspiders.day_3;

import java.util.Arrays;

public class TwoUnsortedArrayInSortedManner {

	public static void main(String[] args) {
		int[] arr1 = { 1, 12, 5, 7, 19 };
		int[] arr2 = { 2, 100, 6, 8, 10 };
		int[] arr3 = new int[arr1.length + arr2.length];
		int[] arr1_sort = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			for(int j = 0 ; j < arr1.length ; i++) {
				if(arr1[i] < arr1[j])
					arr1_sort[i] = arr1[i];
			}
		}
		System.out.println(Arrays.toString(arr1_sort));
	}
}
