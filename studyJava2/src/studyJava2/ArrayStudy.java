package studyJava2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {1,2,3,4};
		String str[] = {"yang","yan","xing"};
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
		
//		for (String i : str) {
//			System.out.println(i);
//		}

		String info[][] = {{"yang","yanxing","27"},{"bjut","0609","0321"}};
		for(String x[]:info){//这里要用x[] 因为遍历info的一维元素还是数组
			for(String y:x){
				System.out.println(y);
			}
		}
		
		int arr[] = new int[10];
		Arrays.fill(arr,2,5,10);
		for (int i : arr) {
			System.out.println(i);
		}
		
		int a[] = {13,42,2,5,79};
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		
		int newarr[] = Arrays.copyOf(a, 10);
		int newarr2[]= Arrays.copyOfRange(a, 1, 10);
		for(int i:newarr){
			System.out.println(i);
		}
		for(int i:newarr2){
			System.out.println(i);
		}
		int index = Arrays.binarySearch(str,"xing" );
		System.out.println(index);

	}

}
