package com.loop.statement;

public class NestedLoop {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("The value of i is " + i);
			for(int j=1; j<=i; j++) {
			System.out.println("The value of j is " +j);
			}
			}
	}
}
