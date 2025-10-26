package com.nt.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Employee> empList = Arrays.asList(
	            new Employee("Alice", 30, "IT", 70000.0, "9876543210"),
	            new Employee("Bob", 40, "HR", 50000.0, "9876543211"),
	            new Employee("Charlie", 35, "IT", 80000.0, "9876543212"),
	            new Employee("David", 45, "Finance", 90000.0, "9876543213"),
	            new Employee("Eve", 28, "HR", 60000.0, "9876543214"),
	            new Employee("Frank", 50, "Finance", 75000.0, "9876543215"),
	            new Employee("Grace", 32, "IT", 85000.0, "9876543216")
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
		
//		//average salary of the employee in each dept
//		Map<String, Double> result = empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));		
//		result.forEach((K,V)-> System.out.println(K+"::"+V));
		
//		//Dept with max employee
//		Optional<String> dept = empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
//		.entrySet().stream().max(Entry.comparingByValue()).map(Entry->Entry.getKey());
//		System.out.println(dept.get());
		
//		//Find list of employees names whose name starts with alphabet A
//		Optional<List<String>> result = Optional.ofNullable(empList.stream().filter(emp-> emp.getName()
//				.startsWith("A")).map(Employee::getName).collect(Collectors.toList()));
//		
//		result.ifPresentOrElse(
//				list-> System.out.println(result.get()),
//				()-> System.out.println("No records Found")
//				);
		
//		//Find the count of employee in each department
//		Optional<Map<String, Long>> result = Optional.ofNullable(empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting())));
//		
//		result.ifPresentOrElse(
//				map -> System.out.println("Employee count by department: " + map)
//		, ()-> System.out.println("No Data") );
		
//		//Find the highest salary in each department
//		Optional<Map<String, Optional<Employee>>> result = Optional.ofNullable( 
//				empList.stream()
//				.collect(Collectors.groupingBy(Employee::getDept,
//						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary).reversed() )))
//				);
//		result.ifPresentOrElse(
//				map-> System.out.println(map), 		
//				()-> System.out.println("No result"));
		
//		//Find the list of employee and sort them by their salary
//		Optional<List<Employee>> result =  Optional.ofNullable(empList.stream()
//				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList()));
//		
//		result.ifPresentOrElse(list-> System.out.println(result.get()), ()-> System.out.println("No records Found"));
		
		
//		//Avg age in each department
//		Optional<Map<String,Double>> result =  Optional.ofNullable(empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getAge))));
//	
//		result.ifPresentOrElse(
//				map-> System.out.println(map), 
//				()->System.out.println("No records."));
	
	
		
	
	}
	
	

}
