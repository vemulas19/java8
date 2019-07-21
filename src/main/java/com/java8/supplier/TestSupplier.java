package com.java8.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.java8.function.Student;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<String> sup = ()->"Helo World";
		
		Supplier<List<Student>> supStd = ()->{
			List<Student> list = new ArrayList<>();
			list.add(new Student(100, "Rakesh", 45));
			list.add(new Student(101, "Rakul", 90));
			list.add(new Student(104, "Samantha", 23));
			list.add(new Student(102, "Vijay", 65));
			list.add(new Student(103, "Kajal", 52));
			list.add(new Student(105, "Pavan kalyan", 34));
			return list;
		};

		Consumer<Student> cons = (std)->{
			System.out.println("Student name : " + std.getName());
			System.out.println("Student Marks : " + std.getMarks());
			System.out.println("Student Id : " + std.getStdId());
		};
		
		Predicate<Student> p = std->std.getMarks()>60;
		
		Function<Student, Student> f = std->{
			if(std.getMarks() < 90)
				std.setMarks(std.getMarks()+10);
			return std;
		};
		
		for (Student student : supStd.get()) {
			f.apply(student);
			if(p.test(student)) {
				cons.accept(student);
				System.out.println("--------------------");
			}
		}
		System.out.println(sup.get());
	}
}
