package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

import com.java8.function.Student;

public class TestForEach2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "Rakesh", 89));
		list.add(new Student(101, "Rakul", 90));
		list.add(new Student(104, "Samantha", 23));
		list.add(new Student(102, "Vijay", 65));
		list.add(new Student(103, "Kajal", 52));
		list.add(new Student(105, "Pavan kalyan", 34));
		
//		list.stream().forEach(std->System.out.println(std.getName()));
//		list.stream().forEach(System.out::println);
		list.stream().forEach(TestForEach2::printName);
	}
	
	public static void printName(Student std) {
		System.out.println(std.getName());
	}
}
