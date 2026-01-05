package com.practisebasics.advancedjavaconcepts;

public class Employee {
	private int emp_id;
	private String name;
	private double salary;
	public Employee(int emp_id, String name, double salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int emp_id() {
		return emp_id;
	}
	public String name() {
		return name;
		
	}
	public double salary() {
		return salary;
	}

}
