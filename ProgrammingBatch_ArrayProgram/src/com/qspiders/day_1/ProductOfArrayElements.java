package com.qspiders.day_1;

public class ProductOfArrayElements {
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int product = 1;

		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		System.out.println(product);
	}
}
