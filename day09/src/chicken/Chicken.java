package chicken;
// 프로그램에서 다룰 데이터의 자료형을 정리하는 작업

/*
 * 		배달 앱에서 주문 가능한 치킨 메뉴의 목록을 하나의 객체로 구성하고 싶다
 * 		무슨 속성이 필요할까?
 * 
 * 		브랜드, 매장(00점), 메뉴이름, 가격, 별점
 * 		속성이 정리되면, 클래스의 멤버 필드로 구성하면된다.
 * 
 * 		주의 : 속성 중심의 객체를 표현할 클래스를 작성할 때
 * 			  여러 객체를 생각하면서 구성하지 않고, 
 * 			  단일 객체를 기반으로 생각하면서 구성한다
 * 
 */

public class Chicken {
	// 클래스의 멤버 필드는 초기값을 지정하지 않아도, 0에 맞는 값으로 초기화된다.
	
	String brand;
	String store;
	String menu;
	int price;
	double starPoint;
	
	// 객체를 생성할 때, 필요한 초기 작업(필드 초기화)을 수행할 생성자를 작성한다
	// 정의된 생성자를 통하지 않고서는, 객체를 생성할 수 없다 !! 5개의 매개변수를 반드시 전달해야한다.
	Chicken(String brand, String store, String menu, int price, double starPoint) {
		// this는 생성된 객체 자기자신을 가리키는 0번째 매개변수이다.
		// 항상 this를 참조할 수 있게되어있다.
		this.brand = brand;
		this.store = store;
		this.menu = menu;
		this.price = price;
		this.starPoint = starPoint;

	}
	
	// 속성이 정리되면 관련된 함수를 메소드로 작성한다
	void show() {
		String form = "%s %s) %s\t%,d원 (★%.1f)"; 	// 서식만 지정
		form = String.format(form, brand, store, menu, price, starPoint); // 값 넣기
		System.out.println(form); 	// 출력

	}
}

// 같은 패키지안의 클래스들은 조건없이 작동한다.
