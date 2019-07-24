package com.java8.stream;

import java.util.Arrays;

public class TestStreamOf {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,56,89};
		
		/*for (int i : a) {
			System.out.println(i);
		}*/
//		Arrays.stream(a).forEach(n->System.out.println(n));
		
		Arrays.stream(a).forEach(System.out::println);
		
	}
}
