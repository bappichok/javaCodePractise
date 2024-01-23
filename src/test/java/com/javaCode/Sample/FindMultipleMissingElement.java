package com.javaCode.Sample;

public class FindMultipleMissingElement {
	
	public static void findMultipleMissingNumber(int [] arr) {
		int[] register = new int[arr.length];
		
		for(int i: register) {
			register[i] =1;
		}
		
		System.out.println("Missing NUmber");
		for(int i=1;i<register.length;i++) {
			if(register[i]==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int [] number = {1,2,3,5,7};
		findMultipleMissingNumber(number);
	}

}
