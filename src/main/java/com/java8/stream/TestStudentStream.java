package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.function.Student;

public class TestStudentStream {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "Rakesh", 45));
		list.add(new Student(104, "Samantha", 23));
		list.add(new Student(101, "Rakul", 90));
		list.add(new Student(102, "Vijay", 65));
		list.add(new Student(103, "RKajal", 52));
		list.add(new Student(105, "Pavan kalyan", 34));
		
		
		long count = list.stream().filter(std->std.getName().charAt(std.getName().length()-1) == 'l').count();
		System.out.println(count);
		/*List<Student> toppersList = new ArrayList<>();
		
		for (Student student : list) {
			if(student.getMarks() > 60) {
				toppersList.add(student);
			}
		}*/	
		
		List<Student> toppersList = list.stream().filter(std->std.getMarks()>60).collect(Collectors.toList());
		
		List<Student> evenNameList = list.stream().filter(std->std.getName().length()%2==0).collect(Collectors.toList());
		
		System.out.println(toppersList);
		System.out.println(evenNameList);
	}
}
