package com.qspiders.day_3;

import java.util.Arrays;
//Bubble sort algorithm
public class SortArrayInDescendingOrder {

	public static void main(String[] args) {

		int[] arr = { 70, 40, 10, 60, 80, 50, 30, 90, 20 };
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting in Descending order");
		System.out.println(Arrays.toString(arr));
	}
}
