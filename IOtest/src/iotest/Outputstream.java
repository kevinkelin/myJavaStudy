package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Outputstream {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FileOutputStream out = null;
		FileInputStream in =null;
		int b = 0;
		try {
			in = new FileInputStream("C:\\Users\\kevin\\Desktop\\javatest\\Ifelse.java");
			out = new FileOutputStream("C:\\Users\\kevin\\Desktop\\javatest\\Ifelse.java.bak");
			while ((b=in.read())!=-1) {
				out.write((char)b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {			
			System.out.println("Դ�ļ�û���ҵ�");
		}catch (IOException e) {
			System.out.println("�ļ���ȡ����");
		}
		System.out.println("�ļ��Ѿ�����");
		

	}

}
