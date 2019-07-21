package com.java8.constructerref;

public class Test {

	public static void main(String[] args) {
		Interf i = new InterfImpl();
		Sample s1 = i.getSample();
		Sample s2 = i.getSample();
		Sample s3 = i.getSample();
	}
}
