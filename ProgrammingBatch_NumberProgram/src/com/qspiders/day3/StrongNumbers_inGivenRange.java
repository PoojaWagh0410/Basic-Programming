package com.qspiders.day3;

public class StrongNumbers_inGivenRange {

	public static void main(String[] args) {
		int end = 100000;
		for (int start = 1; start <= end; start++) {
			int temp = start;
			int sum = 0;
			while (temp > 0) {
				int digit = temp % 10;
				int fact = 1;
				for (int i = 2; i <= digit; i++) {
					fact = fact * i;
				}

				sum += fact;
				temp /= 10;
			}

			if (start == sum)
				System.out.println(start);
		}

	}

}
