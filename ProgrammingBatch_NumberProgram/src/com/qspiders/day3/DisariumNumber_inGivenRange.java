package com.qspiders.day3;

public class DisariumNumber_inGivenRange {

	public static void main(String[] args) {

		int end = 100000;

		for (int start = 1; start <= end; start++) {
			int temp = start;
			int num = start;
			int sum = 0;
			int noOfDigits = 0;

			while (temp > 0) {
				noOfDigits++;
				temp /= 10;
			}

			while (num > 0) {
				int power = 1;
				int digit = num % 10;

				for (int i = 1; i <= noOfDigits; i++) {
					power = power * digit;
				}

				sum = sum + power;
				num /= 10;
				noOfDigits--;
			}

			if (start == sum)
				System.out.println(start);
		}

	}

}
