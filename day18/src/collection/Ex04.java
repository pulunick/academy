package collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class DataServer {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public DataServer() {
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("car", "자동차");
		map.put("desk", "책상");
		map.put("ant", "개미");
		map.put("answer", "정답");
		map.put("animal", "동물");
		map.put("chicken", "치킨");
		map.put("phone", "전화");
		map.put("chicken", "치킨");
		map.put("pizza", "피자");
	}
	
	
	// 사용자는 map에 직접 접근할 수는 없지만 메서드를 통해서 keyword를 포함하는 요소만 묶어서 전달받을 수 있다
	public HashMap<String, String> selectAll(String keyword) {
		
		Set<Entry<String, String>> entrySet = map.entrySet();	// map의 key와 value에 쉽게 접 근하기
		HashMap<String, String> result = new HashMap<String, String>();	// 결과를 묶어서 반환할 map
		
		// map의 key와 value를 부르는 것(getter/setter) entry.getKey / entry.getValue
		for(Entry<String, String> entry : entrySet) {	// map의 각 구성요소를 하나의 Entry라고 할때
			if(entry.getKey().contains(keyword)) {		// key가 keyword를 포함하거나
				result.put(entry.getKey(), entry.getValue());	
			}
			if(entry.getValue().contains(keyword)) {	// value가 keyword를 포함한다면
				result.put(entry.getKey(), entry.getValue());	// result에 추가한다
			}
		}
		return result;	// 결과가 모인 result를 반환한다
	}
}

public class Ex04 {
	public static void main(String[] args) {
		// map은 다수의 값을 하나로 묶어서 전달해야 할 때 사용한다
		Scanner sc = new Scanner(System.in);
		String keyword;
		
		System.out.println("검색할 글자를 입력하세요 : ");
		keyword = sc.nextLine();
		
		DataServer db = new DataServer();
		HashMap<String, String> result = db.selectAll(keyword);

		Set<String> keySet = result.keySet();
		for(String key : keySet) {
			Object value = result.get(key);	// 키를 부르면 키로 저장된 값인 value가 나온다.
			System.out.printf("%s : %s\n", key, value);
		}
		System.out.println();
		
		sc.close();
	}
}
