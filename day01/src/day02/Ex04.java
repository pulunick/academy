package day02;

public class Ex04 {
	public static void main(String[] args) {
		boolean a1;		// primitve type, 원시 자료형
		byte a2;		// 데이터를 저장하는 목적으로 사용	
		char a3;		// 객체가 아니다
		short a4;		// 함수를 포함하지 않고, 오로지 저장목적으로만 사용한다.
		int a5;
		long a6;
		float a7;
		double a8;
		
		Boolean b1; 	// Wrapper class, 원시자료형의 변수를 객체 유형으로 포장하는 클래스
		Byte b2;		// 데이터를 저장하면서, 관련된 함수를 포함하는 자료형
		Character b3;	// 클래스에 의해서 만들어진 객체 유형이다.
		Short b4;		// 함수를 포함한다. 객체의 함수 혹은 클래스의 함수가 있다.
		Integer b5;		// Integer.pareseInt(String s)와 마찬가지로 문자열을 형변환하는 함수도 있다.
		Long b6;
		Float b7;
		Double b8;
		
		a2 = 10;
		b2 = 20;
		
//		a2.		// a2는 원시형 변수이므로, 매서드를 포함하지 않는다.
//		b2.		// 변수는 객체를 저장하고, 객체의 매서드가 포함되어 있다.
//		Byte.   // 객체를 생성하지 않더라도, 클래스에도 매서드가 포함되어 있다.
		
		String t1 = "1234";
		int num = 0;
		
		for(int i = 0; i < t1.length(); i++) {
			char ch = t1.charAt(i);
			num *= 10;
			num += (int)(ch - 48);
		}
		System.out.println("num: " + num);
		
		//Wrapper class의 만들어진 함수를 이용하여 변환하는 코드
		
		int num2 = Integer.parseInt(t1);
		System.out.println("num2 : " + num2);
		
		
	}

}

//붕어빵을 계속해서 찍어낼 수 있는 틀을 클래스(class)라고 한다면, 
//이러한 붕어빵 틀에서 찍혀 나온 맛있는 붕어빵 하나하나를 객체(object)라고 이해할 수 있는 것입니다. 
//즉, 하나의 클래스로부터 무수히 많은 객체를 생성할 수 있는 것입니다.
