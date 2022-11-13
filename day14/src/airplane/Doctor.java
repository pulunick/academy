package airplane;

public class Doctor extends Human {
	String job;
	
	Doctor(String name, String job) {
		super(name);
		this.job = job;
	}
	
	@Override
	void show() {
		System.out.printf("이름 : %s, 직업은 : %s" , name, job);
	}

	void heal(Human other) {
		System.out.println(job + " 직업을 가진 " + this.name + "가 " + other.name + "를 치료 합니다");
	}

}
