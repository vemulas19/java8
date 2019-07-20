package com.java8.functional.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompString {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("dhoni");
		list.add("virat");
		list.add("dhawan");
		list.add("rohit");
		list.add("jadeja");
		
		System.out.println(list);
		MyComparatorForStrg comp = new MyComparatorForStrg();
		Collections.sort(list, comp);
		System.out.println("order : " + list);
	}

}
