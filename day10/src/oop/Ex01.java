package oop;

class Number {
	int num;
	
	Number(int num) {
		this.num = num;
	}
	
	public String toString() {
		return num + "";
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 클래스는 자료형이고, 객체는 클래스에 의해 만들어진 데이터이다
		// 하나의 클래스로 여러개의 서로 다른 객체를 생성할 수 있다
		
		Number n1 = new Number(3);
		Number n2 = new Number(5);
		Number n3 = n1;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}
}

// 객체는 2개이고 참조변수는 3개
