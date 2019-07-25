package com.java8.interfacemethods;

public class Interf3Impl implements Interf3 {

	@Override
	public void m1() {
		System.out.println("m1 method from implementation!!");
	}

	public static void main(String[] args) {
		System.out.println("test");
		Interf3 i3 = new Interf3Impl();
		i3.m1();
		System.out.println(i3.m2(67));
	}
}