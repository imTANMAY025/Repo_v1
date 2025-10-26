package com.nt.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Ravi Kumar", 30, "IT", 75000.0, "9876543210"));
        employees.add(new Employee("Anita Sharma", 28, "HR", 65000.0, "8765432109"));
        employees.add(new Employee("Vikram Singh", 35, "Finance", 82000.0, "7654321098"));
        employees.add(new Employee("Sneha Verma", 26, "Marketing", 58000.0, "6543210987"));
        employees.add(new Employee("Arjun Das", 32, "IT", 77000.0, "9123456780"));

        
        //System.out.println(employees);
        
//        List<String> resultEmp= employees.stream().map(Employee::getDept).distinct().collect(Collectors.toList());
//        System.out.println(resultEmp);
        
//        Map<String, Long> countDept= employees.stream().collect(Collectors.groupingBy(Employee:: getDept,Collectors.counting()));
//        System.out.println(countDept);
        
//        Map<String, Long> countDept= employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary);
//        System.out.println(countDept);
        
        employees.stream().filter(e->e.getAge()>30).map(Employee::getCno)
        		.forEach(System.out::println);
        
	}

}
