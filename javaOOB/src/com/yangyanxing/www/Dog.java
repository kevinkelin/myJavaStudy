package com.yangyanxing.www;
//这里定义了一个狗的类继承Animal基类
public class Dog extends Animal implements Icopulation {
	private String name;
	public Dog() {
		// TODO Auto-generated constructor stub
		System.out.println("子类狗开始创建！");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//对父类的方法进行重写(override) 方法的返回值类型与参数都不能变
	public void run(){
		System.out.println("我是一条狗在跑");
	}
	//方法的重载(overload)只是参数的数量与类型不同，返回值与权限都要相同
	//这里由于父类里的run方法没有重载，所以使用多态创建的子类引用也不能使用带参数的run(5)
	public void run(int a){
		System.out.println("##########");
		super.run();
		System.out.printf("我是只狗，已经跑了%d公里了\n",a);
		System.out.println("##########");
	}
	public void eat(){
		System.out.println("我是一条狗是吃");
	}
	//这里是狗自已的方法，不是从基类继承的
	public void creame(){
		System.out.println(this.toString());
		System.out.println("这是一条狗在叫");
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	public void copulation(){
		System.out.println("狗在交配");
	}
	public void method(){
		super.run();
		this.run();
	}
}
