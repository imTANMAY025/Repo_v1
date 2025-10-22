package com.nt.java;

import java.util.HashMap;
import java.util.Map;

public class LogicalCodeTest07 {

//	public void display(Employee e) {
//
//		System.out.println("Employee::" + e);
//	}
//
//	public void display(String s) {
//		System.out.println("String::" + s);
//	}
//
//	public static void main(String... args) {
//
//		LogicalCodeTest07 test = new LogicalCodeTest07();
//
//		test.display(null);
//
//	}
	
	public void display(Object o) {

		System.out.println("Object::" + o);
	}

	public void display(String s) {
		System.out.println("String::" + s);
	}

	public static void main(String... args) {

		LogicalCodeTest07 test = new LogicalCodeTest07();

		test.display(null);

	}
}
