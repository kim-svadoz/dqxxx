package oop.chap06.constructor;

import java.io.File;
import java.io.FileInputStream;

//API에 정의된 생성자메소드 확인하기 
public class APIConstructorTest {
	public static void main(String[] args) throws Exception{
		byte[] data1 = {65,66,67,68,69};
		char[] data2 = {'a','b', 'c', 'd', 'e'};
		String str = new String(); // String str = "";
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1, 2, 2);
		String str4 = new String(data2);
		
		System.out.println(str1+";"+str1.length());
		System.out.println(str2+";"+str2.length());
		System.out.println(str3+";"+str3.length());
		System.out.println(str4+";"+str4.length());
		
		File f = new File("test.txt"); // 객체를 생성할 때 특정값으로 초기화. => 이것이 "생성자"의 목적
		System.out.println(f.getName());
		
		FileInputStream fs = new FileInputStream("test.txt");
		System.out.println((char)fs.read()); //ascii코드값을 리턴
											//내가 사용하고 싶은 file의 값을 넘겨주고 초기화->file의 한글자를 읽더라!
											//file을 다루고, open된 file을 읽는 것.
	}
}

/*<<생성자>
java에서 시작되는 index는 거의 다 0번부터 시작.
java
0123

생성자는 메소드다. 객체가 생성될 때 호출되는 특별한 메소드이며 주로 자원을 액세스하거나 자원을 사용하기 위해서 초기화하거나 자원관련 작업을 하거나
객체가 가지고 있는 멤버변수를 초기화하는 작업을 정의한다.(자원 - DBMS, 네트워크, 파일시스템....)


[객체생성]
클래스타입 변수  = new 생성자메소드()
-------				------
클래스타입:사용할클래스		생성자메소드:클래스 안에 미리 정의되어 있는 생성자 메소드를 호출
							  일반 메소드처럼 생성자 메소드도 매개변수로 외부에서 값을 전달 받아 사용할 수 있다.

[규칙]
1. 생성자 메소드명은 클래스명과 대소문자까지 정확하게 동일한 이름으로 정의해야 한다.
	=> 리턴타입을 명시하지 않는다.
	
2. 생성자 메소드를 정의하지 않으면 컴파일러가 기본생성자를 제공한다.
	=> 기본생성자 : 매개변수가 없는 생성자
	=> 생성자 메소드를 개발자가 정의하면 컴파일러가 기본생성자를 제공하지 않는다.
	=> 처리되는일이 없다고 하더라도 무조건 기본생성자는 정의해야 한다.
	
3. 생성자 메소드도 일반 메소드 처럼 매개변수를 정의하고 외부에서 값을 전달받아 사용할 수 있다.
	=> 주로 객체에 정의된 멤버변수의 값을 초기화하는 작업
	
4. 생성자 메소드도 일반 메소드처럼 오버로딩을 허용한다.

5. 생성자 메소드 내부에서 다른 생성자 메소드를 호출할 수 있다.
	=> this(매개변수.....)
	=> 반드시 첫 번재 문장에서 호출해야 한다.



*/