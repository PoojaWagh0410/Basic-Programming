package com.qspiders.day_2;

import java.util.Arrays;

// WAJP to swap first half of an array with the second half of array

public class swapFirstHalfWithSecondHalfOfArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		if (arr.length % 2 == 0) {

			System.out.println("Array before swapping havles");
			System.out.println(Arrays.toString(arr));

			int i = 0;
			int j = arr.length / 2;

			while (j < arr.length) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
			System.out.println("---------------------------");
			System.out.println("Array after swapping havles");
			System.out.println(Arrays.toString(arr));
		} else
			System.out.println(
					"Invalid no.of elements in an array, can't perform swaping operation on odd no.elements of array");

	}
}
