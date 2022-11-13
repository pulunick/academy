package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Menu {
	String name;
	int price;
	
	Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void show() {	// 화면에 출력하는 용도
		System.out.printf("상품명 : %s, 가격 : %,d원\n", name, price);
	}

	@Override
	public String toString() {	// 파일에 기록하는 용도
		
		return String.format("%s:%d\n", name, price);
	}
	
	
	
}

public class Ex08 {
	public static void main(String[] args) throws IOException {
		File f = new File("ex08.txt");
		FileWriter fw = new FileWriter(f);
		
		Menu ob1 = new Menu("아메리카노", 2000);
		Menu ob2 = new Menu("카페라떼", 2500);
		Menu ob3 = new Menu("돌체라떼", 3500);
		Menu ob4 = new Menu("레몬에이드", 2700);
		Menu ob5 = new Menu("콜드브루", 3700);
		
		Menu[] arr = new Menu[] {ob1, ob2, ob3, ob4, ob5};
		
		for (int i = 0; i < arr.length; i++) {
			fw.append(arr[i].toString());
		}
		
		fw.flush();
		fw.close();
		
		System.out.println("끝");
	}

}
