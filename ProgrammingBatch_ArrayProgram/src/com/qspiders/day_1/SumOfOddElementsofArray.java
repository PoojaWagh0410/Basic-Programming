package com.qspiders.day_1;
//WAJP to create an integer array which is passed to a method and method returns the sum of odd elements.
public class SumOfOddElementsofArray {

	public static int sumOfOddElements(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1)
				sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(sumOfOddElements(arr) + " is the sum of odd elements of given array");
	}
}
