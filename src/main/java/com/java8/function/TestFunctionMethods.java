package com.java8.function;

import java.util.function.Function;

public class TestFunctionMethods {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i->i*2;
		Function<Integer, Integer> f2 = i->i*i;
		Function<Integer, Integer> f3 = i->i-100;
		
		System.out.println(f1.apply(45));
		System.out.println(f2.apply(20));
		
		System.out.println(f1.andThen(f2).andThen(f3).apply(45));
		System.out.println(f1.compose(f2).compose(f3).apply(45));
	}
}
