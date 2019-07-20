package com.java8.functional.impl;

public class TestLambda {

	public static void main(String[] args) {
		ICalculator cal = ()->{
			int a = 50;
			int b = 40;
			System.out.println("Calculation from Lambda expression : " + ((a*b) + (b*a)));
		};
		
		cal.calculate();
	}
}
