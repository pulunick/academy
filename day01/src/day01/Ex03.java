package day01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// 연산자  (operator) : 데이터를 연산하기 위해 사용하는 기호 혹은 단어
		/*
		 * 		단항 연산자 : 하나의 변수 혹은 값에 대하여 연산을 처리한다.(num++)
		 * 		이항 연산자 : 두개의 값을 이용하여 연산을 수행한다.
		 * 		삼항 연산자 : 세개의 값을 이용하여 연산을 수행한다.(login ? "로그인" : "로그아웃")
		 * 
		 * 		산술 연산 : +, -, *, /, %
		 * 		증감 연산 : ++, --
		 * 		대입 연산 : =
		 * 		복합 대입 연산 : +=, -=, *=, /=, %=
		 * 		비교 연산 : >, <. >=, <=, ==, !=
		 * 		논리 연산 : &&, ||, !
		 * 		비트 연산 : <<, >>, |, &
		 * 		최우선 연산자 : ., [], instanceOf(), (), 
		 * 
		 */
		
		// 산술 연산, 각 항의 자료형에 따라 결과의 자료형이 달라질 수 있다
		// 정수와 정수는 정수가 나온다. 실수와 정수는 실수가 나온다. 실수와 실수는 실수가 나온다.
		double d1 = 100 / 3;				//정수로 계산하여 몫을 구한다
		double d2 = (double)100 / 3;		//실수로 게산하여 정확한 값을 구한다
		double d3 = 100 / (double) 3;		// 
		double d4 = 100 / 3.0;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		// 어떤 수를 0으로 나누면 안된다
//		int test = 3 / 0;
		
		// 나머지 연산의 활용 (%)
		// 1) 홀수, 짝수 (약수, 배수)를 구분할 때 사용할 수 있다
		
		// 2) 어떤 수를 10의 제곱수로 나누면 0의 개수만큼 뒷자리를 분리할 수 있다.
		int idNum = 930516;
		int date = idNum % 100; // 0의 개수만큼(2개) 뒷자리를 분리한다
		idNum /= 100;			// 뒤의 2자리를 버리고, 앞의 4자리만 남긴다
		int month = idNum % 100;
		int year = idNum / 100;
		
		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		
		
		// 3) 난수의 범위를 제한한다
		Random ran = new Random();
		int r = ran.nextInt();
		System.out.println("r : "+ r);
		r = r % 100 + 1;					// 범위 제한
		System.out.println("r : "+ r);
		r = r > 0 ? r : -r;					// 부호 보정
		System.out.println("r : "+ r);
		// 아무리 큰 수를 나눠도 100으로 나누면 0~99 사이다.
		
		int r2 = ran.nextInt(45) + 1;
		System.out.println("r2 : " + r2);
		
		
	}

}


// instanceOf 연산자는 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자.