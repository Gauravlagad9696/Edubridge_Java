package com.oops;

class Person1{
	void sleep() {
		System.out.println("sleep ...");
	}
}

class Vishal extends Person1{
void play() {
	System.out.println("playing ...");
}
	
}
class Ram extends Vishal{
	void eat() {
		System.out.println("eating ...");
	}
}



public class MultilevelInheritance {
	public static void main(String[] args) {
		
		Ram r = new Ram();
		r.eat();
		r.play();
		r.sleep();
		
	}

}
