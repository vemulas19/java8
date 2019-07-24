package com.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestSortedString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Samantha");
		list.add("Anushka");
		list.add("Deepika");
		list.add("Rakul");
		list.add("Priyanka");
		list.add("Parinithi");
		list.add("Bipasha");
		list.add("Ranveer");
		list.add("Ameer khan");
		
		/*Collections.sort(list, (s1,s2)->s2.compareTo(s1));*/
		List<String> sortedList = list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sortedList);
		
		
	}
}
