package com.java8.predicate;

import java.util.function.Predicate;

public class TestPredicateLambda {

	public static void main(String[] args) {
		Predicate<Integer> p = t->t%2==0;
		System.out.println(p.test(45));
		System.out.println(p.test(66));
	}
}
