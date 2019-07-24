package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStream {

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
		
		List<Integer> evenList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> oddList = list.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
		/*Predicate<Integer> p = n->n%2==0;
		
		for (Integer number : list) {
			if(p.test(number))
				evenList.add(number);
			else
				oddList.add(number);
		}*/
		
		
		System.out.println(evenList);
		System.out.println(oddList);
	}
	
	
}
