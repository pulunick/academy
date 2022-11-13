package day13;


class Food {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public Food() {}
	
	// private 필드의 getter/setter를 자동으로 작성하기
	// source - generate getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// 클래스 Food를 이용하여 서로 다른 음식의 객체를 2개 생성하고
		// 각 객체의 이름과 가격을 printf() 를 이용하여 같은 서식으로 출력하세요
		
		Food ob1 = new Food();	// 비어 있는 객체, 값을 담을 수는 있지만 아직 없음
		Food ob2 = new Food();
		
		ob1.setName("치킨");		// ob1.name = "치킨";
		ob1.setPrice(20000);	// ob1.price = 20000;
		
//		System.out.println(ob1.name);
		System.out.println(ob1.getName());
//		System.out.println(ob1.price);
		System.out.println(ob1.getPrice());
		
		
		
		ob1 = new Food("치킨", 20000);	// 두개의 필드에 대해 setter를 호출한것과 같다
		ob2 = new Food("떡튀순", 15000);	
		
		System.out.printf("%s : %,d원\n", ob1.getName(), ob1.getPrice());
		System.out.printf("%s : %,d원\n", ob2.getName(), ob2.getPrice());
		
		
	}
}






