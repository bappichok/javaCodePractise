package com.javaCode.Sample;

public class CheckSubString {

	public static void main(String[] args) {
		
		System.out.println(isSubString("Bappi Chokhani", "Bappi"));
		System.out.println(isSubString1("Bappi Chokhani", "Chokhani"));

	}

	public static boolean isSubString(String main, String sub) {
		// TODO Auto-generated method stub
		return main.matches("(.*)" + sub + "(.*)");
	}
	
	public static boolean isSubString1(String main, String sub) {
		return main.contains(sub);
	}

}
