package com.java8.constructerref;

public class TestSampleConstructorRef {

	public static void main(String[] args) {
		Interf i = Sample :: new;
		
		Sample s1 = i.getSample();
		Sample s2 = i.getSample();
		Sample s3 = i.getSample();
	}
}
