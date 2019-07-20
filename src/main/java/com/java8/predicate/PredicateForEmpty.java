package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateForEmpty {

	public static void main(String[] args) {
		String name = "Virat";
		String city = "";
		String password = null;
		
		/*PredicateForEmpty p = new PredicateForEmpty();
		System.out.println(p.isNullOrEmpty(name));
		System.out.println(p.isNullOrEmpty(city));
		System.out.println(p.isNullOrEmpty(password));
		System.out.println(p.isNullOrEmpty("Dhoni"));*/
		
		Predicate<String> p = text->text==null||text.isEmpty();
		
		System.out.println(p.test(name));
		System.out.println(p.test(city));
		System.out.println(p.test(password));
		System.out.println(p.test("Dhoni"));
		
		
		
		
		
		
	}
	
	/*public boolean isNullOrEmpty(String text) {
		return text==null || text.isEmpty();
	}*/
}
