package com.nt.java;

public class LogicalCodeTest01 {

	public static void main(String[] args) {


		
	}
	
	public static boolean isPrime(int n) {
	    if (n <= 1) return false;
	    if (n == 2) return true; // 2 is the only even prime number
	    if (n % 2 == 0) return false; // eliminate even numbers

	    for (int i = 3; i <= Math.sqrt(n); i += 2) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}


}
