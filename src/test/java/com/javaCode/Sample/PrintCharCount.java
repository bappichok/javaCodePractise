package com.javaCode.Sample;

public class PrintCharCount {

	public static void main(String[] args) {
		
		String str ="a9b3c1";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
			else {
				int temp = Character.getNumericValue(str.charAt(i));
				for(int j=1;j<temp;j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}

	}

}
