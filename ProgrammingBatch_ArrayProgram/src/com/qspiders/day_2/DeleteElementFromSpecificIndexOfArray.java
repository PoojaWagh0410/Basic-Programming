package com.qspiders.day_2;
//WAJP to delete an element from specific index.

import java.util.Arrays;

public class DeleteElementFromSpecificIndexOfArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 654, 30, 40, 50 };

		System.out.println("Array before deleting element");
		System.out.println(Arrays.toString(arr));
		System.out.println("length of arr : " + arr.length);

		int[] temp = new int[arr.length - 1];
		System.out.println("length of temp : " + temp.length);

		int index = 2;

		int i = 0;// arr
		int j = 0;// temp

		while(j < temp.length) { 
			if (i != index) {
				temp[j] = arr[i];
				j++;
			}
			i++;
		}
		arr = temp;
		System.out.println("--------Array after deleting element----------");
		System.out.println(Arrays.toString(arr));
	}

}
