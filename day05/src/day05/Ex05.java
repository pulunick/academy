package day05;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		// 메서드 오버로딩, 오버로딩이 되어있으면 쓰는사람이 편하다.
		// overload : 과부하 , 중복정의
		File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		InputStream in = System.in;
		
		Scanner sc1 = new Scanner(f);	// 파일의 내용을 읽어들이는 Scanner
		Scanner sc2 = new Scanner(str);	// 문자열의 내용을 읽어들이는 Scanner
		Scanner sc3 = new Scanner(in);	// 표준입력의 내용을 읽어들이는 Scanner
		
		// Scanner()라는 함수의 이름은 하나인데
		// 매개변수의 자료형에 따라서, 실제로는 3개의 함수가 각각 따로 존재한다.
		// 매개변수에 넣어주는 인자값의 자료형에 따라 서로 다른 함수를 실행하는것이다.
		// 하나의 이름에 여러 함수의 정의가 중복되어 연결된 형식을 함수 오버로딩 이라고 한다.
		
		int n1 = sum(10, 20);
		int n2 = sum(10, 20, 30);
		int n3 = sum(1,2,3,4,5,6,7,8,9,10);
		double n4 = sum(1.2, 2.3);
		
	}	// end of main
	
	// 두 정수를 전달받아서 합게를 반환하는 함수 sum
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	// 여러 정수를 전달받아서(int[]) 합계를 반환하는 합수 sum
	static int sum(int...args) {
		int total = 0;
		for(int i = 0; i < args.length; i++) {
			total += i;
		}
		return total;
	}
	// 두 실수를 전달받아서 합계를 반환하는 함수 sum
	static double sum(double n1, double n2) {
		return n1 +n2;
	}
	
	// 두 정수를 전달받아서 그 합계를 실수로 반환하는 함수 sum
	// Duplicate method sum(int, int) in type Ex05
//	static double sum(int n1, int n2) { // 타입과 개수가 중요하다 , 매개변수의 자료형 혹은 개수가 달라야함.
//		return (double)n1 + (double)n2;
//	}


}













