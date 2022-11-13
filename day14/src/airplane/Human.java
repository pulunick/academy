package airplane;

public class Human {
	String name;
	
	
	Human(String name) {
		this.name = name;
	}
	
	void show() {
		System.out.printf("이름 : %s", name);
	}

}
