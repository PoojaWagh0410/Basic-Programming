package com.qspiders.day_2;

import java.util.Arrays;
//WAJP to combine two given arrays in Zig zag manner.

//This logic will work for if both the arrays contains different different no. of elements
public class CombineArraysInZigZagManner {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		int[] arr2 = { 1, 2, 3 };

		System.out.println("Before combining the arrays :");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int temp[] = new int[arr1.length + arr2.length];

		int min = arr1.length;
		if (arr2.length < arr1.length)
			min = arr2.length;

		int index = 0;
		for (int i = 0; i < min; i++) {
			temp[index] = arr1[i];
			index += 2;
		}

		index = 1;
		for (int i = 0; i < min; i++) {
			temp[index] = arr2[i];
			index += 2;
		}

		index--;
		for (int i = min; i < arr1.length; i++) {
			temp[index] = arr1[i];
			index++;
		}

		for (int i = min; i < arr2.length; i++) {
			temp[index] = arr2[i];
			index++;
		}

		System.out.println("------ After combining ----------");
		System.out.println(Arrays.toString(temp));
	}
}
