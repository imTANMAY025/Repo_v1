package com.nt.java;

public class LogicalCodeTest08_01 {
    public static void main(String[] args) {
    	
        String s = "TA%^N$MO@Y";
        char[] arr = s.toCharArray();

        
        for(int i=0,j=s.length()-1;i<j;) {
        	
        	if(!Character.isLetter(arr[i])) {
        		i++;
        	}
        	if(!Character.isLetter(arr[j])) {
        		j--;
        	}else {
        		char temp= arr[i];
        		arr[i]= arr[j];
        		arr[j]=temp;
        		i++;
        		j--;
        	}
        }
        
        System.out.println(String.valueOf(arr));
    }
}
