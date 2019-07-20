package com.java8;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		Function<Integer, Integer> f = n->n*n;
		System.out.println(f.apply(14));
		System.out.println(f.apply(56));
		System.out.println(f.apply(10));
	}
	
}
