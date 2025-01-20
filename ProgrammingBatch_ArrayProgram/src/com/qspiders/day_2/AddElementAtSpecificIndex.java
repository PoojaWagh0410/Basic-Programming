package com.qspiders.day_2;
import java.util.Arrays;
//WAJP to add an element in a given array at specific index.
public class AddElementAtSpecificIndex {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };

		System.out.println("Array before adding new element");
		System.out.println(Arrays.toString(arr));
		System.out.println("length of arr : " + arr.length);

		int[] newArr = new int[arr.length + 1];
		System.out.println("length of newArr : " + newArr.length);

		int ele = 678;
		int index = 2;
		
		int i = 0;// arr
		int j = 0;// newArr
		
		while (j < newArr.length) {
			if (j != index) {
				newArr[j] = arr[i];
				i++;
			}
			j++;			
		}

		newArr[index] = ele;
		arr = newArr;

		System.out.println("------Array after adding new element------");
		System.out.println(Arrays.toString(arr));
	}
}
