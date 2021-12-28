package org.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.employee.Employee;
import org.sort.Sortbydpt;
import org.sort.Sortbysalary;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		List<Employee> HR = new ArrayList<>();
		List<Employee> IT = new ArrayList<>();

		System.out.println("List of Employees(Unsorted)\n");

		employees.add(new Employee("Vaibhav", "Shende", "IT", 90000));
		employees.add(new Employee("John", "Smith", "HR", 30000));
		employees.add(new Employee("Jane", "Doe", "HR", 70000));
		employees.add(new Employee("Johnny", "Doe", "IT", 50000));
		employees.add(new Employee("kate", "Smith", "IT", 30000));
		employees.add(new Employee("Riny", "Smith", "HR", 20000));
		employees.add(new Employee("Deek", "Doe", "HR", 70000));
		employees.add(new Employee("Karl", "Smith", "IT", 80000));
		employees.add(new Employee("Jasson", "Doe", "IT", 70000));
		employees.forEach((s) -> System.out.println(s));

		System.out.println("_____________________________________________________________________________________");
		// Sum of the salary of all the employees in department HR
		System.out.println("list of Employees in HR department\n");
		 employees.stream()
        .filter(e -> e.getDepartment().equalsIgnoreCase("HR"))
        .map(Employee::toString)
        .forEach(System.out::println);
		
		Integer sumId = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR")).collect(Collectors.summingInt(x -> x.getSalary()));
		HR.forEach((s) -> System.out.println(s));
		System.out.println("\nSum of the salaries of all the employees in HR department : " + sumId);
		System.out.println("_____________________________________________________________________________________");

		// Sorted list of employees in department IT based on their salary
		System.out.println("Sorting list base on IT department\n");
	    
	
		employees.stream()
        .filter(e -> e.getDepartment().equalsIgnoreCase("IT")).sorted(Comparator.comparingInt(Employee::getSalary))
        .map(Employee::toString)
        .forEach(System.out::println);
		System.out.println("_____________________________________________________________________________________");

	}
}