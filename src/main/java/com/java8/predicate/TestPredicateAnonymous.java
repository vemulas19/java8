package com.java8.predicate;

import java.util.function.Predicate;

public class TestPredicateAnonymous {

	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		System.out.println(p.test(57));
		System.out.println(p.test(54));
		System.out.println(p.test(9786));
	}
}
