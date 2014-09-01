package com.yangyanxing.www;
//这里是定义了一个Animal的基类
public class Animal {
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("父类执行创建！");
	}
	public void run(){
		System.out.println("我是所有动物的跑");
	}
	public void eat(){
		System.out.println("我是所有动物在吃");
	}
}
