package reference;

class Unit4 {
	String name;
	int atk;	
	int hp;		
}

public class Ex04 {
	// 객체가 메서드 없이 구성되었다면...
	public static void main(String[] args) {
		Unit4 ob1 = new Unit4();
		ob1.name = "마린";
		ob1.atk = 5;
		ob1.hp = 40;
		
		Unit4 ob2 = new Unit4();
		ob2.name = "저글링";
		ob2.atk = 6;
		ob2.hp = 35;
		
		while(ob1.hp > 0 && ob2.hp > 0) {
			ob2.hp = ob2.hp - ob1.atk;
			ob1.hp -= ob2.atk;
			
			System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
			System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
			System.out.println();
		}
	}
}
