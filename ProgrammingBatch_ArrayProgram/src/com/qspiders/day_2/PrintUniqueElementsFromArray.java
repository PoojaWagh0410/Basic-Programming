package com.qspiders.day_2;

import java.util.Arrays;

public class PrintUniqueElementsFromArray {

//	public static void main(String[] args) {
//
//		int[] arr = { 10, 20, 30, 20, 40, 50, 50};
//
//		System.out.println("Before rotating the arrays :");
//		System.out.println(Arrays.toString(arr));
//
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] == arr[j] && i != j) {
//					count++;
//					break;
//				}
//			}
//			if (count == 1)
//				System.out.println(arr[i]);
//		}
//	}

//-----------------------------------------------------------------------------------
//----------------------------- OR --------------------------------------------------
//-----------------------------------------------------------------------------------

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 20, 40, 50, 50 };

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
//			boolean isUnique = true;
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
//					isUnique = false;
					count++;
					if (count > 1)
						break;
				}
			}
			if (count == 1)
				System.out.println(arr[i]);
		}
	}
}



