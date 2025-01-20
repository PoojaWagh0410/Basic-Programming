package com.qspiders.day_2;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));
		
		int i = 0;
		int j = arr.length /2;
		
		while(j < arr.length) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j++;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
