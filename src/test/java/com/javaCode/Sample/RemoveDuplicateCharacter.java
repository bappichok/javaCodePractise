package com.javaCode.Sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// Using Java 8
		removeDuplicateUsingStream("bappipppipipasdp");
		
		removeUsingIndex("hello worlddd");
		
		
		removeUsingSet("experience");

	}

	public static void removeDuplicateUsingStream(String input) {
		StringBuilder sb = new StringBuilder();

		input.chars().distinct().forEach(e -> sb.append((char) e));
		
		//input.chars().mapToObj(e->(char) e).filter(c->!Character.isWhitespace(c)).map(Character::toLowerCase).distinct().forEach(sb::append);

		System.out.println(sb);
	}
	
	//using indexOf Method
	
	public static void removeUsingIndex(String input2) {
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i<input2.length();i++) {
			char ch = input2.charAt(i);
			
			//int index = input2.indexOf(ch,i+1);
			if(sb1.indexOf(String.valueOf(ch)) == -1) {
				sb1.append(ch);
			}			
		}
		System.out.println(sb1.toString());
		
	}
	
	//using set interface
	
	public static void removeUsingSet(String value) {
		StringBuilder sb3 = new StringBuilder();
		
		Set<Character> set =new LinkedHashSet<Character>();
		
		for(int i=0;i<value.length();i++) {
			set.add(value.charAt(i));
		}
		
		for(Character c:set) {
			sb3.append(c);
		}
		
		System.out.println(sb3);
	}

}
