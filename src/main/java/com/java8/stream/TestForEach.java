package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(67);
		list.add(78);
		list.add(10);
		list.add(5);
		list.add(45);
		list.add(41);
		list.add(90);
		
//		list.stream().forEach(n->System.out.println(n));
		list.stream().forEach(System.out::println);
//		System.out.println(list);
		/*for (Integer num : list) {
			System.out.println(num);
		}*/
	}
}
