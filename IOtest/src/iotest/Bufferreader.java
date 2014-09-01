package iotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferreader {

	public static void main(String[] args) {
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\kevin\\Desktop\\javatest\\bufferwriter.txt"));
			BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\kevin\\Desktop\\javatest\\bufferwriter.txt"));
			
			String s = null;
			//写入100个随机数到bufferwriter.txt
			for (int i = 0; i < 100; i++) {
				s = String.valueOf(Math.random());
				bfw.write(s);
				bfw.newLine();				
			}
			//接下来从bufferwriter.txt读出来这100个随机数
			bfw.flush();//清空bfw中的内容
			while ((s = bfr.readLine())!=null) {
				System.out.println(s);
			}
			bfw.close();
			bfr.close();
		}catch (FileNotFoundException e) {
			System.out.println("文件没有找到！");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("文件写入错误！");
			e.printStackTrace();
		}
		

	}

}
