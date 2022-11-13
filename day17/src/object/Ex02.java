package object;

import java.util.Comparator;
import java.util.Scanner;

class Test extends Object {
	private String str;
	
	public Test(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	@Override
	public String toString() {
		return "비밀~";
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Test ob = new Test("휴강");
		Runtime rt = Runtime.getRuntime();
		int[] arr = {2, 7, 8, 4, 6 };
		Comparator<Double> cmp = (a, b) -> (int)(b-a);
		
		Object[] t1 = { sc, ob, rt, arr, cmp };
		
		Object target = t1;
		// 자바의 모든 객체는 Object 타입으로 참조 가능하다
		// Object의 배열도 예외가 아니다
		
		// 문제) target으로 시작하여 휴강이라는 문자열을 화면에 출력하세요
		
		System.out.println(rt);
		
		System.out.println(((Test)((Object[])target)[1]).getStr());
		
		Object[] t2 = (Object[])target;
		
		for(int i = 0; i < t2.length; i++) {
			if(t2[i] instanceof Test) {
				Test t3 = (Test)t2[i];
				System.out.println(t3.getStr());
						
			}
		}
	}
}
