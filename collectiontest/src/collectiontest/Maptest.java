package collectiontest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maptest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		Map<String,String> m2 = new TreeMap<String,String>();
		m1.put("one", 1);
		m1.put("two", 2);
		m1.put("three", 3);
		m2.put("name", "yangyanxing");
		m2.put("name2", "kevinkelin");
		
		System.out.println(m1.size());
		System.out.println(m1.containsKey("two"));
		System.out.println(m1.containsValue(3));
		System.out.println(m1.containsValue(5));//1.5�Ժ�֧��
		
		if (m1.containsKey("two")) {
			int i = m1.get("two");
			System.out.println(i);
		}
		
		Map<String, String> m4= new HashMap<String, String>();
		m4.put("age", "23");
		Map<String,String> m3 = new HashMap<String,String>(m2);//���ﲻʹ�÷�����Ϊ���ߵ��������Ͳ�ͬ
		m3.putAll(m4);
		System.out.println(m3);//�����
		

	}

}
