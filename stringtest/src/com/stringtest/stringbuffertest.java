package com.stringtest;

public class stringbuffertest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String string = "yangyanxing";
		char[] a = {'k','e','v','i','n'};
		StringBuffer sb1 = new StringBuffer("name��");//StringBuffer���췽��
		sb1.append(string);//��ĩβ���
		System.out.println(sb1);
		sb1.append(a);//���һ��array
		System.out.println(sb1);
		System.out.println(sb1.insert(0, "info,"));
		System.out.println(sb1.delete(0, sb1.indexOf("name")));
		System.out.println(sb1.reverse());
	}

}
