package com.yangyanxing.www;
//���ﶨ����һ��������̳�Animal����
public class Dog extends Animal implements Icopulation {
	private String name;
	public Dog() {
		// TODO Auto-generated constructor stub
		System.out.println("���๷��ʼ������");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//�Ը���ķ���������д(override) �����ķ���ֵ��������������ܱ�
	public void run(){
		System.out.println("����һ��������");
	}
	//����������(overload)ֻ�ǲ��������������Ͳ�ͬ������ֵ��Ȩ�޶�Ҫ��ͬ
	//�������ڸ������run����û�����أ�����ʹ�ö�̬��������������Ҳ����ʹ�ô�������run(5)
	public void run(int a){
		System.out.println("##########");
		super.run();
		System.out.printf("����ֻ�����Ѿ�����%d������\n",a);
		System.out.println("##########");
	}
	public void eat(){
		System.out.println("����һ�����ǳ�");
	}
	//�����ǹ����ѵķ��������Ǵӻ���̳е�
	public void creame(){
		System.out.println(this.toString());
		System.out.println("����һ�����ڽ�");
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	public void copulation(){
		System.out.println("���ڽ���");
	}
	public void method(){
		super.run();
		this.run();
	}
}
