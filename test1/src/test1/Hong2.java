package test1;

public class Hong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var1 = '김'; // 한 글자의 한글 영문 가능. 싱글 따옴표를 써야한다.
		String var2 = "김진형"; // 여러글자의 문자열 가능.
		byte var3 = -128; // -128 ~ +127까지 숫자가 가능하다.
		short var4 = -32768; // -32768 ~ +32767까지 숫자가 가능하다.
		int var5 = 9999999; // -21억 ~ +21억까지 숫자가 가능하다.
		long var6 = 999999; // 여러숫자 입력가능
		
		float var7 = 0.5f; // float는 소수점 선언 후 뒤에 f를 붙이자.
		double var8 = 0.3142422; // 소수점 선언
		
		boolean isStart = false; // true or false를 입력하여 조건식에서 많이 사용한다.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(isStart);

	}

}
