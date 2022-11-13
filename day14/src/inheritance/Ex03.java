package inheritance;

class Super {	// Super = 4byte
	int n1; // 4byte
	Super(int n1) {
		this.n1 = n1;
		System.out.println("Super 생성자 호출");
	}
	
}
class Sub extends Super {	//sub = 8 byte
	int n2;	//4 byte
	Sub(int n1, int n2) {
		super(n1);
		this.n2 = n2;
		System.out.println("Sub 생성자 호출");
	}
}


public class Ex03 {
	public static void main(String[] args) {
		Sub ob = new Sub(10, 20);	
		System.out.printf("n1 : %d, n2 : %d\n", ob.n1, ob.n2);
	}
}
