
//List to Map using string length

package com.nt.java;
import java.util.*;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "Go","Java","So","Lava");

//        Map<Integer, String> map = words.stream()
//                .collect(Collectors.toMap(
//                        String::length,
//                        word -> word
//                ));
        
        Map<Integer, String> map = words.stream()
                .collect(Collectors.toMap(
                        String::length,
                        word -> word,
                        (existing, replacement) -> existing + ", " + replacement // merge same-length words
                ));


        System.out.println(map);
    }
}

