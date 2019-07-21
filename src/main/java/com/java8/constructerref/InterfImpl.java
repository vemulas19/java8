package com.java8.constructerref;

public class InterfImpl implements Interf {

	@Override
	public Sample getSample() {
		return new Sample();
	}
}
