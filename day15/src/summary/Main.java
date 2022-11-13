package summary;

public class Main {
	// 5) give의 매개변수에 들어오는 객체의 타입에 따라 주는 '방식' 을 구별하여 출력하세요

	public static void main(String[] args) {
		
		Human h1 = new Human("황정민");
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("감자");
		Friend f1 = new Friend("하정우");
		
		h1.give(c1);	// 황정민이 구름이에게 츄르를 준다
		h1.give(d1);	// 황정민이 감자에게 개껌을 준다
		h1.give(f1);	// 황정민이 하정우에게 주먹밥을 준다

	}

}
