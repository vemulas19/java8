package com.java8.functional.comparator;

import java.util.Comparator;

public class MyComparatorForInt implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}

}
