package com.javaCode.Sample;

public class reverseString1 {
	
	public static void main(String[] args) {
		reverseString("!@Hello World ##");
	}

	public static void reverseString(String string) {
		
		char[] ch = string.toCharArray();
		int i=0;
		int j =string.length()-1;
		
		while(i<j) {
			if(!Character.isAlphabetic(ch[i])) {
				i++;
			}
			if(!Character.isAlphabetic(ch[j])) {
				j--;
			
			}
			if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j])) {
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]= temp;
				i++;
				j--;
			}
		}
		String input = new String(ch);
		System.out.println(input);
		
	}

	
	
}
