package com.java8.functional.impl;

public class InterfLambda {

	public static void main(String[] args) {
		Interf in = (a,b)->System.out.println("sum from lambda is :  " + (a+b));
		
		in.sum(20, 50);
	}
}
