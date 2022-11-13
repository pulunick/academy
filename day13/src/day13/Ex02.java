package day13;


class Student {
	String name;
	int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Student2 {
	private String name;
	private int score;
	
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	// 필드에 직접 접근할 수 없기 때문에, 필드의 값을 반환하는 함수(getter)를 만들어야 한다
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// 접근 제한자를 적용하지 않은 경우
		Student st1 = new Student("이지은", 99);
		System.out.println(st1.name + "의 점수는 " + st1.score + "점 입니다");
		
		// 접근제한자를 적용하고, getter를 사용한 경우
		Student2 st2 = new Student2("홍진호", 22);
//		System.out.println(st2.name + "의 점수는 " + st2.score + "점 입니다");
		System.out.println(st2.getName() + "의 점수는 " + st2.getScore() + "점 입니다");
		// Student2 클래스에서는 값을 대입하는 함수(setter)가 없기 때문에
		// 값을 임의로 수정할 수 없는 상태이다
		
		// 일반적으로 클래스를 작성할 때, field는 private을 적용
		// 메서드는 public을 적용
		// 단, 내부에서만 사용할 용도의 메서드는 private을 지정할 수 있다
		// 생성자는 특별한 경우를 제외하고는 public을 적용한다
	}
}

