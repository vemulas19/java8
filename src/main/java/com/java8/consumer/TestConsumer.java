package com.java8.consumer;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		String name = "Ravi";
		String city = "Hyderabad";
		String password = "chiranjeevi123";
		
		Consumer<String> cons = text->System.out.println(text);
		
		cons.accept(name);
		cons.accept(city);
		cons.accept(password);
		
	}
}
