package com.pattern;

public class Pattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces for each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for each row
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
