package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Inputstream {

	public static void main(String[] args) {		
		int b = 0;
		long num = 0;
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\kevin\\Desktop\\javatest\\Ifelse.java");
			//b = in.read();
			while((b=in.read()) !=-1){
				System.out.print((char)b);
				num++;
			}
			in.close();
			System.out.println("共读取了"+num+"字节数");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("文件没有找到！");
		}catch (IOException e) {
			System.out.println("文件读取错误！");
		}

	}

}
