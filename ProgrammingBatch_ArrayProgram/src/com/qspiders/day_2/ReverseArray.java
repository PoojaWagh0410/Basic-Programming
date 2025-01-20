package com.qspiders.day_2;

import java.awt.geom.Area;
import java.util.Arrays;

//1) WAJP to reverse the order of elements in an array

public class ReverseArray {
	
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 ,60};
		System.out.println("Before swaping");
		System.out.println(Arrays.toString(arr));

		int i = 0;
		int j = arr.length - 1;
		
			while(i < j){
				int temp = arr[i];
				arr[i] = arr[j]; 
				arr[j] = temp;
				i++;
				j--;
			}
	
		
		System.out.println("------------------------");

		System.out.println("After swaping");
		System.out.println(Arrays.toString(arr));
	}

}




		

