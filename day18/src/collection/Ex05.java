package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 클래스 대신 Map을 이용하기

public class Ex05 {
	public static void main(String[] args) {
		//HashMap생성
		HashMap<String, Object> p1 = new HashMap<String, Object>();
		p1.put("name", "이지은");
		p1.put("age", 30);
		
		HashMap<String, Object> p2 = new HashMap<String, Object>();
		p2.put("name", "홍진호");
		p2.put("age", 41);
		
		HashMap<String, Object> p3 = new HashMap<String, Object>();
		p3.put("name", "나단비");
		p3.put("age", 5);
		
		//List에 HashMap 값들이 들어갈 수 있는 그릇 만들어주기
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list);
		
		// list를 활용하여 다음과 같이 출려갛세요
		/*	0번째 사람의 이름은 이지은
		 * 	0번째 사림의 나이는 30
		 * 
		 * 	1번째 사람의 이름은 홍진호
		 * 	1번째 사람의 나이는 41
		 * 
		 * 	2번째 사람의 이름은 나단비
		 * 	2번째 사람의 나이는 5
		 * 
		 */
		
		// list의 크기를 이용한 for문 사용
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> map = list.get(i);	// 리스트의 i번째 인덱스에 저장된 값들을
														//Hashmap에 다시 옮겨 담기
			System.out.println(i + "번째 사람의 이름은 " + map.get("name"));	// 키값을 이용하여 value를 출력
			System.out.println(i + "번째 사람의 나이는 " + map.get("age"));
			System.out.println();
			
//			System.out.printf("%d번째 사람의 이름은 %s\n", i, person.getName());
//			System.out.printf("%d번째 사람의 이름은 %d\n\n", i, person.getAge());
		}
		System.out.println("====================================");

		int i = 0;
		for (HashMap<String, Object> map : list) {
			System.out.println(i + "번째 사람의 이름은 " + map.get("name"));
			System.out.println(i + "번째 사람의 나이는 " + map.get("age"));
			System.out.println();
			i++;
		}

	}

}

