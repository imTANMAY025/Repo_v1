package com.nt.java;

import java.util.Arrays;

public class LogicalCodeTest11 {
    public static void main(String[] args) {
    	
        int arr[]= {3, 2, 1,5,6};
        
//        If array has numbers from 1 to n → use arr.length + 1.
//
//        If array has numbers from 0 to n → use arr.length.
        
        int n=arr.length+1;
        
        int sum = n*(n+1)/2;
        
        int sum2=Arrays.stream(arr).sum();
        
        
        System.out.println(sum-sum2);
        
    }
}
