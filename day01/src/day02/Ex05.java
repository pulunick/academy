package day02;

public class Ex05 {
	public static void main(String[] args) {
		
		int n1 = 10, n2 = 3;		// 정수와 정수의 덧셈
		System.out.println(n1);
		n1 += n2;
		n1 = n1 +n2;
		System.out.println(n1);
		
		
		String s1 = "";				// 문자열과 문자열의 덧셈
		String s2 = "A";
		s1 = s1 + s2;
		s1 += s2;
		System.out.println(s1);
		
		String s3 = "";				// 문자열에 정수를 더하는 덧셈
		int n3 = 8;
		s3 += n3;
		s3 = s3 + n3;
		System.out.println(s3);
		
		double pi = 3.1415926535;	//	primitive에 빈문자열을 더하면
		String s4 = pi + "";		// 그 결과는 String 타입으로 나타난다.
		System.out.println(s4);		// 정수와 실수를 String 타입으로 바꾸는 가장 쉬운 방법은 뒤에 빈 문자열을 더 하는 것이다.
		
		//정수와 문자열의 +는 서로 다르게 작동한다.

	}

}
