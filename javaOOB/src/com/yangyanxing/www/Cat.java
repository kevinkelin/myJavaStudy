package com.yangyanxing.www;

public class Cat extends Animal {
	public void run(){
		System.out.println("我是一只猫在跑");
        System.out.println("猫很萌");
		System.out.println("猫很萌,爱吃鱼");
		System.out.println("猫很萌,会抓老鼠");
	}
	public void eat(){
		System.out.println("我是一条猫是吃");
	}
	public void eat(String food){
		System.out.printf("我是只猫，我正在吃%s\n",food);
	}
	//这里是猫自已的方法，不是从基类继承的
	public void creame(){
		System.out.println("这是一条猫在叫");
	}
}
