package com.java8.function;

import java.util.function.Function;

public class FunctionStringUpper {

	public static void main(String[] args) {
		Function<String, String> f = text->text.toUpperCase();
		
		System.out.println(f.apply("Mahesh Babu"));
		System.out.println(f.apply("Vijay devarakonda"));
		System.out.println(f.apply("Pooja Hegde"));
		System.out.println(f.apply("Sampoornesh Babu"));
		System.out.println(f.apply("uppal balu"));
	}
}
