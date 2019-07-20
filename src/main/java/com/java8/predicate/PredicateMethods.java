package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateMethods {

	public static void main(String[] args) {
		int[] values = {20, 93, 15, 5, 77, 64, 22, 30, 50, 97};
		
		Predicate<Integer> p1 = i->i%2==0;
		
		Predicate<Integer> p2 = i->i>50;
		
		/*for (int i : values) {
			if(p1.or(p2).test(i))
				System.out.println(i);			
		}*/
		
		/*for (int i : values) {
			if(p1.and(p2).test(i))
				System.out.println(i);	
		}*/
		
		for (int i : values) {
			if(p1.negate().test(i)) {
				System.out.println(i);
			}
		}
	}
}
