package com.java8.functional.two;

public class MathsAnonymous {

	public static void main(String[] args) {
		IMaths mat = new IMaths() {
			@Override
			public int square(int num) {
				return num*num;
			}
		};
		
		System.out.println("Square value from anonymous inner class : " + mat.square(56));
	}
}
