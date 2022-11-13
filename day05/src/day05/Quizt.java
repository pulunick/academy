package day05;

public class Quizt {
	static String profile(long data) {
		String result = "";					// String을 받는 profile은 서로 다른 함수이다
		long a = data / 10000000;
		long b = data % 10000000;
//		System.out.println(a + "-" + b);
		result = profile(a + "-" + b);	// 이미 작성한 profile을 활용하여 형태만 맞춰준다
		return result;
	}
	static String profile(String data) {
		String result = "";
		String y = data.substring(0, 2);
		String g = data.substring(7, 8);
		int year = Integer.parseInt(y);
		int gender = Integer.parseInt(g);
		int currentYear = 2022;
		year += (year < 22) ? 2000 : 1900;
		int age = currentYear - year + 1;
		String format = "%d세, %s입니다";
		result = String.format(format, age, gender % 2 == 0 ? "여성" : "남성");
		return result;
	}
	public static void main(String[] args) {
		// 주민등록번호를 전달받아서 나이와 성별을 출력하는 함수를 작성하세요
		// 인자는 정수 혹은 문자열로 전달할 수 있습니다
		// 결과는 String.format을 이용하여 나이, 성별을 문자열형식으로 반환합니다
		
		String s1 = profile(9305162345678L);	// long
		String s2 = profile("930516-2345678");	// String
		
		System.out.println(s1);	// 30세, 여성입니다
		System.out.println(s2);	// 30세, 여성입니다
	}
}