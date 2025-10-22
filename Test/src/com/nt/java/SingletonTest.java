package com.nt.java;

class Test{
	 static Test t=null;
	 
	public static Test getTest() {
		System.out.println("getTest() method");
		if(t==null) {
			t=new Test();
		}
		else {
			System.out.println("else block");
		}
		return t;
	}
}
public class SingletonTest {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println("main() method...");
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
	}
}
