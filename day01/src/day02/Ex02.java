package day02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// buffer : 데이터를 복사/이동할 때 사용하는 일정 메모리 단위
		
		Scanner sc = new Scanner(System.in);
		int num;
		String str;
		
		System.out.print("정수입력 : ");
		num = sc.nextInt(); // 입력된 데이터 중에서 정수에 해당하는 값만 저장한다
							// 48 ~ 57 사이의 값만 저장한다.
							// 엔터키의 키 코드는 13(\r), 10(\n)
		
		sc.nextLine(); 		// 버퍼에 남아있는 엔터키 이전값을 가져와서 저장하지 않는다.
							// 엔터키값이 버퍼에서 사라진다
		
		System.out.print("문자열 입력 : ");
		//str = sc.next(); 		// 엔터 혹은 공백 이전까지의 내용을 문자열로 저장한다.
		str = sc.nextLine(); 	// 엔터 이전까지의 내용을 문자열로 저장한다.
		
		System.out.println(num);
		System.out.println(str);
		
		System.out.println("정수 입력 : ");
		num = Integer.parseInt(sc.nextLine()); // 문자열형태로 가져와서 정수로 바꾼다
		System.out.println("문자열 입력 : ");
		str = sc.nextLine();
		
		sc.close();

	}

}
