package iotest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferstream {

	public static void main(String[] args) {		
		try {
			//new һ��fileinputstream��fileoutputstream
			FileInputStream fin = new FileInputStream("C:\\Users\\kevin\\Desktop\\javatest\\Ifelse.java");
			FileOutputStream fou = new FileOutputStream("C:\\Users\\kevin\\Desktop\\javatest\\bufferout.txt");
			//����fileinputstream������һ��bufferinputstream
			BufferedInputStream bis = new BufferedInputStream(fin,10);
			BufferedOutputStream bos = new BufferedOutputStream(fou);
			int d = 0;
			while ((d = bis.read())!=-1) {
				System.out.print((char)d);
				bos.write(d);
			}	
			
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�û���ҵ���");
		}catch (IOException e) {
			System.out.println("�ļ���ȡ����!");
			e.printStackTrace();
		}
		
		

	}

}
