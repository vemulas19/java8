package com.java8.methodref;

public class Calculater {

	static int d = 10;
	public static int add(int num1, int num2) {
		System.out.println(d);
		System.out.println("Entered number1 is : " + num1);
		System.out.println("Entered number2 is : " + num2);
		int c = num1+num2;
		return c;
	}
}
