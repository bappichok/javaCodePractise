package com.javaCode.Sample;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		System.out.println("Original Array " + Arrays.toString(arr));
		revArray(arr);
		System.out.println("Reversed arrys is: "  +Arrays.toString(arr));

	}

	private static void revArray(int[] arr) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
	}

}
