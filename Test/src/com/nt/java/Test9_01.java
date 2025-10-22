
//List to Map using string length

package com.nt.java;
import java.util.*;
import java.util.stream.Collectors;

public class Test9_01 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "Go","Java","Go","Kava");

        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String s:words) {
        	
        	if(!map.containsKey(s))
        		map.put(s, s.length());
        }

        System.out.println(map);
    }
}

