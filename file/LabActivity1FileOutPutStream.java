package com.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LabActivity1FileOutPutStream {
	
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("\\Home\\demo\\demo2.txt");
			os.write(70);
			os.write(65);
			os.write(78);
			os.close();
			System.out.println("Succesfully created and written the file");
			
		}
		catch(IOException e2) {
			
			e2.printStackTrace();
		}
	}
	

}
