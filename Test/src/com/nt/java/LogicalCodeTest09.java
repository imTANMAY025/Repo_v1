package com.nt.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LogicalCodeTest09 {
    public static void main(String[] args) {
    	
        String s = "job1:success,job2:failed,job3:success,job4:success,job5:failed";
        
//        String[] values = s.split(",");
//        
//        Map<String, String> result = new HashMap();
//        for(String temp:values) {
//        	
//        	String arr[]=temp.split(":");
//        	
//        	result.put(arr[0], arr[1]);
//        	
//        }
//        
//        result.forEach((K,V)->System.out.println(K+"->"+V));
        
        Map<String, String> result = Arrays.stream(s.split(",")).map(val->val.split(":")).collect(Collectors.toMap(arr->arr[0],arr-> arr[1]));
        result.forEach((K,V)->System.out.println(K+"->"+V));
        
    }
}
