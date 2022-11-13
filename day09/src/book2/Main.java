package book2;

import java.util.Scanner;

public class Main {
	static Handler handler;
	
	public static void main(String[] args) {
		// 더미 데이터 준비
		Book[] arr = {
			new Book("트렌드 코리아 2023", "김난도", "미래의창", 17100, 4, 4),	
			new Book("아버지의 해방일지", "정지아", "창비", 13500, 4.1, 4.2),	
			new Book("주술회전 20 더블특장판", "아쿠타미 게게", "서울미디어코믹스", 5400, 0, 0),	
		};
		
		handler = new Handler(arr);
		
		Scanner sc = new Scanner(System.in);
		int row = 0, menu;
		String result;
		
		do {
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 목록");
			System.out.println("3. 도서 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:	// 도서 추가
				Book ob = input(sc);
				row = handler.insert(ob);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 2:	// 도서 목록
				result = handler.getList();
				System.out.println(result);
				break;
				
			case 3:	// 도서 삭제
				System.out.print("어떤 값으로 삭제합니까 (1. 번호 | 2. 제목) : ");
				menu = Integer.parseInt(sc.nextLine());
				row = delete(sc, menu);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
			}
			
		} while(menu != 0);
		System.out.println("=== 프로그램 종료 ===");
		sc.close();
	}
	
	static int delete(Scanner sc, int menu) {
		int index, row = 0;
		String name;
		if(menu == 1) {	// 번호로 삭제하기
			System.out.print("도서 번호를 입력하세요 : ");
			index = Integer.parseInt(sc.nextLine());
			row = handler.delete(index);
		}
		else if(menu == 2) {	// 제목으로 삭제하기
			System.out.print("도서 제목을 입력하세요 : ");
			name = sc.nextLine();
			row = handler.delete(name);
		}
		else {
			System.out.println("메뉴 선택이 잘못되었습니다. 다시 시도해주세요");
		}
		return row;
	}
	
	static Book input(Scanner sc) {
		String brand, author, publisher;
		int price;
		double starPoint1, starPoint2;
		
		System.out.print("제목 : ");		brand = sc.nextLine();
		System.out.print("저자 : ");		author = sc.nextLine();
		System.out.print("출판사 : ");		publisher = sc.nextLine();
		System.out.print("가격 : ");		price = Integer.parseInt(sc.nextLine());
		System.out.print("별점1 : ");		starPoint1 = Double.parseDouble(sc.nextLine());
		System.out.print("별점1 : ");		starPoint2 = Double.parseDouble(sc.nextLine());
		
		Book ob = new Book(brand, author, publisher, price, starPoint1, starPoint2);
		return ob;
	}
}
