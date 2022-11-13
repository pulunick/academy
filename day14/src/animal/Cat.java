package animal;

public class Cat extends Animal{
//	Implicit super constructor Animal() is undefined for default constructor. 
//	Must define an explicit
//	서브 클래스는 어떤 형식이든 슈퍼클래스의 생성자를 호출할 수 있어야 한다
	
	Cat(String name, int age) {
		super(name, age);
	}
	
//	The type Cat must [implement] the inherited abstract method Animal.bark()
//	Cat 타입은 반드시 상속받은 메서드 bark() 를 [구현]해야 합니다.
//	(Animal의 bark()는 미구현 상태이다)

	@Override	// 상속받은 미구현 메서드를 오버라이딩하여 내용을 만들어주고, 더이상 추상메서드가 아닌게 한다
	public void bark() {
		System.out.println(name + " : 야옹");
	}
	
	public void grooming() {
		System.out.printf("%s가 그루밍을 합니다\n", name);
	}
	

}
