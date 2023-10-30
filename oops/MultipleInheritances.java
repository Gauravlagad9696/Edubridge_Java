package com.oops;
interface SmartPhone3{
	void batteryCapacity();
	
}
interface Mobile{
	void open();
	void close();
}

class OppoA51 implements Mobile,SmartPhone3{

	@Override
	public void batteryCapacity() {
		System.out.println("The battery capicity is 5100 mAh");
		
	}

	@Override
	public void open() {
		System.out.println("opening ...");
	}

	@Override
	public void close() {
		System.out.println("The phone is closing...");
	}
	
}

public class MultipleInheritances {
	public static void main(String[] args) {
		OppoA51 ph = new OppoA51();
		ph.open();
		ph.batteryCapacity();
		ph.close();
		
	}
	

}
