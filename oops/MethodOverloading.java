package com.oops;

class Bird{
	public void sound(String s) {
		System.out.println(s);
		
	}
	public void sound(String s,String n) {
		System.out.println("Name: " + n + "\nvoice: " + s);
		
	}
	
}

public class MethodOverloading {
	public static void main(String[] args) {
		Bird crow = new Bird();
		crow.sound("crow");
		crow.sound("crrrr...","crow");
		
		
		
	}

}
