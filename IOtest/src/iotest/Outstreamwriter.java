package iotest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Outstreamwriter {

	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\kevin\\Desktop\\javatest\\osw.txt",true));//true表示追加写
			//OutputStreamWriter对象可以直接写入字符串也可以直接写入中文
			osw.write("杨彦星");
			osw.write("hello world");
			System.out.println(osw.getEncoding());//打印出文件的编码
			osw.close();
			
			//重新定义osw以ISO8859_1编码写入,写入中文有问题
			osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\kevin\\Desktop\\javatest\\osw2.txt",true),"utf-8");
			osw.write("kevinkelin");
			osw.write("杨彦星");
			System.out.println(osw.getEncoding());
			osw.close();
			System.out.println("文件与入完毕");
			
			
			//以下是inputstreamreader实例
			InputStreamReader isr = new InputStreamReader(System.in);//接收键盘输入
			BufferedReader br = new BufferedReader(isr);//想使用BufferedReader对象的readline方法			
			String s = null;
			s = br.readLine();
			
			while(s!=null){
				if (s.equalsIgnoreCase("exit")) {
					break;
				}
				System.out.printf("你刚才说的是'%s'",s.toUpperCase());
				s = br.readLine();
			}
			br.close();			
		} catch (IOException e) {
			System.out.println("文件读写错误！");
			e.printStackTrace();
			
		}

	}

}
