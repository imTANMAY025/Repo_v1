
//Count word frequency in a given string

package com.nt.java;

import java.util.ArrayList;
import java.util.List;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line="I am a software Engineer";
		
		String[] words=line.split(" ");
		List<String> wordsList= new ArrayList<>();
		for(String s:words) {
			wordsList.add(s);
			
		}
		System.out.println(wordsList.size());	
	}

}
