package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		
		// Set은 크기가 있지만, index는 없다. 값의 중복을 허용하지 않는다. 순서가 없다
		// 의도적으로 중복을 배제하기 위해서, 중복되지 않은 6개의 숫자를 뽑아라(요런것)
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		System.out.println("set의 크기 : " + set.size());
//		set.get(0);			// index를 이용해서 특정 값을 불러올 수 없다.
		
		System.out.println(set);
		// 같은 값이 들어가면 출력을 하지 않는다(중복은 한개로 출력)
		
//		for(int i = 0; i < set.size(); i++) {
//			index를 이용한 반복문을 사용할 수 없다면?
//		}
		
		for(Integer num : set) { 		// set 안에 들어있는 각 원소를 Integer 타입의 num에 저장해서
			System.out.println(num); 	// 각 정수를 화면에 출력한다
		}	// 순회
		
		// 앞으로 쓰게될 라이브러리들이 Iterator으로 줄지 향상된 for문으로 줄지 모름
		Iterator<Integer> it = set.iterator();	// 반복자
		while(it.hasNext()) {					// sc.hasNext();
			Integer num = it.next();			// sc.next();
			System.out.println("num : " + num);
		}
	}
}
