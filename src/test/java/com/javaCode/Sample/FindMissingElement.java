package com.javaCode.Sample;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num [] = {1,3,4,5};
		int n1 = findMissingElement(num);
		System.out.println(n1);

	}
	
	public static int findMissingElement(int [] num) {
		
		int totalCount = (num.length)+1;
		int expSum = totalCount * (totalCount+1)/2;
		int actualSum = 0;
		
		for(int i :num) {
			actualSum+=i;
			
		}
		return expSum-actualSum;
	}

}
