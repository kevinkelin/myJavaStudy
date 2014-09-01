package iotest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereadertest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\kevin\\Desktop\\javatest\\Ifelse.java");
			int c = 0;
			while ((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件没有找到！");
		}catch (IOException e) {
			System.out.println("文件读取错误！");
		}
		

	}

}
