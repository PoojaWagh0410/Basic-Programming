package com.qspiders.day3;

public class ArmStrongNumber_inGivenRange {

	public static void main(String[] args) {

		int end = 100000;

		for (int start = 1; start <= end; start++) {
			int originalNum = start;
			int sum = 0;
			int count = 0;
			int temp = originalNum;
			int num = originalNum;

			while (temp > 0) {
				count++;
				temp /= 10;
			}

			while (num > 0) {
				int power = 1;
				int digit = num % 10;

				for (int i = 1; i <= count; i++) {
					power = power * digit;
				}
				sum += power;
				num /= 10;
			}

			if (sum == originalNum)
				System.out.println(originalNum);
		}
	}
}
