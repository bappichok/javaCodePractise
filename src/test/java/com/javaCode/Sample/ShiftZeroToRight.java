package com.javaCode.Sample;

import java.util.Arrays;

public class ShiftZeroToRight {
	
	public static int[] shiftZero(int[] a) {
		
		//Logic: if array length is 1 return same arry
		//2.create a newArray to store the value, create a counter to increment
		//3.if my number!=0 than store value in newArray and increment the counter
		
		if(a.length==1) {
			return a ;
		}
		int count =0;
		int newArray[] = new int[a.length];
		for(int number: a) {
			if(number!=0) {
				newArray[count]=number;
				count++;
			}
		}
		return newArray;
	}
	
	
	public static void main(String[] args) {
		
		int i[] = {10,2,03,0,5,0,0,0};
		System.out.println(Arrays.toString(shiftZero(i)));
	}

}
