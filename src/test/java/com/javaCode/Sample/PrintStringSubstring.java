package com.javaCode.Sample;

public class PrintStringSubstring {

	public static void main(String[] args) {
		printSubString("Hello");

	}
	
	public static void printSubString(String input) {
		int n = input.length();
		for(int startIndex=0;startIndex<n;startIndex++) {
			for(int endIndex=startIndex+1;endIndex<=n;endIndex++){
				System.out.println(input.substring(startIndex,endIndex));
			}
		}
	}

}
