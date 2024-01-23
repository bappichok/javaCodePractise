package com.javaCode.Sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {

		String values[] = { "Bappi", "Aarti", "Priyaansh", "Bappi" };

		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i].equals(values[j])) {
					System.out.println(values[i]);
				}
			}
		}

		/// Using Hash Set

		Set<String> data = new HashSet<String>();

		for (String e : values) {
			if (data.add(e) == false) {
				System.out.println(e);
			}
		}

		// Using HashMap

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String e : values) {
			Integer count = map.get(e);
			if (count == null) {
				map.put(e, 1);
			} else {
				map.put(e, ++count);
			}
		}

		// print all the duplicate values
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		
		Set<String> dataSet = new HashSet<String>();
		
		Set<String> duplicateValue = Arrays.asList(values).stream().filter(e->!dataSet.add(e)).collect(Collectors.toSet());
		
		System.out.println(duplicateValue);
	}
	


}
