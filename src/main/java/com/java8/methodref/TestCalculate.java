package com.java8.methodref;

public class TestCalculate {

	
	public static void main(String[] args) {
		ICalculate cal = Calculater :: add;
		
		System.out.println(cal.sum(10, 20));
		System.out.println(cal.sum(30, 60));
	}
}
