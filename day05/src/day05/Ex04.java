package day05;

public class Ex04 {
	public static void main(String[] args) {
		
		String s1 = "abc@!#$..hjk";
		
		System.out.println(s1.contains("abc"));
		System.out.println(s1.contains(".."));
		
		if(s1.contains("hjk")) {
			s1 = s1.replace("hjk", "xyz");
		}
		if(s1.contains(".")) {
			s1 = s1.replace(".", "*");
		}
		System.out.println(s1);
		
		
		String s2 = "   Hello, world !!   ";
		String s3 = s2.replace(" ", "");
		System.out.println(s3);
		
		String s4 = s2.trim();
		System.out.println(s4);
		
		String s5 =  "    <div>\n        Hello\n    </div>    ";
		System.out.println(s5);
		String s6 = s5.trim();  // 시작과 끝의 공백을 제거해준다
		System.out.println(s6);
		
		
		//.은 연속으로 2개이상 배치될 수 없다
		String s7 = "1......2";
//		if(s7.contains)("..")) {
		while(s7.contains("..")) {
			s7 = s7.replace("..",".");
		}
		System.out.println(s7);
		
		String s8 = "abcABC123!@#...";
		// 위 문자열에서 영문자를 제외한 나머지는 모두 제거하기
		String s9 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s10 = "";
		
		for(int i = 0; i < s8.length(); i++) {
			char ch = s8.charAt(i);
			if(s9.contains(ch + "")) { //정수를 문자열로 바꾸는 가장 빠른 방법 "" 더하기
//				s10 += ch;
				s10 = s10.concat(ch + "");
			}
		}
		System.out.println(s10);
		
		int num = Integer.parseInt("1234");
		System.out.println(num+1);
	
		
	}

}
