package exception;

import java.lang.ArrayIndexOutOfBoundsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		int[] arr = { 10, 30, 20, 40, 50 };
		Scanner sc = new Scanner(System.in);
		int index;
		
		try {
			System.out.print("몇번째 정수를 출력할까요 : ");
			index = sc.nextInt();
			System.out.printf("arr[%d] : %d\n", index, arr[index]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); 	// e.toString()
			System.out.println("index의 범위를 벗어났습니다");
			
		} catch(InputMismatchException e) {
			System.out.println(e);
			System.out.println("정수를 입력해야 합니다");
			
		} finally {	// 예외 발생 여부에 상관없이 무조건 수행하는 코드
			// 함수에서 return은 종료를 의미하지만
			// return 이후에도 finally는 반드시 수행하고 함수가 종료된다
			sc.close();
			System.out.println("프로그램 종료~");
		}
		
		test();
		
	}	// end of main
	
	static void test() {
		try {
			System.out.println("try");
			return;
		} finally {
			System.out.println("Finally !!");
		}
	}
	
}		// end of class
