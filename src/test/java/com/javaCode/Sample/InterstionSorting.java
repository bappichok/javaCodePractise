package com.javaCode.Sample;

import java.util.Arrays;

public class InterstionSorting {
	
	public static void interstionSort(int arr[]) {
		
		for(int i =1;i<arr.length;i++) {
			int counter = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > counter) {
				arr[j+1] =arr[j];
				j--;
			}
			arr[j+1] = counter;
		}
		System.out.print(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int arr[] = {8,4,2,1,3};
		interstionSort(arr);
	}

}
