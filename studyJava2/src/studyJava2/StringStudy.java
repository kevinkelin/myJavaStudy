package studyJava2;

import java.util.Date;

public class StringStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my name is yyx";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.indexOf("y"));//��ӡ��һ������a��λ��
		System.out.println(str.lastIndexOf(""));//���ַ�����ʱ�򷵻ص����ַ����ĳ���
		System.out.println(str.charAt(5));
		System.out.println(str.substring(3));//�ַ����Ľ�ȡ
		System.out.println(str.substring(3,8));
		System.out.println(str.substring(3,str.length()-2));
		String name = " my name is yangyanxing  ";
		System.out.println(name.trim());
		System.out.println(name.length());
		System.out.println(name.trim().length());
		System.out.println(name.replace("yangyanxing", "kevinkelin").trim());
		
		String s1 = "hello world";
		String s2 = "Hello World";
		if(s1.equals(s2)){
			System.out.println("s1��s2���");
		}else {
			System.out.println("s1��s2�����");
		}
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("s1��s2�ں��Դ�Сдʱ���");
		}else {
			System.out.println("s1��s2��ʹ���Դ�СдҲ�����");
		}
		
		String s3 = "�ҽ�������kevinkelin";
		System.out.println(s3.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		Date date = new Date();
		String year = String.format("%tY", date);
		String month = String.format("%tm", date);
		String day = String.format("%te",date);
		String day2 = String.format("%td",date);
		
		System.out.println(year+month+day+day2);
		System.out.println(date);
		
		
		System.out.printf("my nam is %s",year);//��ʽ�����
		
		
	}

}
