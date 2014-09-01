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
			//д��100���������bufferwriter.txt
			for (int i = 0; i < 100; i++) {
				s = String.valueOf(Math.random());
				bfw.write(s);
				bfw.newLine();				
			}
			//��������bufferwriter.txt��������100�������
			bfw.flush();//���bfw�е�����
			while ((s = bfr.readLine())!=null) {
				System.out.println(s);
			}
			bfw.close();
			bfr.close();
		}catch (FileNotFoundException e) {
			System.out.println("�ļ�û���ҵ���");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("�ļ�д�����");
			e.printStackTrace();
		}
		

	}

}
