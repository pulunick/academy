package animal;

public class Dog extends Animal {
	
	Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void bark() {
		System.out.println(name + " : 멍멍");
	}
	
	public void tailling() {
		System.out.println(name + "가 꼬리를 흔듭니다");
	}


}
