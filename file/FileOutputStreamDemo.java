package com.file;

//import java.io.File;
//import java.io.IOException;
import java.io.*;

public class FileOutputStreamDemo{
	public static void main(String[] args)  throws IOException{
		File f = new File("\\Home\\FileOperationExample.txt");
		if(f.exists())
			f.delete();
			f.createNewFile();
			
		FileOutputStream fos = new FileOutputStream(f);	
		fos.write(72);
		fos.write(101);
		fos.write(100);
		fos.write(108);
		fos.write(111);
		fos.close();

	}

}
