package com.java8.constructerref;

public class TestMobile {

	public static void main(String[] args) {
		Interf2 i = new Interf2Impl();
		
		Mobile m1 = i.getMobile("RedMi");
		Mobile m2 = i.getMobile("MotoG");
		Mobile m3 = i.getMobile("Samsung");
		
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		System.out.println(m3.getName());
		
	}
}
