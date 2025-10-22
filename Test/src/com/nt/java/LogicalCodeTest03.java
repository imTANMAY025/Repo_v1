package com.nt.java;

public class LogicalCodeTest03 {

    // Accepts any number of int arguments
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    //public static void main(String[] args) {
    public static void main(String... args) {
        System.out.println(sum());                 // Output: 0
        System.out.println(sum(10));              // Output: 10
        System.out.println(sum(10, 20, 30,40,50));      // Output: 60
    }
}
