package com.javaCode.Sample;

public class ReverseStringWithoutChanginPosition {
	
	//to pointer one from left and 1 from right
	//if not a character increment left and decrement right
	
	//if character than swap and increment left and decrement right
	public static void revString(String inputString) {
		char [] ch = inputString.toCharArray();
		int i=0;
		int j= inputString.length()-1;
		
		while(i<j) {
			if(!Character.isAlphabetic(ch[i])) {
				i++;
			}
			if(!Character.isAlphabetic(ch[j])) {
				j--;
			
			}
			if(Character.isAlphabetic(ch [i]) && Character.isAlphabetic(ch[j])) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		String output = new String(ch);
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		revString("123abc@g!t#");
		revString("!12hel@o");
	}

}
