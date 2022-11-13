package oop;

// static : 정적 멤버 요소를 만들 때 사용한다
// 특정 객체를 지목하지 않아도, 자료형에 각인되어 있는 속성이나 기능을 만들 수 있다
// 객체를 생성하지 않아도, 클래스로 접근이 가능하다
// 같은 클래스를 사용하는 모든 객체가 공유할 수 있다

// 클래스 : 객체를 생성하기 위한 자료형, 설계도와 같은 역할
// 객체 : 클래스에 의해 만들어진 실체, 객체를 통하여 속성이나 기능에 접근할 수 있다

class Human {
	//필드
	String name;
	int age;
	static int count;
	
	//생성자
	Human(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
		System.out.println(name + "객체를 생성했습니다!!");
	}
	//메소드
	void show() {
		System.out.printf("%s : %d살\n", name, age);
	}
	
}

public class Ex06 {	
	public static void main(String[] args) {
		System.out.println("Human.count : " + Human.count);
		
		Human ob1 = new Human("이지은", 30);
		Human ob2 = new Human("홍진호", 39);
		
		ob1.show();
		ob2.show();
		
		System.out.println("Human.count : " + Human.count);
		System.out.println("ob1.count : " + ob1.count);
		System.out.println("ob2.count : " + ob2.count);
		
		ob1.count++;	// 첫번째 객체의 count를 증가시키면
		System.out.println("ob2.count : " + ob2.count); // 두번째 객체의 count가 증가되어있다
		
//		The static field Human.count should be accessed in a static way
//		Human클래스의 count필드는 정적필드이므로, 정적인 방법으로 접근해야 한다
//		다시 말해, 객체.필드 방식이 아니라, 클래스.필드로 접근하는 것이 올바른 방법이다.
		
	}

}

// 스태틱은 고정 다이나믹은 유동;
