package com.javaCode.Sample;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "   AB J V A AA    ";
		
		String trimmedString = str.replaceAll("\\s", "");
		System.out.println(trimmedString);

	}

}
