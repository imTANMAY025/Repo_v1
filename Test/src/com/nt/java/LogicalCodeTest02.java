package com.nt.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LogicalCodeTest02 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList(
	            "apple", "banana", "apple", "orange", "banana",
	            "apple", "mango", "banana", "mango", "kiwi"
	        );
		
		Map<String,Long> resultantMap= words.stream().collect(Collectors.groupingBy(word->word, Collectors.counting()));
		
		System.out.println(resultantMap);
		
		
		//Entry<String, Long> finalMap = resultantMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).skip(1).findFirst().orElseThrow(null);
		Map.Entry<String, Long> finalMap = resultantMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).findFirst().orElse(null);

		System.out.println(finalMap);
	}



}
