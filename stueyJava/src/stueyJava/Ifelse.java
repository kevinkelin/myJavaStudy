package stueyJava;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week = 2;
		switch (week) {
		case 1:
			System.out.println("����������һ");
			break;
		case 2:
			System.out.println("���������ڶ�");
			break;
			
		default:
			System.out.println("�Ҳ�֪�����������ڼ�");
			break;
		}
		int x = 0;
		int sum = 0;//�ֲ���������Ҫ��ʼ���ſ���ʹ��
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
