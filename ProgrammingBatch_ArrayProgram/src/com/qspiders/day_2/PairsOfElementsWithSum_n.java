package com.qspiders.day_2;

import java.util.Arrays;

//WAJP to print the paires of elements from a given array whose sum is equal to 'n'.
public class PairsOfElementsWithSum_n {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(Arrays.toString(arr));

		int n = 8;

		System.out.println("Following are the pairs whose sum is " + n);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) // j = i+1 to avoid duplicate pairs
			{
				if (arr[i] + arr[j] == n)
					System.out.println(arr[i] + ", " + arr[j]);

			}
		}
	}
}