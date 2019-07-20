package com.java8.functional.impl;

public class TestAnonymous {

	public static void main(String[] args) {
		ICalculator cal = new ICalculator() {
			@Override
			public void calculate() {
				int a = 30;
				int b = 32;
				System.out.println("Calculation from anonymous inner class : " + ((a*b) + (b*a)));
				
			}
		};
		
		cal.calculate();
		
	}
}
