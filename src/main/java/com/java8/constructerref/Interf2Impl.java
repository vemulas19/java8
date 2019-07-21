package com.java8.constructerref;

public class Interf2Impl implements Interf2 {

	@Override
	public Mobile getMobile(String name) {
		return new Mobile(name);
	}

}
