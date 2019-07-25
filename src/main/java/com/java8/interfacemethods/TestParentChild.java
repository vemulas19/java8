package com.java8.interfacemethods;

public class TestParentChild {

	public static void main(String[] args) {
		/*Parent p = new Parent();
		p.sum(10, 20);
		Child c = new Child();
		c.sum(10, 20);
		Parent p2 = new Child();
		p2.sum(10, 20);*/
		
		Parent.sum(10, 20);
		Child.sum(10, 20);
		Parent p = new Parent();
		p.sum(10,20);
		Child c = new Child();
		c.sum(10, 20);
		
	}
}
