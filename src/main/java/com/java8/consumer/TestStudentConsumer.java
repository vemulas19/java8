package com.java8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.java8.function.Student;

public class TestStudentConsumer {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "Rakesh", 45));
		list.add(new Student(101, "Rakul", 90));
		list.add(new Student(104, "Samantha", 23));
		list.add(new Student(102, "Vijay", 65));
		list.add(new Student(103, "Kajal", 52));
		list.add(new Student(105, "Pavan kalyan", 34));
		
		Consumer<Student> cons = std->{
			System.out.println("Name is : " + std.getName());
			System.out.println("Student id is : " + std.getStdId());
			System.out.println("Student Marks : " + std.getMarks());
		};
		
		for (Student student : list) {
			cons.accept(student);
			System.out.println("--------------------------");
		}
	}
}
