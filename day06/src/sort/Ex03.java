package sort;

public class Ex03 {

	public static void main(String[] args) {
		// 두 변수의 값을 교환하기
		
		int n1 = 10, n2 = 20;
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
		// 임시변수 tmp(=n3(내가 n3로 선언했음 tmp로 쓸 것))
		int n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		
	}

}

// 변수의 규칙 두 개의 값을 동시에 담을 수 없다.