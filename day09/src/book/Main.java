package book;

import java.util.Scanner;

public class Main {
	
	static Handler handler = new Handler();
	
	public static void main(String[] args) {
		
		int book;
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int row = 0, index, menu;
		
		do {
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 목록");
			System.out.println("3. 도서 삭제");
			System.out.println("0. 종료");
			System.out.println("선택 >>> ");
			book = Integer.parseInt(sc.nextLine());
			
			
			switch (book) {
			case 1 :
				Book ob = input(sc);
				result = handler.insert(ob);
				handler.insert(ob);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				break;
			case 2 :
				handler.show();
				break;
			case 3 :
				System.out.print("어떤 값으로 삭제합니까 (1. 번호 | 2. 제목) : ");
				menu = Integer.parseInt(sc.nextLine());
				
				if(menu == 1) {
					System.out.print("도서 번호를 입력하세요 : ");
					index = Integer.parseInt(sc.nextLine());
					row = handler.delete(index);
				}
				else if(menu == 2) {
					System.out.print("도서 제목을 입력하세요 : ");
					index = Integer.parseInt(sc.nextLine());
					row = handler.delete(index);
				}
				else {
					System.out.print("어떤 값을 입력하겠습니까? (1. 번호 | 2. 제목) : ");
				}
				System.out.println("=== 삭제되었습니다 ===");
				break;
			}
			
		} while(book != 0);
		System.out.println("=== 프로그램 종료 ===");
		sc.close();
		
	}
	static Book input(Scanner sc) {
		String name;
		String author;
		int price;
		double starPoint;
		int year;

		System.out.print("도서명 : ");
		name = sc.nextLine();

		System.out.print("저자명 : ");
		author = sc.nextLine();

		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());//parse : 문자열 String타입의 (   )타입으로 변환

		System.out.print("별점 : ");
		starPoint = Double.parseDouble(sc.nextLine());
		
		System.out.print("발행년도 : ");
		year = Integer.parseInt(sc.nextLine());

		Book ob = new Book(name, author, price, starPoint, year);
		return ob;

	}
	

}
