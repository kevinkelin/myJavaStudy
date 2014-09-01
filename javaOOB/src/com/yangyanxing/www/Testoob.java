package com.yangyanxing.www;

import java.util.InputMismatchException;
import java.util.Scanner;

//这里不用import 引用，在同一个包里
public class Testoob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a  = new Animal();
		Animal a1 = new Dog();//多态，使用父类创建子类的引用
		Animal a2 = new Cat();
		Dog dog = new Dog();
		Cat cat = new Cat();
		a.run();
		a.eat();		
		a1.run();		
		a1.eat();
		//a1.creame();//多态父类创建的子类不能使用子类自已的方法
		a2.run();
		a2.eat();
		dog.creame();//不是通过多态创建的子类可以使用自已的方法
		cat.creame();
		cat.eat("鱼");
		dog.run(5);
		//a2.eat("fish");//这里会出错，因为父类里没有定义带参数的eat()方法
		
		Icopulation idog = new Dog();
		idog.copulation();
		
		Icopulation ihuman = new Human();
		ihuman.copulation();
		
		dog.method();
		
		
		        
	// 定义两行三列的二维数组并赋值
	  String [][]names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
             
	// 通过二重循环输出二维数组中元素的值
	for (String [] i:names) {
        
		for (String j:i) {
            
			System.out.println(j);
		}
        
		System.out.println();
	}
	
	Scanner input = new Scanner(System.in);
	try{
		while (true) {
			System.out.println("请输入一个数：");
			int one = input.nextInt();
			System.out.println("请再输入一个数");
			int two = input.nextInt();
			System.out.println("两数相除结果为："+one/two);
			break;
		}
		
	}catch(InputMismatchException e){
		System.out.println("你应该输入一个整数！");
	}catch(ArithmeticException e){
		System.out.println("除数不能为0");
	}finally{
		System.out.println("程序执行完了！");
	}
	
}

}
