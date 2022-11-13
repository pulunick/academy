package day07;

public class StringList {
	
	// 클래스 내부의 함수들이 공통적으로 참조할 수 있는 변수
	// 함수의 지역변수와 구분하기 위해서, 멤버 필드라고 부른다
	// 멤버필드는 파란색, 지역변수는 갈색 (이클립스 기본 테마)
	private String[] arr = new String[0];
	
	public void add(String str) {
		String[] tmp;

		tmp = new String[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;
		
		arr[arr.length - 1] = str;
	}
	
	// 오버로딩 : 현재 클래스 안에 같은 이름의 함수가 2개 이상 있다
	// 오버라이딩 : 슈퍼클래스에게 [상속]받아서 이미 있는데, 같은 형식으로 새로 쓰면 덮어쓴다
	
	@Override	// object.toString()
	public String toString() {
		String ret = "[";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				ret += arr[i];
			}
			ret += i == arr.length - 1 ? "]" : ", ";
		}
		return ret;
	}

	public int size() {
		return arr.length;
	}
}
