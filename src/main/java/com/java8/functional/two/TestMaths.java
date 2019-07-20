package com.java8.functional.two;

public class TestMaths {

	public static void main(String[] args) {
		IMaths mat = new MathsImpl();
		int result = mat.square(47);
		System.out.println("Square from Implementation : " + result);
	}
}
