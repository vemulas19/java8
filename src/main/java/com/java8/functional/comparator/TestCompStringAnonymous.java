package com.java8.functional.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCompStringAnonymous {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("dhoni");
		list.add("virat");
		list.add("dhawan");
		list.add("rohit");
		list.add("jadeja");
		
		System.out.println(list);
		
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		};
		
		Collections.sort(list, comp);
		System.out.println("order : " + list);
	}
	}


