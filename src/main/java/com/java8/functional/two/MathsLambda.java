package com.java8.functional.two;

public class MathsLambda {

	public static void main(String[] args) {
		IMaths mat = num->num*num;
		
		System.out.println("Square value from Lambda : " + mat.square(57));
		System.out.println("Square value from Lambda : " + mat.square(25));
		System.out.println("Square value from Lambda : " + mat.square(89));
	}
}
