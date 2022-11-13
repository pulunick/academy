package reference;
// 두 아이가 하나의 공을 던지고 받는 상황을 코드로 표현하기

class Kid {
	String name;
	Ball ball;	// 공을 참조할 수 있는 참조변수 (초기상태에서는 대상이 없는 상태)
	
	Kid(String name) {
		this.name = name;
	}
	
	void takeBall(Ball ball) {	// 공을 전달받아서, 가지게 하는 함수
		this.ball = ball;
	}
	
	void throwBall(Kid ob) { // 다른 아이를 지정하여 대상에게 공을 넘겨주고, 자신의 공은 사라지는 함수
		ob.ball = this.ball;		// 대입 연산은 복사이기 때문에
		this.ball = null;			// 자신의 ball을 null로 바꾼다
		System.out.printf("%s가 %s에게 공을 던졌다\n", name, ob.name);
	}
}

class Ball {	// 아무 내용도 없지만 기본생성자가 만들어진다
	
}




public class Ex08 {
	public static void main(String[] args) {
		Kid ob1 = new Kid("찬혁이");
		Kid ob2 = new Kid("지용이");
		Ball b = new Ball();
		
		ob1.takeBall(b);		// 찬혁이가 공을 주웠다
		
		ob1.throwBall(ob2);		// 찬혁이가 들고 있던 공을 지용이에게 던졌다
		ob2.throwBall(ob1);		// 지용이가 들고 있던 공을 찬혁이에게 던졌다
		
		// 실체가 없는 사람이 들고 있던 공을 지용이에게 던졌다 (?)
		// null.throwBall(ob2) -> NullpointException
		
		Kid ob3 = null;
		ob3.throwBall(ob2);
	}

}
