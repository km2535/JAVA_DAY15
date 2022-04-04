package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HSetTest {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(60);
		set1.add(30);
		set1.add(20);
//		HashSet의 toString도 구조를 간단히 파악하기 위해 재정의 되어 있다.
		System.out.println(set1);
//		HashSet의 길이
		System.out.println(set1.size());
//		HashSet의 요소 포함여부 확인하기
		System.out.println(set1.contains(30));
//		HashSet에서 요소 삭제하기, 오토박싱 됨
		set1.remove(30);
		
		HashSet<User> set2 = new HashSet<User>();
		set2.add(new User("apple"));
		set2.add(new User("banana")); 
//		HashSet은 기존의 객체와 같은 객체인지 판별할 대 hashCode()로 비교를 한다.
//		정상적으로 이용하려면 우리가 담아줄 객체의 타입 클래스에서 hashCode()를 재정의해야한다.
		set2.add(new User("apple"));
		System.out.println(set2);
		
//		HashSet으로 만든 객체는 iterable하도록 만들기 위해서는 iterator를 사용하여 다시 객체화해야한다.
		Iterator<Integer> iter = set1.iterator();
//		iter를 순서대로 뽑아내기 위해서는 다음과 같이 반복문을 사용하여 사용한다
//		hasNext가 있는지 확인하고 next메소드를 이용하여 하나씩 뽑아낸다.
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
//		이제 모든 요소를 가져왔기 때문에 다음 요소가 없다.
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
//		그래도 다시 뽑아내기 위해서는 다시 등록한다.
		iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}		
	}
}
