package com.javaCode.Sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterOccurance {

	public static void main(String[] args) {

		countCharOccurance("ab bc ddd");

	}

	public static void countCharOccurance(String input) {

		char[] chr = input.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : chr) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, count + 1);
			}
		}
		for (char c : map.keySet()) {
			System.out.print(c);
			System.out.print(map.get(c));
		}
	}
}