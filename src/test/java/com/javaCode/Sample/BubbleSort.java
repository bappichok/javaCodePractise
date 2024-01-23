package com.javaCode.Sample;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
	
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j] <arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					flag=true;
				}
			}
			if(!flag||flag==false) {
				break;
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {0,4,5,3,67,1,2,8};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
