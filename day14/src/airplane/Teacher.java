package airplane;

public class Teacher extends Human {
	String job;
	
	Teacher(String name, String job) {
		super(name);
		this.job = job;
	}
	@Override
	void show() {
		System.out.printf("이름 : %s, 직업은 : %s" , name, job);
	}


	void teach(Human other) {
		System.out.println(other.name + "코드에 대해 강의를 합니다.");
	}

}
