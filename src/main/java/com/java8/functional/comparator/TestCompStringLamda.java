package com.java8.functional.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompStringLamda {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("dhoni");
		list.add("virat");
		list.add("dhawan");
		list.add("rohit");
		list.add("jadeja");
		
		System.out.println(list);
		
		Collections.sort(list, (o1,o2)->o2.compareTo(o1));
		System.out.println(list);
		
	}

}
