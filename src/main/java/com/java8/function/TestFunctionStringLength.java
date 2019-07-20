package com.java8.function;

import java.util.function.Function;

public class TestFunctionStringLength {

	public static void main(String[] args) {
		Function<String, Integer> f = text->text.length();
		System.out.println(f.apply("virat"));
		System.out.println(f.apply("Dhoni"));
		System.out.println(f.apply("Rohit"));
		System.out.println(f.apply("Jadeja"));
	}
}
