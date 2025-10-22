
//Partition list into even/odd using Collectors.partitioningBy()
package com.nt.java;
import java.util.*;

public class Test11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45, 23, 89, 99, 67, 99, 10);

        // Remove duplicates, sort in descending order, skip the first (largest), then pick the second
        Integer secondLargest = numbers.stream()
            .distinct()
            .sorted((a,b)->b-a)
            .skip(1)
            .findFirst()
            .orElseThrow(() -> new NoSuchElementException("No second largest element"));

        System.out.println("Second largest number is: " + secondLargest);
    }
}
