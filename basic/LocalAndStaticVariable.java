package com.basic;


class age {

	void age() {
		int age = 22; // local Variable
	}

	public static int km = 100; // static variable

}

public class LocalAndStaticVariable {
	public static void main(String[] args) {

		System.out.println(age.km);
	}

}