package day02;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// Scanner를 이용하여 이름과 나이, 주소를 순서대로 입력받은 후 출력하세요
		// 단, 주소는 띄워쓰기를 포함하여 입력할 수 있어야 합니다
		
		// 1) 변수 선언
		Scanner sc = new Scanner(System.in);
		String name, addr;
		int age;
		
		
		// 2) 입력
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("주소 입력 : ");
		addr = sc.nextLine();
		
		//https://colossus-java-practice.tistory.com/32(위 연산자에 대한 설명)
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		//age = Integer.parseInt(sc.nextLine());
		//parseInt()는 문자열 String타입의 숫자를 int타입으로 변환해주는 녀석이다.
		//int뿐만 아니라 byte, short, long, float, double 등 숫자와 관련된 타입은 전부 가능하다.
		
		
		
		// 3) 출력
		System.out.println("이름 : " + name);
		
		System.out.println("주소 : " + addr);
		
		System.out.println("나이 : " + age);
		
		// 4) 마무리
		sc.close();

	}

}

// print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.

//printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X

//println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.

// 컴퓨터가 자동으로 해주는 부분을 인지해야 한다. -> 나머지 부분을 사용자가 채우기 위해.