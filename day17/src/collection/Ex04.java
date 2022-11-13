package collection;

import java.util.List;	// 각 컬렉션의 특징만 담고 있는 인터페이스
import java.util.Map;	// 이 인터페이스들을 구현(implement)하여 만들어진 하위 클래스들을 이용한다
import java.util.Set;	// ArrayList, HasgSet, HashMap 등등...

public class Ex04 {
	public static void main(String[] args) {
		// Collection Framework : 다수의 데이터를 관리하기 위해 자료를 저장할 수 있는 구조
		// 이 구조를 여러 클래스로 만들어두고, 편의를 위한 메서드도 준비되어 있다
		// 어떤 종류의 컬렉션이 있는지, 어떻게 사용하는 것인지 익히고, 적재적소에 활용할 수 있도록 연습하자
		
		// List : index로 값에 접근하고, 중복을 허용한다
		// Set : index 개념이 없고, 중복을 허용하지 않는다
		// Map : index 대신 key라는 형식을 이용하여 값(value)에 접근한다
		//		이떄, key는 중복을 허용하지 않고, value는 중복을 허용한다
		
		List ob1;
		Set ob2;
		Map ob3;
	}

}
