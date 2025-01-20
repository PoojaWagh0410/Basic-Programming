package com.qspiders.day_2;

import java.util.Arrays;

public class RotateArrayLHS_for_n_times {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };

		int n = 1;
		n = n % arr.length;

		System.out.println("Before rotating the arrays :");
		System.out.println(Arrays.toString(arr));

		while (n > 0) {
			int temp = arr[0];
			// ----------------
//			for (int i = 0; i < arr.length - 1; i++) {
//				arr[i] = arr[i + 1];
//			}
//-------------------- OR ------------------------
			for (int i = 1; i < arr.length; i++) {
				arr[i - 1] = arr[i];
			}
			// ------------
			arr[arr.length - 1] = temp;
			n--;
		}
		System.out.println("After rotating the arrays :");
		System.out.println(Arrays.toString(arr));
	}
}
