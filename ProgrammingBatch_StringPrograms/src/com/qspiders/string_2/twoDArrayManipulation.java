package com.qspiders.string_2;

import java.util.Arrays;

public class twoDArrayManipulation {

	public static void main(String[] args) {

		int[][] arr = { { 1, 0, 1 }, { 0, 0, 1 }, { 1, 1, 0 } };
		int[] r = { 1, 3, 1 };
		int[] c = { 2, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int temp[][] = new int[arr.length][arr.length];

		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < c.length; j++)
			{
				
		
				if (arr[i][j] == 1)
					temp[i][j] = 0;
				else if (arr[i][j] == 0)
					temp[i][j] = 1;
			}
		}

		System.out.println("--------------");
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}

	}

}
