package com.qspiders.day_2;

//WAJP to rotate the given array to the right hand side 'n' number of times.(Clockwise direction)
import java.util.Arrays;

public class RotateArrayRHS_for_n_times {

	public static void main(String[] args) {
		int[] arr = { 10,20,30,40 };

		int n = 3;
		n = n % arr.length;//this is bcz, if 'n' is multiple of no. of elements of array, then it gives the same array

		System.out.println("Before rotating the arrays :");
		System.out.println(Arrays.toString(arr));

		while(n > 0) {
			int temp = arr[arr.length-1];
			
			for(int i = arr.length - 1 ; i > 0 ; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			n--;
		}
		System.out.println("After rotating the arrays :");
		System.out.println(Arrays.toString(arr));

	}
}
