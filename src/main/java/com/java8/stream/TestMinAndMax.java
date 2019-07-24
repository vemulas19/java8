package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class TestMinAndMax {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(67);
		list.add(78);
		list.add(10);
		list.add(5);
		list.add(45);
		list.add(41);
		list.add(90);
		
		System.out.println(list);
		
		Integer resultMin = list.stream().min((n1,n2)->n2-n1).get();
		Integer resultMax = list.stream().max((n1,n2)->n2-n1).get();
		System.out.println(resultMin);
		System.out.println(resultMax);
	}
}
