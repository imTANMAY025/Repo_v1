package com.nt.java;

import java.util.List;

public class Test001 {

	
	public static void main(String[] args) {
		
		List<String> rawData = List.of("abpple","guabvabva","bananab","pineappleab");
		
		StringBuilder s2= new StringBuilder();
		  
		  //Integer count = rawData.stream().flatMap(s1->s1.stream()).filter(s-> s.contains("ab")).collect(Collectors.counting());
		 
		  for(String s:rawData) {
			  s2.append(s);
		  }
		  int count = 0;
		  String s3= new String(s2);
		  for(int i=0;i<s2.length();i++) {
			  s3.contains("ab");
			  count++;
		  }
		  
		  System.out.println(count);
	}
}
