
//Partition list into even/odd using Collectors.partitioningBy()
package com.nt.java;
import java.util.*;
import java.util.stream.Collectors;

public class Test10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 33, 40, 41);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // true = even, false = odd

        System.out.println("Even Numbers: " + partitioned.get(true));
        System.out.println("Odd Numbers: " + partitioned.get(false));
    }
}
