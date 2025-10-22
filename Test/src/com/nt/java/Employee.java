package com.nt.java;

public class Employee {

	private String name;
	private String age;
	private String dept;
	private String salary;
	private String cno;
	
	
	
	public Employee(String name, String age, String dept, String salary, String cno) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
		this.cno = cno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + ", salary=" + salary + ", cno=" + cno
				+ "]";
	}
	
	
}
