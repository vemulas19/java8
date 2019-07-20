package com.java8.functional.impl;

public class DivAnonymous {
	
	public static void main(String[] args) {
		InterDiv div1=new InterDiv() {
			
			@Override
			public void division(int a, int b) {
				System.out.println("hi am sheshank akula.."+a%b);
				
			}
		};
		div1.division(30, 100);
	}

}
