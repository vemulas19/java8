package com.java8.interfacemethods;

public interface Interf1 {

	int a = 10;
	
	public void sum(int a, int b);
	default void sub(int a, int b){
		System.out.println("sub is : " + (a-b));
	}
}
