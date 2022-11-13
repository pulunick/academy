package management;

import java.util.Scanner;

import model.ComputerScienceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Main {
	private static Handler handler = new Handler();
	
	public static void main(String[] args) {

		EnglishLinguisticStudent st1 = new EnglishLinguisticStudent("이지은", 95, 98, 60, 80, 76);
		ComputerScienceStudent st2 = new ComputerScienceStudent("주호민", 99, 95, 98, 97, 94, 98);
		handler.insert(st1);
		handler.insert(st2);
		Scanner sc = new Scanner(System.in);
		int select, row;
		Student st = null;
		String name;
		// char[] arr = {*, *< *, , 1,2,3,3}
		
		
		System.out.println("\n\t학생 관리 프로그램\n");
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
			case 2:
				System.out.print("학생 유형을 선택하세요(1. 영문과 | 2. 컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1)	st = Input.makeEnglishLinguisticStudent(sc);
				else if(select == 2)	st = Input.makeComputerScienceStudent(sc);
				else	{System.out.println("잘못 입력");	break;}
				handler.insert(st);
				System.out.println("추가 성공");
				break;
			case 3:
				System.out.print("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);
				if(st != null)	st.showDetail();
				else			System.out.println(name + "학생을 찾을 수 없습니다");
				break;
			case 4:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);
				row = handler.delete(st);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
			case 5:
				System.out.print("수정할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.println("수정할 과목을 입력하세요");
				String sub = sc.nextLine();
				System.out.println("점수 입력 : ");
				int num = Integer.parseInt(sc.nextLine());
				st = handler.find(name);
				row = handler.update(st, sub, num);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
			}
			
		}while(select != 0);
		sc.close();
		System.out.println("종료 !!");
	}	
}
