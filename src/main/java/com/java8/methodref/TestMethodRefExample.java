package com.java8.methodref;

public class TestMethodRefExample {

	static int a = 10;
	public static void main(String[] args) {
		Runnable r = TestMethodRefExample::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Cash Withdraw!!");
		}
	}
	
	public static void m1() {
	    System.out.println(a);
		for (int i = 0; i < 10; i++) {
			System.out.println("Send message to mobile!!");
		}
	}
}
