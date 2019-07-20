package com.java8.functional.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(70);
		list.add(10);
		list.add(30);
		list.add(60);
		list.add(7);
		list.add(90);
		
		System.out.println(list);
		
		Collections.sort(list, new MyComparatorForInt());
		System.out.println("order : " + list);
	}
}
