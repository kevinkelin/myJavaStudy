package com.yangyanxing.www;

public class Cat extends Animal {
	public void run(){
		System.out.println("����һֻè����");
	}
	public void eat(){
		System.out.println("����һ��è�ǳ�");
	}
	public void eat(String food){
		System.out.printf("����ֻè�������ڳ�%s\n",food);
	}
	//������è���ѵķ��������Ǵӻ���̳е�
	public void creame(){
		System.out.println("����һ��è�ڽ�");
	}
}