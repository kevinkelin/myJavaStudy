package collectiontest;

import java.lang.reflect.Array;
import java.util.*;
public class Arraylisttest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Collection al = new ArrayList();
		al.add("yang");
		al.add(new Integer(100));
		al.add("kevinkelin");
		al.add(12);//������ȻҲ�������У����ǲ��淶
		System.out.println(al.size());
		//System.out.println(al);
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

}
