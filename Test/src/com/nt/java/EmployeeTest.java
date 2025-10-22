package com.nt.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Employee> empList = Arrays.asList(
	            new Employee("Alice", "30", "IT", "70000", "9876543210"),
	            new Employee("Bob", "40", "HR", "50000", "9876543211"),
	            new Employee("Charlie", "35", "IT", "80000", "9876543212"),
	            new Employee("David", "45", "Finance", "90000", "9876543213"),
	            new Employee("Eve", "28", "HR", "60000", "9876543214"),
	            new Employee("Frank", "50", "Finance", "75000", "9876543215"),
	            new Employee("Grace", "32", "IT", "85000", "9876543216")
	        );
		
		
//		//Find the Employee with the Highest Salary
//		Employee e= empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
//		System.out.println(e.getName());
//		
//		
//		//Group the employees by dept
//		Map<String, List<Employee>> resultEmpList = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
//		
//		resultEmpList.forEach( (dept,empList1)->{
//			System.out.println("\nDepartment:"+dept);
//			empList1.forEach(emp->System.out.println("Name::"+emp.getName()+" Contact::"+emp.getCno()));
//			
//		});
//		
		
		//average salary of the employee
		
		
		
		
	}
	
	

}
