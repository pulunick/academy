package inheritance;

// 제 1조건 : 클래스 이름과 생성자의 이름이 똑같아야 한다
// 클래스이름() {} : 기본생성자
class Pos {
	int x;
	int y;

	Pos(int x, int y) {
		this.x = x;
		this.y = y;

	}


	void showPos() {
		System.out.printf("x : %d, y : %d\n", x, y);
	}
}

//class Pos3D {		// 상속을 사용하지 않고, 3차원의 좌표를 표현하기 위한 클래스를 작성
//	int x;
//	int y;
//	int z;
//
//	Pos3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//
//	void showPos() {
//		System.out.printf("x : %d, y : %d, z: %d\n", x, y, z);
//	}
//
//}

class Pos3D extends Pos {

	
//	int x;	// Pos 클래스에서 물려받아서 안보이지만 가지고 있음(주석처리 풀어도 수행됨)
//	int y;	// Pos 클래스에서 물려받아서 안보이지만 가지고 있음(주석처리 풀어도 수행됨)
	int z;
	
	Pos3D(int x, int y, int z) {
		super(x, y);	// Pos(x,y)
		this.z = z;
	}

	
//	void showPos() {	// Pos 클래스에서 물려받아서 안보이지만 가지고 있음(주석처리 풀어도 수행됨)
//		System.out.printf("x : %d, y : %d\n", x, y);
//	}
//}

	@Override			// 이 함수는 오버라이딩 되었습니다.
	void showPos() {	// 상속받은 메서드와 형식이 일치하고, 내용은 새로 작성되었습니다.
		System.out.printf("x : %d, y : %d, z: %d\n", x, y, z);
	}

}

public class Ex02 {
	public static void main(String[] args) {
		Pos ob1 = new Pos(2, 3);
		ob1.showPos();
		
		Pos3D ob2 = new Pos3D(5, 8, 7);
		ob2.showPos();
	}

}
