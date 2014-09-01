package com.yangyanxing.www;
//自定义异常
public class DunkException extends Exception {
	//构造一个无参的构造方法
	public DunkException(){
		
	}
	
	//添加一个有参的构造方法
	public DunkException(String message){
		super(message);
	}

}
