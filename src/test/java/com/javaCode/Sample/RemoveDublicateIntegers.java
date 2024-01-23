package com.javaCode.Sample;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDublicateIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {22,44,55,66,22,33,1,2,3};
		
		Arrays.sort(arr);
		int minArrayElement = Integer.MAX_VALUE;
		int maxArrayEelemnt = Integer.MIN_VALUE;
		
		for (int i : arr) {

			if (i < minArrayElement) {
				minArrayElement = i;
			}
			if (i > maxArrayEelemnt) {
				maxArrayEelemnt = i;
			}
		}	
		System.out.println(minArrayElement + " " + maxArrayEelemnt);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}

}
