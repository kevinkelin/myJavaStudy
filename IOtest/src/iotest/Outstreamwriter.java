package iotest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Outstreamwriter {

	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\kevin\\Desktop\\javatest\\osw.txt",true));//true��ʾ׷��д
			//OutputStreamWriter�������ֱ��д���ַ���Ҳ����ֱ��д������
			osw.write("������");
			osw.write("hello world");
			System.out.println(osw.getEncoding());//��ӡ���ļ��ı���
			osw.close();
			
			//���¶���osw��ISO8859_1����д��,д������������
			osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\kevin\\Desktop\\javatest\\osw2.txt",true),"utf-8");
			osw.write("kevinkelin");
			osw.write("������");
			System.out.println(osw.getEncoding());
			osw.close();
			System.out.println("�ļ��������");
			
			
			//������inputstreamreaderʵ��
			InputStreamReader isr = new InputStreamReader(System.in);//���ռ�������
			BufferedReader br = new BufferedReader(isr);//��ʹ��BufferedReader�����readline����			
			String s = null;
			s = br.readLine();
			
			while(s!=null){
				if (s.equalsIgnoreCase("exit")) {
					break;
				}
				System.out.printf("��ղ�˵����'%s'",s.toUpperCase());
				s = br.readLine();
			}
			br.close();			
		} catch (IOException e) {
			System.out.println("�ļ���д����");
			e.printStackTrace();
			
		}

	}

}
