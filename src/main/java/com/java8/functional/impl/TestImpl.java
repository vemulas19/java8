package com.java8.functional.impl;

public class TestImpl {

	public static void main(String[] args) {
		ICalculator cal = new CalculatorImpl();
		cal.calculate();
	}
}
