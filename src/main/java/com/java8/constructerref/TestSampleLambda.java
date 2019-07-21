package com.java8.constructerref;

public class TestSampleLambda {

	public static void main(String[] args) {
		Interf i = ()->new Sample();
		
		Sample s1 = i.getSample();
		Sample s2 = i.getSample();
		Sample s3 = i.getSample();
	}
}
