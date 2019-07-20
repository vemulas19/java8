package com.java8.functional.impl;

public class CalculatorImpl implements ICalculator {

	@Override
	public void calculate() {
		int a = 10;
		int b = 20;
		System.out.println("Calculation from implementaion class : " + ((a*b) + (b*a)));
		
	}

	
}
