package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(67);
		list.add(78);
		list.add(10);
		list.add(5);
		list.add(45);
		list.add(41);
		list.add(90);
		
		/*Collections.sort(list, (n1,n2)->n2-n1);*/
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
//		List<Integer> sortedList = list.stream().sorted((n1,n2)->n2-n1).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sortedList);
	}
}
