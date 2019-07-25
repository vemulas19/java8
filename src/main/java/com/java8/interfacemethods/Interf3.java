package com.java8.interfacemethods;

public interface Interf3 {

	public void m1();
	default int m2(int a){
		return a*5;
	}
}
