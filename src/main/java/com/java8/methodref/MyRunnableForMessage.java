package com.java8.methodref;

public class MyRunnableForMessage implements Runnable {

	static int a = 10;

	@Override
	public void run() {
		System.out.println(a);
		for (int i = 0; i < 10; i++) {
			System.out.println("Send message to mobile!!");
		}
	}

}
