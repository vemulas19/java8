package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class TestForEach4 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("CB");
		items.add("D");
		items.add("E");
		
//		items.stream().filter(s->s.contains("B")).forEach(System.out::println);
		/*List<String> filteredItems = new ArrayList<>();
		
		for (String item : items) {
			if(!item.contains("B"))
				filteredItems.add(item);
		}*/
		
		items.removeIf(s->s.contains("B"));
		System.out.println(items);
		
	}
}
