package com.java8.consumer;

import java.util.function.Consumer;

public class TestConsumerMethods {

	public static void main(String[] args) {
		Consumer<Integer> cons1 = n->System.out.println("Multiplication is : " + (n*2));
		Consumer<Integer> cons2 = n->System.out.println("Devide is  : " + (n/2));
		Consumer<Integer> cons3 = n->System.out.println("Sub is : " + (n-2));
		Consumer<Integer> cons4 = n->System.out.println("Addition is : " + (n+2));
		
		cons1.andThen(cons2).andThen(cons3).andThen(cons4).accept(4);
	}
}
