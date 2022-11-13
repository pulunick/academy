package airplane;

public class Singer extends Human {
	String job;
	
	Singer(String name, String job) {
		super(name);
		this.job = job;
	}
	@Override
	void show() {
		System.out.printf("이름 : %s, 직업은 : %s" , name, job);
	}


	void sing(Human other) {
		System.out.println(other.name + "노래를 불러 줍니다");
	}

}
