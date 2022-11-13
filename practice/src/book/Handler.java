package book;

public class Handler {
	
	Book[] arr = new Book[20];
	
	Handler() {
		System.out.println("기본 생성자로 객체 생성 (더미 데이터가 없습니다.");
	}
	Handler(Book[] arr) {
		for(int i = 0; i < arr.length; i++) {
			this.arr[i] = arr[i];
		}
		System.out.println("배열을 전달받아서 객체 생성 (더미 데이터가 있습니다.");
	}
	//추가 함수
	int insert(Book ob) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	// 목록 함수
	String getList() {
		String data = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				data += i + 1 + "]";		// 번호지정
				data += arr[i].toStr();		// toStr로 부터 값을 받고
				data += "\n";				
			}
		}
		data +="\n";
		return data;
	}
	
	// 삭제 함수(index로 삭제)
	int delete(int index) { // 사용자가 2번이라 입력시
		if(arr[index - 1] != null) { // index값은 2-1인 1이 되어야 한다. 비어있지 않을경우
			arr[index - 1] = null;	 // 비워준다.
			return 1;
		}
		return 0;
	}
	
	// 삭제 함수(name으로 삭제)
	int delete(String name) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}

}
