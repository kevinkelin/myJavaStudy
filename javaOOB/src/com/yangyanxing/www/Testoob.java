package com.yangyanxing.www;

import java.util.InputMismatchException;
import java.util.Scanner;

//���ﲻ��import ���ã���ͬһ������
public class Testoob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a  = new Animal();
		Animal a1 = new Dog();//��̬��ʹ�ø��ഴ�����������
		Animal a2 = new Cat();
		Dog dog = new Dog();
		Cat cat = new Cat();
		a.run();
		a.eat();		
		a1.run();		
		a1.eat();
		//a1.creame();//��̬���ഴ�������಻��ʹ���������ѵķ���
		a2.run();
		a2.eat();
		dog.creame();//����ͨ����̬�������������ʹ�����ѵķ���
		cat.creame();
		cat.eat("��");
		dog.run(5);
		//a2.eat("fish");//����������Ϊ������û�ж����������eat()����
		
		Icopulation idog = new Dog();
		idog.copulation();
		
		Icopulation ihuman = new Human();
		ihuman.copulation();
		
		dog.method();
		
		
		        
	// �����������еĶ�ά���鲢��ֵ
	  String [][]names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
             
	// ͨ������ѭ�������ά������Ԫ�ص�ֵ
	for (String [] i:names) {
        
		for (String j:i) {
            
			System.out.println(j);
		}
        
		System.out.println();
	}
	
	Scanner input = new Scanner(System.in);
	try{
		while (true) {
			System.out.println("������һ������");
			int one = input.nextInt();
			System.out.println("��������һ����");
			int two = input.nextInt();
			System.out.println("����������Ϊ��"+one/two);
			break;
		}
		
	}catch(InputMismatchException e){
		System.out.println("��Ӧ������һ��������");
	}catch(ArithmeticException e){
		System.out.println("��������Ϊ0");
	}finally{
		System.out.println("����ִ�����ˣ�");
	}
	
}

}
