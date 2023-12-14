package com.kn.inputoutputstream;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo {
	public static int x = 0;
	public static void main(String[] args) {
		String path1 = "C:\\Users\\Lenovo\\OneDrive\\Documents\\io\\input.txt";
		String path2 = "C:\\Users\\Lenovo\\OneDrive\\Documents\\io\\output.txt";
		try {
			//FileInputStream fis = new FileInputStream(path1);
			//FileOutputStream fos = new FileOutputStream(path2);
			FileReader fis = new FileReader(path1);
			FileWriter fos = new FileWriter(path2);
			
			
			while((x = fis.read()) != -1) {
				fos.write(x);
			}
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
