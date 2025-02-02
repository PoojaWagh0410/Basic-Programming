package com.qspiders.day_3;

import java.util.Arrays;

public class MergTwoSortedArrayInSortedManner {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9, 11, 12, 13 };
		int[] arr2 = { 2, 4, 6, 8, 10 };
		int[] arr3 = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}

		System.out.println(Arrays.toString(arr3));
	}
}
