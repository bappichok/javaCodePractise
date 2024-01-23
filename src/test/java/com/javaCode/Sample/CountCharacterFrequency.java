package com.javaCode.Sample;

public class CountCharacterFrequency {

	public static void main(String[] args) {
		//enter character for which we need to find frequency
		//set initial char frequency tp 0
		//store string in char array
		countFrequency("Bappi", 'p');
		countFrequency("my name is popat laal", 'a');
		countFrequency("        " , ' ');
		
	}
	
	public static void countFrequency(String str, char ch) {
		int freq = 0;
		for(int i=0;i<str.length()-1;i++) {
			if(ch==str.charAt(i)) {
				freq++;
			}
		}
		System.out.println("Frequency of char : " + ch + " is :" + freq);
		
	}

}
