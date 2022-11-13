package _class;

class Coffee {
	// 문자열 형태의 커피 메뉴 이름
	// 정수 형태의 커피 가격
	String name;
	int price;
	
	// 생성자 : 객체 생성시 호출되는 함수. 클래스의 이름과 똑같고, 반환형 자체가 없다 (void도 쓰지 않는다)
	// 생성자는 작성하지 않으면, JVM(자바가상머신)이 컴파일 할 때 기본 생성자 코드를 작성해준다
	// 개발자가 생성자를 작성하면, JVM은 자동으로 생성자를 만들어주지 않는다
	// 생성자도 함수이므로, 자바의 함수 오버로딩이 적용된다
	Coffee(String name, int price) {
		this.name = name; // 내것의 의미로 this.을 붙여준다
		this.price = price;
	}
	
	// void 반환형으로 이름과 가격을 출력하는 show() 
	void show() {
		System.out.printf("%s : %,d원\n", name, price);
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		// Coffee 클래스를 이용하여 3개의 서로 다른 객체를 생성합니다
		Coffee ob1 = new Coffee("아메리카노", 2000);
		Coffee ob2 = new Coffee("카푸치노", 2500);
		Coffee ob3 = new Coffee("토피넛라떼", 3500);
		
		// 각 객체마다, 이름과 가격을 일일히 넣어주어야 한다.
//		ob1.name = "아메리카노";
//		ob1.price = 2000;
//		
//		ob2.name = "카푸치노";
//		ob2.price = 2500;
//
//		ob3.name = "토피넛 라떼";
//		ob3.price = 3500;
		
		// 서로 다른 객체 3개를 Coffee 배열에 저장합니다
		Coffee[] arr = { ob1, ob2, ob3 };

		// 반복문을 이용하여 각 객체의 show() 함수를 호출합니다
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
}

// .은 한글로 ~~의를 나타낸다.
// 김진형의 이름 김진형.name