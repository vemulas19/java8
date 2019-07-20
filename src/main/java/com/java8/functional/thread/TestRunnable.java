package com.java8.functional.thread;

public class TestRunnable {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Parent Thread!!");
		}
	}
}
