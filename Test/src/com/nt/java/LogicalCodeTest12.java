package com.nt.java;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class LogicalCodeTest12 {
    public static void main(String[] args) {
    	
       String s="aaaabbcddd"; 
       
       //a4b2c1d3
       
       Map<Character, Long> res = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        
    }
}
