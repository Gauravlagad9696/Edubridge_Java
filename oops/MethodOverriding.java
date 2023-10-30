package com.oops;

class SmartPhone {

	public void open() {
		System.out.println("phone is starting..");
	}
}

class Oppo extends SmartPhone{
	@Override 
	public void open() {
		System.out.println(" oppo phone is starting..");
	}
	
}

public class MethodOverriding {
	public static void main(String[] args) {
		Oppo oppo51 = new Oppo();
		oppo51.open();
		

	}

}
