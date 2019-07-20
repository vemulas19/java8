package com.java8.predicate;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p = new PredicateImpl();
		System.out.println(p.test(45));
		System.out.println(p.test(56));
		System.out.println(p.test(53));
		System.out.println(p.test(78));
	}
}
