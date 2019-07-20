package com.java8.functional.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparatorEmployeeLambda {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(103, "kajal", 40000));
		empList.add(new Employee(100, "rakul", 95000));
		empList.add(new Employee(102, "pawan kalyan", 80000));
		empList.add(new Employee(105, "mahesh Babu", 70000));
		empList.add(new Employee(104, "vijay Devarakonda", 30000));
		empList.add(new Employee(101, "anushka", 60000));
		
		System.out.println(empList);
		Collections.sort(empList, (e1,e2)->e2.getName().compareTo(e1.getName()));
		System.out.println(empList);
	}
}
