package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling {
//	private static FileInputStream a;

	public static void main(String[] args) throws IOException {
		File f = new File("\\Home\\first.txt");
   System.out.println(f.createNewFile());
//   System.out.println(f.delete());

		if (f.exists()) {
//			f.delete();
			f.createNewFile();
			
		
		FileInputStream fi = new FileInputStream(f);
		
		
//		System.out.println(fi.read());
		
		int ascii;
		while((ascii=fi.read()) != -1) {
		
		System.out.println((char)ascii);
		}
		
		System.out.println("done !");

	}
}}