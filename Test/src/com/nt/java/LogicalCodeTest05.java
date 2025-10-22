package com.nt.java;

import java.util.HashMap;
import java.util.Map;

public class LogicalCodeTest05 {

   
    public static void main(String... args) {
    	

    	StringBuilder sb= new StringBuilder("Tanmoy");
    	System.out.println(sb);
    	Map<StringBuilder,Long> map = new HashMap<>();
    	map.put(sb, (long) 1);
    	
    	sb.append("Pradhan");
    	
    	System.out.println(map.get(sb));
    	
    	
    	
    	
    	
    }
}
