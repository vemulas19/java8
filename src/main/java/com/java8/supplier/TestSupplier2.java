package com.java8.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.java8.function.Student;

public class TestSupplier2 {

	public static void main(String[] args) {
		Supplier<List<Student>> supStd = () -> {
			List<Student> list = new ArrayList<>();
			list.add(new Student(100, "Rakesh", 45));
			list.add(new Student(101, "Rakul", 90));
			list.add(new Student(104, "Samantha", 23));
			list.add(new Student(102, "Vijay", 65));
			list.add(new Student(103, "Kajal", 52));
			list.add(new Student(105, "Pavan kalyan", 34));
			return list;
		};

		Function<Student, Student> f = std -> {
			std.setMarks(std.getMarks() + 5);
			return std;
		};
		
		Consumer<Student> cons = std->{
			System.out.println("Updated to database : " + std.getMarks());
		};
		
		List<Student> list = supStd.get();
		for (Student student : list) {
			f.apply(student);
			cons.accept(student);
		}
	}
}
