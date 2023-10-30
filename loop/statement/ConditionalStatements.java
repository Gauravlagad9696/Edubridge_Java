package com.loop.statement;
import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		// if-else;
		int a = 10;
		if (a < 10) {

			System.out.println(a);

		}

		else {

			System.out.println("The value of a is not less than 10");
		}

		// nested if-else
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		if (b <= 5) {
			if (b / 2 == 0) {
				System.out.println(b + " is a Even number");
			} else {
				System.out.println(b + " is a odd number");
			}
		} else {
			System.out.println("The number is not less then equal to 5");
		}

	}
}
