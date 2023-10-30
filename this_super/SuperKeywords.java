package com.this_super;

class Phone {
	public void closePhone() {
		System.out.println("closing the phone");
	}

}

class SmartPhone extends Phone {

	void ring() {

		System.out.println("The phone is ringing...");

		super.closePhone();
	}
}

public class SuperKeywords {
	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		sp.ring();
	}
}
