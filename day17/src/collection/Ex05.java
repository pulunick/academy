package collection;

import java.util.ArrayList;

public class Ex05 {
	public static void main(String[] args) {
		
		// 배열과 유사하게 사용할 수 있는 리스트
		ArrayList list = new ArrayList();
		
		// 리스트(및 컬렉션)에는 자료형에 상간없이 모든 데이터를 추가할 수 있다.
		System.out.println("리스트의 크기 : " + list.size());
		
		list.add(10);
		list.add(20);
		list.add("ITBANK");
		list.add(20);	// 중복된 데이터 추가
		
		System.out.println("리스트의 크기 : " + list.size());
		System.out.println(list); // toString이 오버라이딩 되어있어서 출력하면 끝
		
		
		Object v1 = list.get(0);	// arr[0]
		Object v2 = list.get(1);	// arr[1]
		System.out.println(v1);
		System.out.println(v2);
		
	}

}
