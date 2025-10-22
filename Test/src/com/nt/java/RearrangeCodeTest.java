package com.nt.java;
import java.util.ArrayList;
import java.util.List; 

public class RearrangeCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int[] arr = {10, -20, 30, -40, 50,60,80};
		//int[] arr = {10};
		int[] arr = {10,20,56};
		int i=0,j=0;
		List<Integer> positiveSet= new ArrayList<>();
		List<Integer> negativeSet= new ArrayList<>();
	    List<Integer> result= new ArrayList<>();
	        for(int a:arr){
	            if(a>=0)
	                positiveSet.add(a);
	                else
	                negativeSet.add(a);
	        }
	       
	       while(negativeSet.size()>i && positiveSet.size()>j) {
	    	   result.add(negativeSet.get(i++));
	    	   result.add(positiveSet.get(j++));
	       }
	       
	       
	       while(i<negativeSet.size()) {
	    	   result.add(negativeSet.get(i++));
	       }
	       while(j<positiveSet.size()) {
	    	   result.add(positiveSet.get(j++));
	       }
	       System.out.println(result);
	}

}
