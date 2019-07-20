package com.java8.function;

import java.util.function.Function;

public class TestFunctionSquare {

	public static void main(String[] args) {
		/*TestFunctionSquare test = new TestFunctionSquare();
		System.out.println(test.square(10));
		System.out.println(test.square(12));
		System.out.println(test.square(15));
		System.out.println(test.square(17));*/
		
		Function<Integer, Integer> f = t->t*t;
		
		System.out.println(f.apply(10));
		System.out.println(f.apply(14));
		System.out.println(f.apply(35));
		System.out.println(f.apply(45));
	}
	
	/*public int square(int num) {
		return num*num;
	}*/
}
