package collection;

import java.util.HashMap;

public class HMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

//		HashMap에 데이터 추가하기 
		map.put(1, "하나");
		map.put(2, "둘");
		map.put(3, "셋");
		map.put(4, "넷");
		map.put(5, "다섯");
		
//		HashMap의 데이터 수정하기 
		map.put(5, "여섯");
		
//		HashMap에서 요소 가져오기
		System.out.println(map.get(5));
		
//		HashMap에서 요소 삭제하기(키 값만 넘기는 경우) - Value를 리턴 
		String ma = map.remove(2);
//		value가 출력 된다ㅣ.
		System.out.println(ma);
		
//		HashMap에서 간단히 구조 확인하기
		System.out.println(map);
		
//		HashMap에서 요소 삭제하기 (키 값, value 둘다 넘기는 경우)-boolean타입 리턴(true - 삭제 완료, false - 삭제 실패)
		System.out.println(map.remove(3, "넷"));
		System.out.println(map);

		System.out.println(map.remove(3, "셋"));
		System.out.println(map);
		
//		HashMap의 데이터 갯수(길이) - 한쌍을 하나로 셈
		System.out.println(map.size());
	}
}
