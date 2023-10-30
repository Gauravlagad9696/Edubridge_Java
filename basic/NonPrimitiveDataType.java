package com.basic;

public class NonPrimitiveDataType {
	public static void main(String[] args) {
		// first way:
				String str = new String("This is a non-primitive data type.");
				System.out.println(str);
				
				// 2nd way:
				String str1 = "It's a another way to define string.";
				System.out.println(str1);
				
				
				int arr [] = new int [34];
				arr[0]=23;
				System.out.println(arr[0]);
				
				String st[]= {"Gauraav","Avi","vishal"};
				System.out.println(st[2]);
	}
}