package iotest;

import java.io.FileWriter;
import java.io.IOException;

public class Filewritetest {

	public static void main(String[] args) {
		try {
			FileWriter fw =new FileWriter("C:\\Users\\kevin\\Desktop\\javatest\\char.txt");
			for (int i = 0; i <= 65535; i++) {
				//System.out.print((char)i);
				fw.write(i);				
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("文件写入错误！");
			System.exit(-1);
		}
		System.out.println("文件写入完毕");

	}

}
