package com.javaCode.Sample;

import java.util.Arrays;

public class AnagramString {

	// remove whitespaces
	// check the length of string
	// convert to lower case and store it in char array
	// sort the char array
	public static boolean isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		return (Arrays.equals(c1, c2));

	}

	public static void main(String[] args) {
		System.out.println(isAnagram("Bappi", "Aarti"));
		System.out.println(isAnagram("mary", "army"));
	}

}
