package com.javaCode.Sample;

import java.util.stream.IntStream;

public class RecursionSample {

	public static void main(String[] args) {
		
		printNumber();
		printNumberUsingRecrsion(5,20);
	}
	
	public static void printNumber() {
		IntStream.range(1, 101).forEach(e->System.out.print(" " + e));
		
	}
	
	public static void printNumberUsingRecrsion(int startNum, int endNum) {
		if(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			printNumberUsingRecrsion(startNum, endNum);
		}
	}
}
