package org.sort;

import java.util.Comparator;

import org.employee.Employee;

public class Sortbysalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSalary() - o2.getSalary();
		//return o1.getDepartment().compareTo(o2.getDepartment());
	}
	
}
