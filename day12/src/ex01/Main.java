package ex01;

import java.util.Scanner;

//사용자와의 상호작용
//입출력을 처리하는 클래스

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();	// 데이터 저장 및 기능을 관리하는 객체
		Human ob;				// 입력받을 내용을 저장할 객체를 참조할 변수
		int select, row;
		String find, result;
		String name; 
		int age;
		
		do {
			// 1) 메뉴 출력 및 사용자 입력
			System.out.println("\t친구목록 관리프로그램\n\n");
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			// 2) 사용자 입력에 따른 Handler 기능 호출
			switch(select) {
			case 1: // 전체 목록 (hd에게 결과를 요청하고, 결과를 result에 저장하여 출력)
				result = hd.selectAll();
				System.out.println(result);
				break;
				
			case 2: // 추가 (user에게 데이터를 입력받아 객체를 생성하고, 객체를 hd에게 전달, 결과를 정수로 받기)
				System.out.print("이름 입력 : "); name = sc.nextLine();
				System.out.print("나이 입력 : "); age = Integer.parseInt(sc.nextLine());
				ob = new Human(name, age);
				row = hd.insert(ob);
				if(row == 1) System.out.println("추가 성공");
				if(row == 0) System.out.println("추가 실패");
				break;
				
			case 3: // 검색 (검색어를 입력받아서 검색어를 hd에게 전달, 결과를 받아서 화면에 출력)
				System.out.print("검색할 사람의 이름 입력 : ");
				find = sc.nextLine();
				result = hd.search(find);
				if(result != null) System.out.println(result);
				if(result == null) System.out.println("결과가 없습니다");
				break;
				
				
			case 4: // 수정
				System.out.print("수정할 사람의 이름 입력 : ");
				find = sc.nextLine();
				System.out.print("변경할 나이를 입력 : ");
				age = Integer.parseInt(sc.nextLine());
				row = hd.update(find, age);
				// find와 이름이 일치하는 객체를 찾아서, 그 객체의 나이를 age로 덮어씌우기
				if(row == 1) System.out.println("수정 성공");
				if(row == 0) System.out.println("수정 실패");
				break;
				
			case 5: // 삭제 (검색어를 입력받아서, 검색어를 hd에게 전달, 삭제여부를 결과로 받아서 출력
				System.out.print("삭제할 사람의 이름 입력 : ");
				find = sc.nextLine();
				row = hd.delete(find);
				if(row == 1) System.out.println("삭제되었습니다");
				if(row == 0) System.out.println("결과가 없습니다");
				break;
			}
			
			
			
		}while(select != 0);
		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
