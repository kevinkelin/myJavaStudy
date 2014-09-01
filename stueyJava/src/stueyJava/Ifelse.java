package stueyJava;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week = 2;
		switch (week) {
		case 1:
			System.out.println("今天是星期一");
			break;
		case 2:
			System.out.println("今天是星期二");
			break;
			
		default:
			System.out.println("我不知道今天是星期几");
			break;
		}
		int x = 0;
		int sum = 0;//局部变量必须要初始化才可以使用
		while (x<=100) {
			sum = sum+x;
			x++;
		}
		System.out.println(sum);
		
		int b=10;
		do{
			System.out.println("ok2");
			b++;
		}while(b<20);
		
		
		for(int i=0;i<10;i++){
			if(i == 5)continue;
			if(i == 8)break;
			System.out.println(i);			
		}
		
	}

}
