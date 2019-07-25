package com.java8.interfacemethods;

public class TestImpl implements Interf1, Interf2 {

	@Override
	public void sum(int n1, int n2) {
		System.out.println("sum of : " + (n1+n2));
	}

	@Override
	public void sub(int a, int b) {
		Interf1.super.sub(a, b);
	}

	public static void main(String[] args) {
		Interf1 i1 = new TestImpl();
		i1.sum(10, 20);
		Interf2 i2 = new TestImpl();
		i2.sum(30, 40);
		i1.sub(20, 10);
		i2.sub(5, 8);
	}

}
