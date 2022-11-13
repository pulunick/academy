package oop;

class Test1 {
	/*
	  	Test1() {
	  		// 아무 내용도 없는 기본 생성자가 자동으로 만들어진다.
	  	}
	 */
	
}

public class Ex03 {
	public static void main(String[] args) {
	// 생성자 : 지정한 클래스의 객체를 생성하는 특수한 함수
	// 생성자는 함수이므로 오버로딩이 가능하다
	// 생성자를 작성하지 않으면, 컴파일 시 기본 생성자를 자동으로 만들어준다
	// 이때, 기본 생성자란 매개변수를 전달받지 않는 생성자를 말한다
		
	// 1) 클래스의 이름과 동일하다
	// 2) 별도의 반환형을 가지지 않는다 (void도 쓰지 않는다)
	
		Test1 ob = new Test1();
		System.out.println(ob.toString());
	}
}
