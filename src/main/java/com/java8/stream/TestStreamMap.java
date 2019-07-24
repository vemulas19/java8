package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStreamMap {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(15);
		list.add(37);
		list.add(18);
		list.add(45);
		list.add(89);
		list.add(94);
		
		Predicate<Integer> p = n->n%2==0;
		for (Integer num : list) {
			if(p.test(num))
				System.out.println(num);
		}
		
		/*List<Integer> list2 = new ArrayList<>();
		for (Integer number : list) {
			number = number+5;
			list2.add(number);
		}
		list = list2;*/
		
		list = list.stream().map(n->n+5).collect(Collectors.toList());
		
		System.out.println(list);
	}
}
