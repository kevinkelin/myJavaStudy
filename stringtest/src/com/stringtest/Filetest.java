package com.stringtest;
//����һ���������ʱ��getParentFile()�������ص��ǰ��ϲ��·��
import java.io.File;
import java.io.IOException;

public class Filetest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String sep = File.separator;
		String filename = "myfile.txt";
		String path = "mydir"+sep+"mydir2";
		File file = new File(path,filename);//File ��Ĺ��췽��������Ϊ·��
		System.out.println(file);
		if (file.exists()) {
			System.out.println("�ļ�����"+file.getAbsolutePath());
			System.out.println("�ļ���С:"+file.length());
			System.out.println(file.getAbsoluteFile().getParent());			
			System.out.println(file.getName());
		}else {
			System.out.println(file.getParent());//�������ֻ�Ƿ���һ��·�������ַ���
			System.out.println(file.getParentFile());//����������ص���һ��File����File����ſ��Խ���mkdirs()����
			file.getParentFile().mkdirs();//mkdirs�������������ֻ��File����ſ�����mkdir����
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
