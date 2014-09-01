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
		/*throws 定义在方法名后面，表明我可能要抛出的异常，对于调用此方法的函数要么进行
		 *try catch 捕获，要么继续抛出异常
		 */
		throw new DunkException("喝酒别开车！");
		
	}
	
	public void test2(){
		try{
			test1();
		}catch(DunkException e){
			RuntimeException rtm = new RuntimeException("我是你大爷");
			rtm.initCause(e);
			throw rtm;
		}
	}

}
