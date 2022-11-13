package chicken2;

import java.util.Scanner;

class Chicken {
	
	String brand;
	String store;
	String menu;
	int price;
	double starPoint;
	
	Chicken(String brand, String store, String menu, int price, double starPoint) {
		this.brand = brand;
		this.store = store;
		this.menu = menu;
		this.price = price;
		this.starPoint = starPoint;
	}
	
	void show() {
		String form = "%s %s) %s\t%,d원 (☆%.1f)";	// 서식만 지정
		form = String.format(form, brand, store, menu, price, starPoint);	// 값 넣기
		System.out.println(form);	// 출력
	}
}

class Handler {
	
	Chicken[] arr = new Chicken[10];
	
	int insert(Chicken ob) {

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	void show() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i].show();
			}
		}
	}
}

// Main2.java 의 public class는 Main2라는 이름으로 작성되어야 한다
// 소스 코드의 이름과 public class의 이름은 같아야 한다
// 나머지 클래스는 public 만 아니면 class의 작동을 똑같이 수행할 수 있다
// 하나의 파일 안에 여러 클래스를 만들어 줄 수 있다

public class Main2 {

	public static void main(String[] args) {
		// 사용자와 입출력으로 상호작용하면서 프로그램을 진행하는 코드
		
		int menu;
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		int result = 0;
		
		do {
			System.out.println("1. 메뉴 추가");
			System.out.println("2. 메뉴 목록");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				Chicken ob = input(sc);
				result = handler.insert(ob);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
				break;
			case 2:
				handler.show();
				break;
			}
			
		} while(menu != 0);
		System.out.println("=== 프로그램 종료 ===");
		sc.close();
	}	// end of main
	
	static Chicken input(Scanner sc) {
		String brand, store, menu;
		int price;
		double starPoint;
		
		System.out.print("브랜드 : ");	brand = sc.nextLine();
		System.out.print("점포명 : ");	store = sc.nextLine();
		System.out.print("메뉴 이름 : ");	menu = sc.nextLine();
		System.out.print("가격 : ");		price = Integer.parseInt(sc.nextLine());
		System.out.print("별점 : ");		starPoint = Double.parseDouble(sc.nextLine());
		
		Chicken ob = new Chicken(brand, store, menu, price, starPoint);
		return ob;
	}

}
