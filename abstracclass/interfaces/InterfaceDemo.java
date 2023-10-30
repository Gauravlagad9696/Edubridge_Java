package com.abstracclass.interfaces;

interface Super3{
	void sleep();
} 

class  Child3 implements Super3{

	@Override
	public void sleep() {
		System.out.println("it's a sleep method");
		
	}
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Super3 s3 = new Child3();
		s3.sleep();
		
	}
	
}
