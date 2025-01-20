package com.qspiders.day3;

public class NeonNumber_inGivenRange {
	
	public static void main(String[] args) {
		int end =1200000;
		
		for(int start =1; start <= end ; start++) {
			int num = start;
			int square = num * num;
			int temp = square;
			int sum = 0;

			while (temp > 0) {
				int digit = temp % 10;
				sum = sum + digit;
				temp /= 10;
			}
			
			if(num == sum) {
				System.out.println(num);
			}

		}
	}

}
