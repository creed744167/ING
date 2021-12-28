package org.employee;

public class Employee {
	private String firstname;
	private String lastname;
	private String department;
	private int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstname, String lastname, String department, int salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.salary = salary;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	

}