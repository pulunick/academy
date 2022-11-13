package animal;

public class Main {
	public static void main(String[] args) {
//		Cannot instantiate the type Animal
//		Animal 타입은 객체화할 수 없습니다(추상 클래스는 생성자를 통해 직접 객체를 생성할 수 없다)
//		Animal a1 = new Animal();
		
		Cat c1 = new Cat("구름이", 2);
		c1.bark();
		c1.grooming();
		
//		고양이는 동물이다	(다형성)
		Animal a1 = new Cat("나현냥이", 24);
		a1.bark();		// 오버라이딩 메서드는 호출할 수 있고, 내용도 Cat의 내용대로 수행된다
//		a1.grooming();	// grooming()은 Animal에 정의되어 있지 않아서 호출할 수 없다
		
		
		if(a1 instanceof Cat) {	// 만약, a1이 Cat 타입의 객체이면
			Cat c2 = (Cat) a1;	// 다운캐스팅 후 다른 변수에 저장해두고
			c2.grooming();		// 고유기능을 호출한다
		}
		
		Dog d1 = new Dog("왕왕이", 5);
		d1.bark();
		d1.tailling();
		
		Animal a2 = new Dog("완완이", 3);
		a2.bark();
		
		if(a2 instanceof Dog) {
			Dog d2 = (Dog) a2;
			// a2가 참조하는 대상의 시작주소를 넘겨주고, 형변환하여 Dog만큼 참조할 수 있게 한다
			d2.tailling();
			
			System.out.println(d2);
			System.out.println(a2);
		}
		// 바크가 오버라이딩이기 때문에 형변환을 하지 않아도 구현가능하다(심지어 부모클래스에서 아무것도 
		// 적혀 있지 않아도 구현할 수 있다.) 상세한 내용을 정의할 수 있다.
		
		// 동일한 객체를 참조하더라도, 참조되는 자료형(클래스)에 따라서 호출할 수 있는 메서드가 달라진다
		// 단, 오버라이딩 메서드는 슈퍼클래스에 정의되어 있기 때문에 호출할 수 있고
		// 내용을 덮어씌웠기 때문에 호출 후 실행되는 내용은 서브클래스에 작성된 내용을 따른다
		// 

	}
}

// 부모님이 부모클래스이며, 자식들을 자식클래스로 정의한다. 부모와 자식의 유전형질은 같으나, 
// 자식들이 커서 부모와 같은 일을 한다는 것은 없다.
// 부모가 말을 하는 것을 자식이 배워서 말을 하면서 한글을 깨우치는 것(말을 한다가 기본 추상 메서드 안에 내용이 없음)
// Human p1 = new c1("진형이", 27);
// a2.say();
// a2.job(); = 안된다.xxx






