package collection;

import java.util.ArrayList;

public class ArListTest1 {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		
		arr1.add("Hellow");
		arr1.add("Java!");
//		원하는 배열방에 추가 할 수있다.
		//arr1.add(1, "Bye");
		arr1.add("Very");
		arr1.add("Sleepy");
//		toString이 재정의 되어있어서 간단히 볼 수 있다.
		System.out.println(arr1);
//		ArrayList의 요소 수정하기
		arr1.set(3, "Happy!");
		System.out.println(arr1);
//							ArrayList의 요소 개수(길이)
		for (int i = 0; i < arr1.size(); i++) {
//								ArrayList의 요소 가져오기
			System.out.println(arr1.get(i));
		}
		arr1.remove(2);
//		arr1.remove("Very");
		System.out.println(arr1);
	}
}
