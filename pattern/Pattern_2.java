package com.pattern;

public class Pattern_2 {
	public static void main(String[] args) {
		for (int i=1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("");
			}
			for (int k=1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}


/* 
Output:
1
12
123
1234


*/