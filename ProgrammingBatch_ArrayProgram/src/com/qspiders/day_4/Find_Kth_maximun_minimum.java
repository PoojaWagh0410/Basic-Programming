package com.qspiders.day_4;

import java.util.Arrays;

public class Find_Kth_maximun_minimum {
	// Array should not contains duplicates
	// and must be sorted in descending order, othetrwise change the logic.

	public static void main(String[] args) {
		int[] arr = { 10, 40, 60, 70, 20, 50, 30, 90, 80 };

		int k = 2;
		Arrays.sort(arr);

		System.out.println(k + " th Maximun element is : " + arr[arr.length - k]);
		System.out.println(k + " th minimum element is : " + arr[k - 1]);
	}
}
