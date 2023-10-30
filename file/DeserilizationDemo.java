package com.file;

//import java.io.Closeable;/
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class SuperDemo implements Serializable {
	String s;
	int a;

	public SuperDemo(int a, String s) {
		this.a = a;
		this.s = s;
	}

}

public class DeserilizationDemo {
//	private static Object SuperDemo;

	public static void main(String[] args) {
		try {

			FileInputStream fis1 = new FileInputStream("\\Home\\FileOperationExample.txt");
			ObjectInputStream ois1 = new ObjectInputStream(fis1);

			SuperDemo s3 = (SuperDemo) ois1.readObject();
			ois1.close();
			System.out.println("a :" + s3.a);
			System.out.println("s " + s3.s);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
