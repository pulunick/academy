package day03;


public class Ex02 {
	public static void main(String[] args) {
		
		// 대문자 A부터 Z까지 한줄에 출력
		// 각 글자는 ,로 구분하고 마지막에는 콤마가 없어야 한다.
		
		//char
		
	
		for (char ch = 'A'; ch<='Z'; ch++) {// char문을 사용, 캐릭터는 ''를 이용하여 글자를 묶어주면된다
			System.out.print(ch);
			String next = (ch == 'Z') ? "\n" : ", "; // , 스페이스바가 있기 때문에 문자열로 취급했다. +삼항연산자 알아보기.
			System.out.print(next);
		}
		
		
		
		
		
		
	}

}
