package com.constructor;

public class ConstructorsExample {
	
	public ConstructorsExample() {
		System.out.println("This is a default constructor !");
	}
	
	public ConstructorsExample( int a ,int b) {
		
		System.out.println("This is a Parameterized constructor !");
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorsExample defaultcon = new ConstructorsExample();
		ConstructorsExample p = new ConstructorsExample(48,68);

		
	}

}
