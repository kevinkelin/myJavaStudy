package com.yangyanxing.www;

public class ChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest test = new ChainTest();
		try {
			test.test2();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	
	public void test1() throws DunkException{
		/*throws �����ڷ��������棬�����ҿ���Ҫ�׳����쳣�����ڵ��ô˷����ĺ���Ҫô����
		 *try catch ����Ҫô�����׳��쳣
		 */
		throw new DunkException("�ȾƱ𿪳���");
		
	}
	
	public void test2(){
		try{
			test1();
		}catch(DunkException e){
			RuntimeException rtm = new RuntimeException("�������ү");
			rtm.initCause(e);
			throw rtm;
		}
	}

}
