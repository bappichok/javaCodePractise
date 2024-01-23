package com.javaCode.Sample;

public class reverseString {

	public static void main(String[] args) {

		revString("Hello World");

		System.out.println("***************** CharAt Method***************");
		
		//2.Method : using charAt index method

		revStringCharAt("Hello Java");

		System.out.println("----------Using String Buffer -----------");

		revUsingStringBuffer("Testing");
		
		System.out.println("----------Using String Builder -----------");

		revUsingStringBuilder("Automation");

	}

	public static void revString(String str) {
		char[] reverseString = str.toCharArray();

		for (int i = reverseString.length - 1; i >= 0; i--) {
			System.out.print(reverseString[i]);

		}
	}

	public static void revStringCharAt(String strChar) {

		for (int i = strChar.length() - 1; i >= 0; i--) {
			System.out.print(strChar.charAt(i));
		}
	}

	public static void revUsingStringBuffer(String stBuff) {

		StringBuffer sb = new StringBuffer(stBuff);

		System.out.println(sb.reverse());
	}
	
	public static void revUsingStringBuilder(String strBuilder) {
		StringBuilder sb1 = new StringBuilder(strBuilder);
		System.out.println(sb1.reverse());
	}

}
