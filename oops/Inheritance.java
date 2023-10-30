package com.oops;

class Person{
	void sleep() {
		System.out.println("sleep");
	}
}

class Child extends Person{
void play() {
	System.out.println("playing");
}
	
}

public class Inheritance {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.play();
		c1.sleep();
		
	}

}
