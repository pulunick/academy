package inheritance;

// 클래스의 상속관계를 이용하여 공통 속성은 슈퍼클래스에,
// 개별 속성은 각각의 서브 클래스에 만들어준다.

class Human {	// 공통속성은 슈퍼클래스에, 나머진 자식클래스에
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.printf("이름 : %s, 나이 : %d살\n", name, age);
	}
}
class Student extends Human {
	int score;
	
	Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	@Override
	void show() {
		System.out.printf("이름 : %s, 나이 : %d살, 점수 : %d점\n", name, age, score);
	}
	
}
class Doctor extends Human {
	String major;
	
	Doctor(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	@Override
	void show() {
		System.out.printf("%s의사 %s, %d살\n", major, name, age);
	}
	
	// Doctor 클래스의 고유 기능 (치료), 오버라이딩이 아님.
	void heal(Human other) {
		System.out.printf("%s가 %s를 치료합니다\n", this.name, other.name);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Student st1 = new Student("이지은", 30, 99);
		Student st2 = new Student("홍진호", 41, 22);
		Doctor d1 = new Doctor("김재준", 36, "신경외과");
		Doctor d2 = new Doctor("김사부", 36, "내과");
		
		st1.show();
		st2.show();
		d1.show();
		d2.show();
		
		Human h1 = st1;	// 학생은 사람이다
		Human h2 = st2;
		Human h3 = d1;	// 의사는 사람이다
		Human h4 = d2;
		
		System.out.println(h1.name);
		System.out.println(h2.name);
		System.out.println(h3.name);
		System.out.println(h4.name);
		
//		System.out.println(h1.score);	// score cannot be resolved or is not a field
		System.out.println(((Student)h2).score);	// 강제 형변환
//		System.out.println(h3.major);
		System.out.println(((Doctor)h4).major);
		
		// 다형성에 의해서 서로 다른 타입으로 참조할 수 있지만, 타입에 따라 참조가능한 필드 범위가 달라진다
		
		h1.show();	// show() 메서드는 Human 타입에 정의되어 있어서 호출이 가능하다.
		h2.show();	// 각 객체의 메서드는 서브클래스에 의해 오버라이딩(덮어씌우기)되어 있다.
		h3.show();	// 호출이 가능하지만, 호출한 후 실행되는 내용은 덮어씌운 내용으로 실행된다
		h4.show();	// 강제형변환이 없어도 서브 클래스의 내용대로 실행된다.
		// 메서드를 메인에서 만드는 것이 아닌 클래스에 오버라이딩을 만드는 이유 코드가 짧아지기 때문.
		
		((Doctor)h4).heal(h2);	// 오버라이딩이 아니라서 강제 형변환이 필요하다.
		// 고유기능이 발현되어야 할때는 형변환 다운캐스팅
		
		// 같은 자료형의 여러데이터를 묶어서 저장하는 구조 : 배열
		Human[] arr = { h1, h2, h3, h4 };
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
		
	}

}
