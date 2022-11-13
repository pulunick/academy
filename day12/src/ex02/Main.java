package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		사용자 입력 -> main의 지역변수 -> 클래스의 생성자로 전달 -> 객체의 멤버 필드에 저장 -> 객체를 배열에 저장
		
		// 사용자의 입력을 받아서 객체를 생성(이름, 국어, 영어, 수학)하고 핸들러에게 전달하고 결과를 출력
		// 사용자의 입력에 따라 핸들러가 반환하는 정보를 출력(전체, 단일검색)
		// 사용자 입력에 따라 기존 객체를 찾아서 점수를 수정하고 결과를 출력
		// 사용자 입력에 따라 기존 객체를 찾아서 삭제하고 결과를 출력
		

		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		int exam;
		String result, name, find, sub;	// 함수의 결과는 문자열 형태의 result
		int kor, eng, mat, grade;
		Student ob;
		int row;	// 함수의 처리 결과를 보고받는 정수형 row
		
		
		do {System.out.println("\t성적관리프로그램\n\n");
		System.out.println("1. 목록");
		System.out.println("2. 추가");
		System.out.println("3. 검색(이름입력)");
		System.out.println("4. 수정");
		System.out.println("5. 삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >>> ");
		exam = Integer.parseInt(sc.nextLine());
		
		switch(exam){
		case 1 :	// 목록
			result = hd.examAll();
			System.out.println(result);
			break;
			
		case 2 :	// 추가
			System.out.print("이름 입력 : "); name = sc.nextLine();
			System.out.print("국어 점수 : "); kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어 점수 : "); eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학 점수 : "); mat = Integer.parseInt(sc.nextLine());
			ob = new Student(name, kor, eng, mat);
			row = hd.insert(ob);
			if(row == 1) System.out.println("추가 성공");
			if(row == 0) System.out.println("추가 실패");
			break;
			
		case 3 :	// 검색
			System.out.print("검색할 학생의 이름 입력 : ");		// 1. 검색어를 입력받는다.
			find = sc.nextLine();						// 2. 배열에서 검색어와 일치하는 이름을 가진 객체를 찾는다
			result = hd.search(find);					// 3. 찾은 객체의 정보를 출력한다
			if(result != null) System.out.println(result);
			if(result == null) System.out.println("찾는 학생이 없습니다.");
			break;
			
		case 4 :	// 수정
			System.out.print("수정할 학생의 이름 입력 : ");
			find = sc.nextLine();
			System.out.print("수정할 과목을 입력하세요 : ");
			sub = sc.nextLine();
			System.out.print("수정할 점수를 입력하세요 : ");
			grade = Integer.parseInt(sc.nextLine());
			row = hd.update(find, sub, grade);
			if(row == 1) System.out.println("수정 성공");
			if(row == 0) System.out.println("수정 실패");
			break;
			
		case 5 :	// 삭제
			System.out.print("삭제할 학생의 이름 입력 : ");
			find = sc.nextLine();
			row = hd.delete(find);
			if(row == 1) System.out.println("삭제 성공");
			if(row == 0) System.out.println("대상 학생이 없습니다");
			break;
		}
			
		} while (exam!= 0);
		System.out.println("ㅡㅡㅡ학습프로그램종료ㅡㅡㅡ");
		sc.close();
		
	}

}
