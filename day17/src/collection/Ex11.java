package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Food implements Comparable<Food> {	// 비교가 가능한 음식
	String name;
	String menu;
	int price;
	
	public Food(String name, String menu, int price) {
		super();
		this.name = name;
		this.menu = menu;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s] %s, %d원", name, menu, price);
	}

	@Override
	public int compareTo(Food o) {
		return o.price - this.price;
	}
}

public class Ex11 {
	public static void main(String[] args) {
		// 메인함수 코드가 잘 작동하도록 클래스 및 함수를 작성하여 구현하세요
		
		Food f1 = new Food("굽네치킨", "고추바사삭", 21000);
		Food f2 = new Food("BBQ치킨", "황금올리브", 20000);
		Food f3 = new Food("굽네치킨", "깐풍치킨", 19000);
		Food f4 = new Food("BHC치킨", "맛초킹", 22000);
		Food f5 = new Food("통닭마을", "순살반반", 15000);
		
		List<Food> list = new ArrayList<Food>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		
		list.forEach(food -> System.out.println(food));
		System.out.println();
		
		//null = Comparator.naturalOrder => 반대로 하고싶으면 Comparator.reverseOrder(); 굳
		list.sort(null);	// 기본 정렬하면 가격 내림차순으로 정렬하기
		list.forEach(food -> System.out.println(food));
		System.out.println();
							// 여기에는 직접 기준을 지정하여, 브래드 기준 오름차순으로 정렬하기
		list.sort((a, b) -> a.name.compareTo(b.name));
		list.forEach(food -> System.out.println(food));
	}

}
