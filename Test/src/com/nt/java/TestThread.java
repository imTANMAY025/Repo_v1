package com.nt.java;

public class TestThread extends Thread {
	public void run() {
		for(int i=0;i<5;++i) {
		System.out.println("Thread executing");
	    	
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestThread t=new TestThread();
  t.start();
	}

}
