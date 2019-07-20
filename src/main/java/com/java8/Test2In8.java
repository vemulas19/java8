package com.java8;

import java.util.function.Predicate;

public class Test2In8 {

	public static void main(String[] args) {
		Predicate<Integer> p = n->n%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(101));
		System.out.println(p.test(10345));
		System.out.println(p.test(345));
	}
}
