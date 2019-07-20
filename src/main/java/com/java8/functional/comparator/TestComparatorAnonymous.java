package com.java8.functional.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparatorAnonymous {

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
		
		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		};
		
		Collections.sort(list, comp);
		System.out.println("order from anonymous : " + list);
	}
}
