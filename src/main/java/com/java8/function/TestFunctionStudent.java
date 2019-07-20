package com.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionStudent {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "Rakesh", 45));
		list.add(new Student(101, "Rakul", 90));
		list.add(new Student(104, "Samantha", 23));
		list.add(new Student(102, "Vijay", 65));
		list.add(new Student(103, "Kajal", 52));
		list.add(new Student(105, "Pavan kalyan", 34));
		
		Function<Student, String> f = (s)->{
			if(s.getMarks()>60)
				return "A";
			else if(s.getMarks()>50)
				return "B";
			else if(s.getMarks() > 35)
				return "C";
			else
				return "Fail";
		};
		
		for (Student student : list) {
			System.out.println(student + "-" + f.apply(student));
		}
	}
	
	/*public String findGrade(Student s) {
		
		if(s.getMarks()>60)
			return "A";
		else if(s.getMarks()>50)
			return "B";
		else if(s.getMarks() > 35)
			return "C";
		else
			return "Fail";
		
	}*/
}
