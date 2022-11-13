package reference;

class Unit5 {
	String name;
	int atk;	
	int hp;		
}

public class Ex05 {
	// 대입 연산을 attack이라는 함수로 구성한다면...
	
	static void attack(Unit5 attacker, Unit5 target) {
		target.hp -= attacker.atk;
	}
	
	public static void main(String[] args) {
		Unit5 ob1 = new Unit5();
		ob1.name = "마린";
		ob1.atk = 5;
		ob1.hp = 40;
		
		Unit5 ob2 = new Unit5();
		ob2.name = "저글링";
		ob2.atk = 6;
		ob2.hp = 35;
		
		while(ob1.hp > 0 && ob2.hp > 0) {
			attack(ob1, ob2);	// 2개의 객체를 전달받아서 하나는 공격자, 하나는 대상으로 처리
			attack(ob2, ob1);	// 위치만 바꾸어서 같은 함수를 호출
			
			System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
			System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
			System.out.println();
		}
	}
}
