package animal;

// 동물이라는 개념은 객체화 할 수 없다.
// 동물의 특성을 물려받은 여러 하위 클래스가 존재하는 것
// 추상 클래스 : 일반 메서드도 포함할 수 있고, 추상 메서드도 포함할 수 있다
// 추상 클래스는 미완성된 내용이 포함되어 있어서, 생성자를 통해 객체를 직접 생성할 수 없다.
// 추상 메서드는 함수의 형식만 정의되어 있고, 함수의 내용(body)이 없는 함수

public abstract class Animal {
	
	String name;
	int age;
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 추상 메서드. 함수 내용이 없다
	public abstract void bark();	// 울음소리

}
