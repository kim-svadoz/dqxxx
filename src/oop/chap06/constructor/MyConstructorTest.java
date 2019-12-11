package oop.chap06.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {
		//기본생성자를 호출해서 객체를 생성한 후 setter메소드를 이용해서 값 초기화 하기
		MyConstructor obj = new MyConstructor();
		obj.setName("장동건");
		obj.setId("jang");
		obj.setPass("1234");
		System.out.println(obj.getName()+","+obj.getId()+","+obj.getPass());
		
		//매개변수가 있는 생성자 메소드를 호출하면서 값을 초기화 하기
		//MyConstructor(String,String,String)가 호출
		MyConstructor obj2 = new MyConstructor("장동건", "jang", "1234");
		System.out.println(obj2.getName()+","+obj2.getId()+","+obj2.getPass());
		
		System.out.println("==================================");
		//MyConstructor(String,String,String,String)가 호출
		MyConstructor obj3 = new MyConstructor("장동건", "jang", "1234", "짱");
		System.out.println(obj3.getName()+","+obj3.getId()+","+obj3.getPass()+
				","+obj3.getNickname());
		
		MyConstructor obj4 = new MyConstructor("장동건", "jang", "1234", "짱", "울산", 1000);
		System.out.println(obj4.getName()+","+obj4.getId()+","+obj4.getPass()+
				","+obj4.getNickname()+","+obj4.getAddr()+","+obj4.getPoint());
		
	}
}
