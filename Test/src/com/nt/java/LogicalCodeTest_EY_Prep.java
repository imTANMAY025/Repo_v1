package com.nt.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LogicalCodeTest_EY_Prep {


	public static void main(String... args) {
   // TODO document why this method is empty
		
		List<Integer> numbers = Arrays.asList(10, 45, 23, 67, 89, 12, 4, 99, 32, 7,45,7,7);
		List<Double> decimalNumbers = Arrays.asList(10.5, 3.2, 7.7, 1.1, 15.6, 4.4);
		List<String> fruits = Arrays.asList("apple", "banana", "cherry");
		int arr[]= {1, 2, 3, 2, 4, 1, 5, 2, 3, 1};
		Integer arrObj[]= {1, 2, 3, 2, 4};
		String nameOne="Tanmoy";
		String nameTwo="yomnaT";
		Integer[] arr1 = {5, 1, 9, 3,2};
        Integer[] arr2 = {8, 2, 7, 4, 5};
        int n= 539;
        String sentence = "I am here";
		
//		//1. ODD-EVEN
//		Map<Boolean,List<Integer>> result= numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
//		System.out.println(result.get(true));
//		System.out.println(result.get(false));
		
//		//2. Remove dublicates in a array
//		Integer[] resultArray= Arrays.stream(arr).boxed().collect(Collectors.toSet()).toArray(new Integer[0]);
//		System.out.println(resultArray);
		
//		//3. Find the frequency of each character in a string using Java 8 streams
//		Map<Character,Long> freqMap= nameOne.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		freqMap.forEach((k,v)-> System.out.println(k+"->"+v));
		
//		//4. Find the frequency of each element in an array or a list
//		Map<Integer,Long> FreqMap2= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		FreqMap2.forEach((K,V)-> System.out.println(K+"->"+V));
		
//		//5. Sort a given list of decimals in reverse order
//		System.out.println(decimalNumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
//		//6. Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
//		System.out.println(fruits.stream().collect(Collectors.joining(",","[","]")));
		
//		//7. Find the maximum and minimum of a list of integers
//		Optional<Integer> max= numbers.stream().reduce(Integer::max);
//		System.out.println(max.get());
//		Optional<Integer> min= numbers.stream().reduce(Integer::min);
//		System.out.println(min.get());
		
//		//8. Merge two unsorted arrays into a single sorted array without duplicates
//		 Integer[] mergedArray = Stream.concat(Stream.of(arr1), Stream.of(arr2)).sorted().distinct().toArray(Integer[]::new);
//		for(int i:mergedArray)System.out.print(i+" ");
        
//        //9. Get the three maximum and three minimum numbers from a given list of integers
//        List<Integer> top3 = numbers.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
//        top3.forEach(System.out::println);
//        List<Integer> bottom3 = numbers.stream().distinct().sorted().limit(3).collect(Collectors.toList());
//        bottom3.forEach(System.out::println);
        
        //11. Check if two strings are anagrams or not using Java 8 streams
        String nameOneSorted = Stream.of(nameOne.toLowerCase().split("")).sorted().collect(Collectors.joining());
        String nameTwoSorted = Stream.of(nameTwo.toLowerCase().split("")).sorted().collect(Collectors.joining());
        System.out.println(nameOneSorted.equals(nameTwoSorted));
        
//        //12. Find the sum of all digits of a number in Java 8
//        System.out.println(String.valueOf(n).chars().map(c-> c - '0').sum());
        
//        //13. Find the second largest number in an integer array
//        int num= Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(num);
        
//        //14. Sort a list of strings according to the increasing order of their length
//        List<String> result = fruits.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
//        
//        result.forEach(System.out::println);
        
//          //15. Find the common elements between two arrays
//        		Set<Integer> result=  Stream.concat(Stream.of(arr1), Stream.of(arr2)).collect(Collectors.toSet());
//        		for(int i:result)System.out.println(i);
        
//          //16. Reverse each word of a string using Java 8 streams
//        		System.out.println(Stream.of(sentence.split(" ")).map(w-> new StringBuffer(w).reverse()).collect(Collectors.joining(" ")));
        
//        	//17. Find the sum of the first 10 natural numbers
//                  int sum= IntStream.rangeClosed(1, 10).sum();
                  
//              //18. Reverse an integer array
//        arrObj = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Collections.reverse(Arrays.asList(arrObj));
//        for(int i: arrObj)System.out.print(i+" ");
        
//        //19. Print the first 10 even numbers
//        IntStream.iterate(2, n1 -> n1 + 2).limit(10).forEach(System.out::println);
        
//        //20 Find the most repeated element in an array
//          Map<List<Integer>, Long> res= Stream.of(numbers).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        			
//          System.out.println(res.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
        
//        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
//        .limit(10)
//        .map(f -> f[0])   // take first number of each pair
//        .forEach(n1 -> System.out.print(n1 + " "));
        
//        // Find the first repeated character in a string (SWISS -> S) using stream api
//        String s="WSWISWWS";
//        Map<Character, Long> resultMap= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
//         Character s1= resultMap.entrySet().stream().filter(entry-> entry.getValue()>1).map(Map.Entry::getKey).findFirst().get();
//        System.out.println(s1);
        
        
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
