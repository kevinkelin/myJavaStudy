package com.stringtest;
//当在一个包里面的时候getParentFile()方法返回的是包上层的路径
import java.io.File;
import java.io.IOException;

public class Filetest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String sep = File.separator;
		String filename = "myfile.txt";
		String path = "mydir"+sep+"mydir2";
		File file = new File(path,filename);//File 类的构造方法，参数为路径
		System.out.println(file);
		if (file.exists()) {
			System.out.println("文件名："+file.getAbsolutePath());
			System.out.println("文件大小:"+file.length());
			System.out.println(file.getAbsoluteFile().getParent());			
			System.out.println(file.getName());
		}else {
			System.out.println(file.getParent());//这个方法只是返回一个路径名的字符串
			System.out.println(file.getParentFile());//这个方法返回的是一个File对象，File对象才可以进行mkdirs()方法
			file.getParentFile().mkdirs();//mkdirs不用输入参数且只有File对象才可以有mkdir方法
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
