package reference;

class Unit6 {
	String name;
	int atk;	
	int hp;		
	void attack(Unit6 this, Unit6 target) {
		target.hp -= this.atk;
	}
}

public class Ex06 {
	// attack 함수는 Unit자료형의 객체만 처리하므로, Unit자료형에 함수를 포함시켜버린다
	
	
	public static void main(String[] args) {
		Unit6 ob1 = new Unit6();
		ob1.name = "마린";
		ob1.atk = 5;
		ob1.hp = 40;
		
		Unit6 ob2 = new Unit6();
		ob2.name = "저글링";
		ob2.atk = 6;
		ob2.hp = 35;
		
		while(ob1.hp > 0 && ob2.hp > 0) {
			ob1.attack(ob2);	// attack함수를 호출한 주체가 this로 전달된다
			ob2.attack(ob1);	
			
			System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
			System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
			System.out.println();
		}
	}
}
