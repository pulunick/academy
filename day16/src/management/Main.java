package management;

import java.util.Scanner;
import model.ComputerScienceStudent;
import model.EnglishLinguistiscSudent;
import model.Student;

public class Main {
	
	private static Handler handler = new Handler();  // 다른 메인에서 핸들러 구동시키지 마!

	public static void main(String[] args) {

		Student st = null;
		Scanner sc = new Scanner(System.in);
		String name;
		int select, row, index;

		System.out.println("\t성적관리프로그램\n\n");
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1: // 목록
				handler.showList();
				break;
			case 2: // 추가
				System.out.println("학생 유형을 선택하세요 (1. 영문과 | 2. 컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if (select == 1)
					st = makeEnglishLinguistiscSudent(sc); // 입력할 수 있는 생성자를 호출할 수 있는 객체를 생성해야함
				if (select == 2)
					st = makeComputerScienceStudent(sc);
				row = handler.insert(st);
				if (row == 1)
					System.out.println("추가 성공");
				if (row == 0)
					System.out.println("추가 실패");
				break;
			case 3: // 검색
				System.out.print("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name); // 이름을 전달하여 일치하는 학생을 찾기
				if (st != null)
					st.showDetail(); 	// 학생의 추상메소드에서 가져옴(각자의 자식 클래스에 의해 오버라이딩 된)
				else
					System.out.println(name + "학생을 찾을 수 없습니다");
				break;
			
			case 4 : 	// 삭제
				System.out.print(("삭제할 학생의 이름을 입력하세요 : "));
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달받아서, 이름이 일치하는 학생 객체를 반환
				row = handler.delete(st);	// 그 학생의 배열이므로, 가
				if (row == 1)
					System.out.println("삭제 성공");
				if (row == 0)
					System.out.println("대상 학생이 없습니다");
				break;
			case 5 :
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				index = handler.indexOf(name);
				row = handler.delete(index);
				if (row == 1)
					System.out.println("삭제 성공");
				if (row == 0)
					System.out.println("대상 학생이 없습니다");
				break;
			}
		} while (select != 0);
		System.out.println("ㅡㅡㅡ학습프로그램종료ㅡㅡㅡ");
		sc.close();

	}

	private static Student makeComputerScienceStudent(Scanner sc) {
		String name;
		int kor, eng, mat, java, network, linux;

		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.print("자바점수 : ");
		java = Integer.parseInt(sc.nextLine());
		System.out.print("네트워크점수 : ");
		network = Integer.parseInt(sc.nextLine());
		System.out.print("리눅스점수 : ");
		linux = Integer.parseInt(sc.nextLine());
		
		Student h2 = new ComputerScienceStudent(name, kor, eng, mat, java, network, linux);

		return h2;
	}

	private static Student makeEnglishLinguistiscSudent(Scanner sc) {
		String name;
		int kor, eng, mat, literature, translation;

		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.print("영문학점수 : ");
		literature = Integer.parseInt(sc.nextLine());
		System.out.print("번역점수 : ");
		translation = Integer.parseInt(sc.nextLine());

		Student h1 = new EnglishLinguistiscSudent(name, kor, eng, mat, literature, translation);
		return h1;
	}

}
