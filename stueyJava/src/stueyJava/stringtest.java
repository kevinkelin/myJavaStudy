package stueyJava;
public class stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my name is yyx";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.indexOf("y"));//打印第一个出现a的位置
		System.out.println(str.lastIndexOf(""));//空字符串的时候返回的是字符串的长度
		System.out.println(str.charAt(5));
		System.out.println(str.substring(3));//字符串的截取
		System.out.println(str.substring(3,8));
		System.out.println(str.substring(3,str.length()-2));
		String name = " my name is yangyanxing  ";
		System.out.println(name.trim());
		System.out.println(name.length());
		System.out.println(name.trim().length());
		System.out.println(name.replace("yangyanxing", "kevinkelin").trim());
		
		String s1 = "hello world";
		String s2 = "Hello World";
		if(s1.equals(s2)){
			System.out.println("s1和s2相等");
		}else {
			System.out.println("s1和s2不相等");
		}
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("s1和s2在忽略大小写时相等");
		}else {
			System.out.println("s1与s2即使忽略大小写也不相等");
		}
		
		String s3 = "我叫杨彦星kevinkelin";
		System.out.println(s3.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		
	}

}
