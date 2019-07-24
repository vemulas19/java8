package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.function.Student;

public class TestStreamMapStudent {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "Rakesh", 89));
		list.add(new Student(101, "Rakul", 90));
		list.add(new Student(104, "Samantha", 23));
		list.add(new Student(102, "Vijay", 65));
		list.add(new Student(103, "Kajal", 52));
		list.add(new Student(105, "Pavan kalyan", 34));

		Predicate<Student> p = std -> std.getMarks() < 60;

		Function<Student, Student> f = std -> {
			std.setMarks(std.getMarks() + 10);
			return std;
		};

		// list = list.stream().map(f).collect(Collectors.toList());
		System.out.println(list);
		/*list = list.stream().filter(std -> std.getMarks() < 60).collect(Collectors.toList()).stream().map(f)
				.collect(Collectors.toList());
		System.out.println(list);*/

		list = list.stream().map(f).collect(Collectors.toList()).stream().filter(std->std.getMarks()>60).collect(Collectors.toList());
		System.out.println(list);
	}
}
