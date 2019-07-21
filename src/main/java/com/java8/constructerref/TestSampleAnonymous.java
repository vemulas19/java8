package com.java8.constructerref;

public class TestSampleAnonymous {

	public static void main(String[] args) {
		Interf i = new Interf() {
			
			@Override
			public Sample getSample() {
				return new Sample();
			}
		};
		
		Sample s1 = i.getSample();
		Sample s2 = i.getSample();
		Sample s3 = i.getSample();
	}
}
