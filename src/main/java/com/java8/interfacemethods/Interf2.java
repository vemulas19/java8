package com.java8.interfacemethods;

public interface Interf2 {

	int a = 15;
	
	public void sum(int a, int b);
	default void sub(int a, int b){
		System.out.println("sub is : " + (b-a));
	}
}
