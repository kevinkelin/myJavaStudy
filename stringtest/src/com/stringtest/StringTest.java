package com.stringtest;

public class StringTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//������string����ĳ��ù��췽��
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "world";
		System.out.println(s1==s2);//true
		System.out.println(s1+" "+ s3);
		String s4 = new String("yang");
		String s5 = new String("yang");
		//s4 == s5 �Ǵ�ģ���Ϊ������new�����Ķ���hashcode�ǲ�ͬ��
		//����equals��һ���ģ���Ϊֵ��һ����String������д��equals����
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		//������ͨ��һ��char����������һ��string
		char[] c = {'y','a','n','g',' ','j','a','v','a'};
		String cs = new String(c);
		String csi = new String(c,5,3);
		System.out.println(cs);
		System.out.println(csi);
		
		//������string��ĳ��÷���
		String name = "YangYanXing";
		System.out.println(name.charAt(7));//X
		System.out.println(name.length());//�����ַ����ĳ���
		System.out.println(name.indexOf('g'));//�����ַ����г���ĳ���ַ��ĵ�һ��λ��
		System.out.println(name.equals("yangyanxing"));
		System.out.println(name.equalsIgnoreCase("yangyanxing"));
		System.out.println(name.replace('Y', 'M'));
		System.out.println(name.startsWith("Yang"));//true
		System.out.println(name.startsWith("yang"));//false
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.subSequence(4, 7));
		System.out.println(name.trim());//�ϳ���
		
		String [] sname = name.split("");
		
		for (String string : sname) {
			System.out.println(string);
		}
		
		

	}

}
