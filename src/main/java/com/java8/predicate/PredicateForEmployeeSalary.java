package com.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java8.functional.comparator.Employee;

public class PredicateForEmployeeSalary {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(103, "kajal", 40000));
		empList.add(new Employee(100, "rakul", 95000));
		empList.add(new Employee(102, "pawan kalyan", 80000));
		empList.add(new Employee(105, "mahesh Babu", 70000));
		empList.add(new Employee(104, "vijay Devarakonda", 30000));
		empList.add(new Employee(101, "anushka", 60000));
		
		Predicate<Employee> p = emp->emp.getSalary()>60000;
		
		for (Employee employee : empList) {
			if(p.test(employee)){
				System.out.println(employee);
			}
		}
		System.out.println("-------------------------------------------");
		Predicate<Employee> p2 = e1->e1.getEmpId()%2==0;
		for (Employee employee : empList) {
			if(p2.test(employee)){
				System.out.println(employee);
			}
		}
		
	}
	
	/*public static boolean isValidEmployee(Employee employee) {
		return employee.getSalary() > 60000;
	}*/
}
