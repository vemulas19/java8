package com.java8;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 t = new Test2();
		System.out.println(t.isEven(10));
		System.out.println(t.isEven(1056));
		System.out.println(t.isEven(102));
		System.out.println(t.isEven(101));
	}
	
	public boolean isEven(int number) {
		if(number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
