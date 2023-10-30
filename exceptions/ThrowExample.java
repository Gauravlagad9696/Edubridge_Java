package com.exceptions;

public class ThrowExample {

	static void Age(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied must be at least 18 years old to watch movie");
		} else {
			System.out.println("Access granted to watch movie");
		}
	}

	public static void main(String[] args) {
		Age(14);

	}

}
