package chicken;
// 사용자와 상호작용하면서 간단한 제어문과 input등의 함수를 이용하는 코드를 규정한 것.

import java.util.Scanner;

public class Main {
	// main 함수 안에 있던 지역변수를 Main 클래스의 멤버 필드로 변경
//	static Handler handler = new Handler();
	
	public static void main(String[] args) {
		// 사용자와 입출력으로 상호작용하면서 프로그램을 진행하는 코드

		int menu;
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		int result = 0;

		do { // do while 반복문 : 무조건 한번 이상 실행된다.
			System.out.println("1. 메뉴 추가");
			System.out.println("2. 메뉴 목록");
			System.out.println("0. 종료");
			System.out.println("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());

			 // switch ~ case : 
			switch (menu) { // 조건
			case 1: // 변수와 값이 일치하면 해당 case 실행문을 작동시킨다
				Chicken ob = input(sc);
				result = handler.insert(ob);
				handler.insert(ob);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				break; // break는 조건에 해당하는 실행문을 작동시키고 switch문을 종료하기 위해 사용된다.
			case 2:
				handler.show();
				break;
//			default:	// 변수와 값이 일치하면 default 실행문을 작동시킨다.
//				실행문;
//				break;

			}

		} while (menu != 0);
		System.out.println("=== 프로그램 종료 ===");
		sc.close();
	}	// end of main

	static Chicken input(Scanner sc) {
		String brand, store, menu;
		int price;
		double starPoint;

		System.out.print("브랜드 : ");
		brand = sc.nextLine();

		System.out.print("점포명 : ");
		store = sc.nextLine();

		System.out.print("메뉴 : ");
		menu = sc.nextLine();

		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());//parse : 문자열 String타입의 (   )타입으로 변환

		System.out.print("별점 : ");
		starPoint = Double.parseDouble(sc.nextLine());

		Chicken ob = new Chicken(brand, store, menu, price, starPoint);
		return ob;

	}

}
// 유저 인터페이스 계층 (프론트엔드)
// 둘은 섞이면 안된다.
// 비즈니스 로직 - 넘겨주는 데이터를 받아서 원하는대로 가공해주고 메인에 던져주는 역할 (백엔드)

// 자판기 - 돈을 넣고 버튼을 누르는 순간까지(프론트엔드), 이후 모든 작업은(백엔드)

// 스캐너를 이용해 받는것은 특정 클래스에서 받아야함.
// 클래스는 여러개쓸수있지만 public 클래스는 오직 하나만 
// main은 static라서 객체가 없다