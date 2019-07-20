package com.java8.functional.impl;

public class InterfAnonymous {

	public static void main(String[] args) {
		Interf in = new Interf() {
			
			@Override
			public void sum(int a, int b) {
				System.out.println("Sum from anonymous inner class is : " + (a+b));
				
			}
		};
		
		in.sum(20, 30);
	}
}
