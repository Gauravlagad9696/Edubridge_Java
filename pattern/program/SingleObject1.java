package com.pattern.program;

public class SingleObject1 {
	private static SingleObject1 instance = new SingleObject1();

	private SingleObject1() {
	}

	public static SingleObject1 getInstance() {
		return instance;
	}

	public void showMsg() {
		System.out.println("hello");
	}
}
