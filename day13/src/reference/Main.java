package reference;

public class Main {
	
	static void show(Unit ob) {
		System.out.printf("%s : %d\n", ob.getName(), ob.getHp());
	}
	
	public static void main(String[] args) {
		
		Unit ob1 = new Unit("마린", 5, 0, 40);
		Unit ob2 = new Unit("저글링", 6, 0, 35);
		
		while(ob1.getHp() > 0 && ob2.getHp() > 0) {
			// 공격한다 : 대상의 HP에서 (공격자의 ATK - 대상의 DEF)만큼 감소시킨다.
			// ob1이 ob2를 공격하면
//			ob2.setHp(ob2.getHp() - (ob1.getAtk() - ob2.getDef()));
//			
//			// ob2가 ob1을 공격하면
//			ob1.setHp(ob1.getHp() - (ob2.getAtk() - ob1.getDef()));
			
			ob1.attack(ob2);
		
			ob2.attack(ob1);
			show(ob1);
			show(ob2);
			
			System.out.println();
			
		}
	}

}
