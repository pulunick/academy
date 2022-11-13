package abstractClass;

interface USB {	// 인터페이스는 추상클래스, 추상클래스는 클래스, 클래스는  자료형
	void action();
}
class PowerChargeCable extends Object implements USB { // 전력 전송

	@Override
	public void action() {
		System.out.println("전원 충전 중 ...");
	}	
}
class PortableSSd implements USB { // 데이터 입출력

	@Override
	public void action() {
		System.out.println(" E : 연결됨. 용량 1TB");
	}	
}
class Speakr implements USB { // 음성 데이터 전송

	@Override
	public void action() {
		System.out.println("스피커 연결됨. 현재 볼룸 20");
	}	
}
class Pc{
	// 컴퓨터에 외부 장치를 연결하기 위해서는 USB 인터페이스 규격을 만족하면 된다
	// => 자료형이 USB이면 가능하다 (다형성)
	void connect(USB device) {
		device.action();
	}
}

public class Ex04 {
	public static void main(String[] args) {
		// 서로 다른 자료형의 3가지 장치가 모두 하나의 함수에 의해 컴퓨터와 연결될 수 있다.
		Pc pc = new Pc();
		
		PowerChargeCable cable = new PowerChargeCable();
		PortableSSd ssd = new PortableSSd();
		Speakr sp = new Speakr();
		
		pc.connect(cable);	// 케이블 연결 시의 반응이 정상적으로 호출됨
		pc.connect(ssd);	// SSD 연결 시의 반응이 정상적으로 호출됨
		pc.connect(sp);		// 스피커 연결 시의 반응이 정상적으로 호출됨
		
		// 자바 8 이후 함수형 인터페이스 형식이 추가되었음
		// 함수형 인터페이스란, 단 하나의 추상메서드만 가지는 인터페이스를 말한다.
		// 함수형 인터페이스는 람다식에 의해 객체를 생성할 수 있다\
		// 익명 클래스에 의한 객체 생성보다 식이 간편하고, 내부 작동도 다르다.
		
		USB mouse = () -> System.out.println("마우스 연결됨...");
		// 실행하는 코드가 한줄이면 중괄호가 생략가능
		pc.connect(mouse);
		
		// 람다식 구조
		// (매개변수) -> { 실행할 내용 };
		
		USB keyboard = () -> {
			System.out.println("키보드 연결됨...");
		};
		pc.connect(keyboard);
		
		// 1) 함수의 내용이 한줄이면 {} 생략 가능
		// 2) 함수가 매개변수가 하나이면 () 생략 가능
		// 3) 함수의 반환형이 void가 아니고, 한줄만에 값을 반환한다면 return 생략 가능
		
		// Interface ob = a -> a > 0 ? a : -a;
		// Interface ob = (a) -> { return a > 0 ? a : -a; };
		
		// 인터페이스 목적
		// 1) 규격을 맞추기 위해서
		// 2) 특정 함수를 객체화하기 위해서
	}

}
