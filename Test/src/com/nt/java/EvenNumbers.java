
//1.Filter even numbers from a list using streams

package com.nt.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50,55,23,41,78,12,23,21,9,1,4,6,7);

		List<Integer> evenList = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		evenList.forEach(System.out::println);
	}

}
