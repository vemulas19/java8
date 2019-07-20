package com.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionAddMarks {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "Rakesh", 45));
		list.add(new Student(101, "Rakul", 90));
		list.add(new Student(104, "Samantha", 23));
		list.add(new Student(102, "Vijay", 65));
		list.add(new Student(103, "Kajal", 52));
		list.add(new Student(105, "Pavan kalyan", 34));
		
		System.out.println(list);
		Function<Student, Student> f = std->{
			std.setMarks(std.getMarks()+5);
			return std;
		};
		for (Student student : list) {
			System.out.println(f.apply(student));
		}
	}
}
