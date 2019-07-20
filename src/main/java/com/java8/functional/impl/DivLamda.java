package com.java8.functional.impl;

public class DivLamda {
	
	public static void main(String[] args) {
		InterDiv div=(a,b)->System.out.println("this is lamda expression.."+ a%b);
		
		div.division(20, 40);
	}

}
