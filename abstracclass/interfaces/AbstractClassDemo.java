package com.abstracclass.interfaces;

public abstract class AbstractClassDemo {

	abstract void run();
	
	public static void main(String[] args) {
		AbstractDemo ad = new AbstractDemo();
		ad.run();
	}

}

class AbstractDemo extends AbstractClassDemo {

	@Override
	void run() {
		System.out.println("running...");

	}
	

}
