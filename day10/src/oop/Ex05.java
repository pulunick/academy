package oop;

class Test2 {
	int num;
	
	// 기본 생성자
	Test2() {
		this(0);		// 생성자 안에서 또다른 생성자를 호출하는 것이 가능하다.
		System.out.println("기본 생성자 호출 !!");
	}
	// - Constructor call must be the first statement in a constructor
	// ->> 생성자 호출은 반드시 생성자 첫번째에서만 진행 할 수 있습니다.
	// 1) 객체의 생성(생성이 완료되지 않으면, 추가작업을 진행할 수 없다)
	// 2) 객체의 생성 이후 초기값 할당 및 추가 작업진행

	
	Test2(int num) {
		this.num = num;
		System.out.println("int를 전달받는 생성자 호출 !!");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2(12);
	}

}

// 생성자를 아예 안쓰면 기본 생성자는 만들어지지만 오버로딩은 안됨
// 사용자가 생성자를 직접 작업할 시 기본생성자를 만들어주지 않는다. -> 기본생성자 추가작성 필요!
// 매개변수를 전달하지않으면 결코 객체를 생성할 수 없다.



