package com.qspiders.day_3;

import java.util.Arrays;

//WAJP to print an element along with its frequency in given array.

public class FrequencyOfElementsFromArray {
//
//	public static void main(String[] args) {
//
//		int[] arr = { 10, 20, 30, 40, 50, 10, 30, 40 };
//		System.out.println(Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length; i++) {
//			boolean[] isVisited = new boolean[arr.length];
//
//				int count = 1;
//
//				for (int j = i + 1; j < arr.length; j++) {
//
//					if (arr[j] == arr[i]) {
//						count++;
//						isVisited[j] = true;
//					}
//				}
//				System.out.println(arr[i] + " : " + count);
//			}
//		}
//	}

//---------------------------------------------------------------------

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 10, 30, 40 };
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != -1) {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						arr[j] = -1;
					}
				}
				System.out.println(arr[i] + " : " + count);
			}
		}
	}
}
