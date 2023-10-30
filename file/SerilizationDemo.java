package com.file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.io.IOException;
class Super implements Serializable{
	String s;
	int a;
	Super(){
		this.a=48;
		this.s = "gaurav";
	}
	
}

public class SerilizationDemo extends Super {
	public static void main(String[] args) {
		try {
			
			Super s = new Super();
			FileOutputStream fos = new FileOutputStream("\\Home\\FileOperationExample.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(s);
			System.out.println("done !");
		
		} 
		catch(Exception e1) {
			System.out.println(e1);
		}
		
	}
}
