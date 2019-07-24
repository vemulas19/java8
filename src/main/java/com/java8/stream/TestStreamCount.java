package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStreamCount {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(94);
		list.add(15);
		list.add(37);
		list.add(89);
		list.add(18);
		list.add(30);
		list.add(45);
		
/*		int count = 0;
		for (Integer num : list) {
			if(num>60)
				count++;
		}
		System.out.println(count);*/
		
		long count = list.stream().filter(n->n>60).count();
		System.out.println(count);
	}
}
