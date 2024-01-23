package com.javaCode.Sample;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
		String str = "!@#abC123)()(";
		
		String plain = str.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(plain);

	}

}
