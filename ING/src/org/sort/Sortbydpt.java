package org.sort;

import java.util.Comparator;

import org.employee.Employee;

public class Sortbydpt implements Comparator<Employee> {

	@Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }

}
