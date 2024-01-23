package com.javaCode.Sample;

public class FibonacciSeries {

	public static void main(String[] args) {

		

		extracted(16);
		
		extracted(8);

	}

	private static void extracted(int n) {
		
		int first=0;
		int second=1;
		
		for(int i=0;i<n;i++) {
			System.out.print(first + " ");
			int temp = first+second;
			first=second;
			second =temp;
		}
		System.out.println();
	}
}
