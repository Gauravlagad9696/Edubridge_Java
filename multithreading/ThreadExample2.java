package com.multithreading;

class Thread1 implements Runnable {
	public void run() {
		try {
		System.out.println("starting thread...");
	
		}catch(Exception e) {
			
		}
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {

		int a = 48;
		for (int i=0; i<5; i++) {
			Thread obj = new Thread(new Thread1());
			obj.start();
		}
		
	}
}
