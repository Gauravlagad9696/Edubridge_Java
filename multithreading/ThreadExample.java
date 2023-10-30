package com.multithreading;

public class ThreadExample extends Thread {
	
	public void run() {
		
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		ThreadExample tx = new ThreadExample();
		tx.start();
		int a=tx.activeCount();
		System.out.println(a);
	}

}
