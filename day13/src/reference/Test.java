package reference;

class UnitTest {
	String name;	// 이름
	int atk;		// 공격력
	int def;		// 방어력
	int hp;			// 체력
	public int attack;
	
	void attack(UnitTest ob) {
		ob.hp -=  (atk - ob.def);
	}
}

public class Test {
	public static void main(String[] args) {
		UnitTest ob1 = new UnitTest();
		ob1.name = "마린";
		ob1.atk = 5;
		ob1.hp = 40;
		
		UnitTest ob2 = new UnitTest();
		ob2.name = "저글링";
		ob2.atk = 6;
		ob2.hp = 35;
		
		while(ob1.hp > 0 && ob2.hp > 0) {
//			ob2.hp = ob2.hp - (ob1.atk - ob2.def);
////			 ob1.attack(ob2);	// 마린이 저글링을 공격했다
//			
//			
//			ob1.hp = ob1.hp - (ob2.atk - ob1.def);
//			// ob2.attack(ob1);
			
			ob1.attack(ob2);
			ob2.attack(ob1);
			
			
			System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
			System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
			System.out.println();
		}
	}
}
