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
			System.out.println("����ȡ��"+num+"�ֽ���");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("�ļ�û���ҵ���");
		}catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}

	}

}
