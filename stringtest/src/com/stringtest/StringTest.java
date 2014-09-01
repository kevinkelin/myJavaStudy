package com.stringtest;

public class StringTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//以下是string对象的常用构造方法
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "world";
		System.out.println(s1==s2);//true
		System.out.println(s1+" "+ s3);
		String s4 = new String("yang");
		String s5 = new String("yang");
		//s4 == s5 是错的，因为它们是new出来的对象，hashcode是不同的
		//但是equals是一样的，因为值是一样的String对象重写了equals方法
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		//以下是通过一个char数组来定义一个string
		char[] c = {'y','a','n','g',' ','j','a','v','a'};
		String cs = new String(c);
		String csi = new String(c,5,3);
		System.out.println(cs);
		System.out.println(csi);
		
		//以下是string类的常用方法
		String name = "YangYanXing";
		System.out.println(name.charAt(7));//X
		System.out.println(name.length());//返回字符串的长度
		System.out.println(name.indexOf('g'));//返回字符串中出现某个字符的第一个位置
		System.out.println(name.equals("yangyanxing"));
		System.out.println(name.equalsIgnoreCase("yangyanxing"));
		System.out.println(name.replace('Y', 'M'));
		System.out.println(name.startsWith("Yang"));//true
		System.out.println(name.startsWith("yang"));//false
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.subSequence(4, 7));
		System.out.println(name.trim());//较常用
		
		String [] sname = name.split("");
		
		for (String string : sname) {
			System.out.println(string);
		}
		
		

	}

}
