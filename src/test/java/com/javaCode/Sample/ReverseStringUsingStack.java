package com.javaCode.Sample;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static String revStrStack(String str) {

		Stack<Character> stacks = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			stacks.push(str.charAt(i));
		}
		String reversedString = "";

		while (!stacks.empty()) {
			reversedString += stacks.pop();

		}
		return reversedString;
	}

	public static void main(String[] args) {
		System.out.println(revStrStack("Bappi"));
	}
}
