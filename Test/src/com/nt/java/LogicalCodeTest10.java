package com.nt.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class LogicalCodeTest10 {
    public static void main(String[] args) {
    	
        String s = "I LIKE JAVA";
        
        s=s.replace(" ", "");
        
        Map<Character, Long> result = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(w->w, LinkedHashMap::new, Collectors.counting()));
        
        Entry<Character, Long> finalResult = result.entrySet().stream().filter(entry-> entry.getValue()==1).skip(3).findFirst().get();
    
        System.out.println(finalResult.getKey());
    }
}
