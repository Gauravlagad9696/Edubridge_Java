package com.oops;

abstract class Birds{
	abstract void sound();
	abstract void color();

}

class Crow extends Birds{
	
	public void sound() {
		
		System.out.println("The sound is:cowwww cowww ..");
	}
public void color() {
		
		System.out.println("The color is :Black");
	}
}


public class AbstractClassDemo {
	public static void main(String[] args) {
		
		Crow c = new Crow();
		c.sound();
		c.color();
	}

}
