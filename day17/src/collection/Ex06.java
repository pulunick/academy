package collection;

import java.util.ArrayList;

class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.printf("이름 : %s, 나이 : %d살\n", name,age);
	}
	
	@Override
	public String toString() {
		return String.format("이름 : %s, 나이 : %d살", name,age);
	}
	
}

public class Ex06 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		list1.add(10);
		list1.add(20);
		list1.add(3.14);
		
		Human ob1 = new Human("이지은",30);
		list1.add(ob1);
		
		System.out.println(list1);
		// 배열과 달리 리스트는 서로 다른 자료형의 데이터도 받을 수 있다 !!
		
		ArrayList list2 = new ArrayList();
		Human ob2 = new Human("홍진호", 40);
		
		list2.add(ob1);
		list2.add(ob1);
		System.out.println(list2);
		for(int i = 0; i < list2.size(); i++) {
			Human element = (Human) list2.get(i);
			element.show();
		}
		// 내부 원소(element)가 Object 타입이면, 객체 메서드를 호출하기 위해 일일이 다운캐스팅을 해야한다.
		
		// 자바 1.5에서 새로 추가된 제네릭 타입 문법을 적용하여 문제를 해결
		// 특정 클래스의 객체만 저장하는 리스트
		ArrayList<Human> list3 = new ArrayList<Human>();
		list3.add(ob1);
		list3.add(ob2);
		for(int i = 0; i < list3.size(); i++) {
			list3.get(i).show();
		}System.out.println();
		
		// 향상된 for문 (index를 사용하지 않는 for문, forEach라고도 하지만 함수이름과 중복되므로 .....)
		// Iterable 한 타입에 대해서 적용할 수 있다(배열 포함)
		// list와 배열 둘 다 가능
		
		for(Human element : list3) {	//for(A : B)
			element.show();
		} System.out.println();
		
		// list는 forEach함수가 별도로 존재한다
		// list 만 가능
		list3.forEach(element -> element.show()); //element 일 때, element.show 하라
		System.out.println();
		
		// toString이 오버라이딩 되어 있다면 System.out.println을 전달할 수도 있다
		list3.forEach(System.out::println);;	// 리스트3의 각 요소를 출력해라
		
		// list3의 각 요소를 System.out 객체 내부의 println 메서드의 인자로 전달한다.
		
	}

}
