package card;

public class Main {
	public static void main(String[] args) {
		// 모든 객체가 같은 값을 공유하게 하려면 static
		Card.setSize(7, 9);
		
		// 객체마다 서로 다른 값을 가지게 하려면 non-static
		Card ob1 = new Card("♥", "3", "H");
		Card ob2 = new Card("♠", "A", "C");
		
		ob1.show();
		ob2.show();
	}

}
