package com.javaCode.Sample;

import java.util.HashMap;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "aa  bb  cc";
		char[] ch = name.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (!String.valueOf(c).isBlank()) {
				if (!map.containsKey(c)) {
					map.put(c, 1);

				}

				else {
					int count = map.get(c);
					map.put(c, count + 1);

				}
			}

		}
		for (char chr : map.keySet()) {
			System.out.print(chr);
			System.out.print(map.get(chr));

		}

		System.out.println(map);
	}

}
