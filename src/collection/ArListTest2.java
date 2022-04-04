package collection;

import java.util.ArrayList;

public class ArListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);
//		Object로 담으려면 박싱을 해야 담긴다.
		arr1.remove((Integer)40);
		System.out.println(arr1);
//		우리가 만든 객체도 아래와 같이 담아 둘 수 있다.
		ArrayList<User> arr2 = new ArrayList<User>();
		
		arr2.add(new User("apple"));
		arr2.add(new User("banana"));
		arr2.add(new User("cherry"));
		
		arr2.remove(new User("banana"));
		System.out.println(arr2);
	}
}
class User{
	String userid;

	public User(String userid) {
		this.userid = userid;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "아이디 : "+ this.userid;
	}
//	equals의 재정의 해서 remove의 obj 비교하여 삭제가 되도록 한다ㅣ.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User target = (User)obj;
			if(this.userid.equals(target.userid)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return this.userid.length();
	}
}















