package book;

import java.util.Scanner;

import book2.Book;


public class Main {
	static Handler handler;
	
	public static void main(String[] args) {
		//더미 데이터 준비
		Book[] arr = {
				new Book("트렌드 코리아 2023", "김난도", "미래의창", 17100, 4, 4),	
				new Book("아버지의 해방일지", "정지아", "창비", 13500, 4.1, 4.2),	
				new Book("주술회전 20 더블특장판", "아쿠타미 게게", "서울미디어코믹스", 5400, 0, 0),	
			};
		
		handler = new Handler(arr);
		int menu;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 목록");
			System.out.println("3. 도서 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 : // 도서 추가
				Book ob = input(sc);
			}
		}
			
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

}
