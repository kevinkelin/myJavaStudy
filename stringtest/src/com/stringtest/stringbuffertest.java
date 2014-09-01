package com.stringtest;

public class stringbuffertest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String string = "yangyanxing";
		char[] a = {'k','e','v','i','n'};
		StringBuffer sb1 = new StringBuffer("name：");//StringBuffer构造方法
		sb1.append(string);//在末尾添加
		System.out.println(sb1);
		sb1.append(a);//添加一个array
		System.out.println(sb1);
		System.out.println(sb1.insert(0, "info,"));
		System.out.println(sb1.delete(0, sb1.indexOf("name")));
		System.out.println(sb1.reverse());
	}

}
