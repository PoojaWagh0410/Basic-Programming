package com.qspiders.day_3;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {

		int[] arr = { 1,2,3,1,1,3,4,5,6,3 };
//		int[] arr = {1,2,3,4,5,6};
		System.out.println("Array before removing duplicates : ");
		System.out.println(Arrays.toString(arr));

		int k = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			boolean flag = false;
			for(int j = i-1; j >= 0 ; j--) {
				if(arr[j] == arr[i]) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				k++;
				if(i != k) {
					int temp = arr[k];
					arr[k] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Array after removing duplicate : ");
		arr = Arrays.copyOf(arr, k+1);
		System.out.println(Arrays.toString(arr));

	}

}
