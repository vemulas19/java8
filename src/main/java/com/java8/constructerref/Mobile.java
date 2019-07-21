package com.java8.constructerref;

public class Mobile {

	private String name;

	public Mobile() {
		System.out.println("No arg constructor!!");
	}
	
	public Mobile(String name) {
		System.out.println("Mobile object created!!");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
