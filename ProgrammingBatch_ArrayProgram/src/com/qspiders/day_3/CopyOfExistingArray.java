package com.qspiders.day_3;

import java.util.Arrays;

public class CopyOfExistingArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] copy = new int[arr.length];
		//Shallow Array
		//In shallow copy, new array object is created
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("Copy : "+Arrays.toString(copy));
		
		//Deep copy
		//In case of deep copy, new array object will not create
		int[] copy2 = arr;
		System.out.println("Copy2 : "+Arrays.toString(copy2));
		
		System.out.println("arr : "+arr);
		System.out.println("copy : "+copy);
		System.out.println("copy2 : "+copy2);
	}

}
