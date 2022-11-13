package oop;

class Test3 {
	int n1 = 10;				// 객체를 통해서 접근할 수 있다
	static int n2 = 20;			// 클래스를 통해서 접근할 수 있다
	
	void showN1() {				// non-static
		System.out.println(n1);
	}
	static void showN2() {
		System.out.println(n2);	// static 필드를 참조하는 메소드는
								// 동일하게 static을 지정해야 제 기능을 수행할 수 있다
		
//		System.out.println(n1);
//		Cannot make a static reference to the non-static field n1
//		static 메서드에서는 non-static 요소를 참조할 수 없다
//		static이 생성된 시점에서는 non-static 요소의 생성여부를 보장할 수 없기 때문
		// 클래스는 형 객체는 동생 / static은 둘째 형의 개념 -> n1의 값을 출력해라가 말이 안되는 것이다.
	}						
	
}

public class Ex07 {
	public static void main(String[] args) {
//		System.out.println(Test3.n1);	// 객체가 없으면 접근 불가
		System.out.println(Test3.n2);	// 객체를 생성하지 않아도 접근 가능
		
		Test3 ob = new Test3();
		
		System.out.println(ob.n1);	// 클래스가 먼저 로드되고, 이후 객체가 로드된다
		System.out.println(ob.n2);	// 객체가 생성된 시점에서는 당연히 클래스는 로드되어있다.
		
		System.out.println("=====================");
		
		ob.showN1();
		ob.showN2();
		
//		Test3.showN1();		// static이 아니다(non-static)
		Test3.showN2();
	}

}

// 클래스는 형 객체는 동생 / static은 둘째 형의 개념 -> n1의 값을 출력해라가 말이 안되는 것이다.



