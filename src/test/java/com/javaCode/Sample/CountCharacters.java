package com.javaCode.Sample;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {
		// change string to charArray
		// create a hashmap and one counter
		// if key is present increment counter, if not add in map

		String str = "   Bappi Chokhani   ";

		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : chars) {
			if(!String.valueOf(c).isBlank()) {
			// to ignore spaces

			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int count = map.get(c);
				map.put(c, count + 1);
			}
			
		}
		}
		System.out.println(map);
	}
}
