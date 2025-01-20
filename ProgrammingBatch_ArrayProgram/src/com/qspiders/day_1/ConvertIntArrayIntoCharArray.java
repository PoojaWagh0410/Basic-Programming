package com.qspiders.day_1;
//WAJP and create a method which accepts an integer array and returns character array.
public class ConvertIntArrayIntoCharArray {
	
	public static char[] convertIntoCharArray(int[] arr1) {
		
		char charArr[] = new char[arr1.length];
		
		for(int i = 0 ; i < arr1.length; i++) {
			charArr[i] = (char) arr1[i];
		}
		return charArr;
	}
	
	public static void main(String[] args) {
	
		int[] arr = {65, 66, 67,68,69,70};
		char[] newCharArray = convertIntoCharArray(arr);
		
		for(int i = 0; i < newCharArray.length ; i++) {
			System.out.print(newCharArray[i]+", ");
		}
	}
}
