package summary;

public class Human {

	String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void give(Companion c) {
		String form = "%s이 %s에게 %s %s준다\n";
		String feed = c.getFeed();
		
		String method = "";		// 슈퍼 클래스 타입으로 묶어서 받아도, 필요하면 구별할 수 있다
		if(c instanceof Animal) 	method = "던져";
		if(c instanceof Human)		method = "건네";
		
		System.out.printf(form, name, c.getName(), feed, method);
	}
}

