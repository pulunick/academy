package book;

public class Handler {
	
	Book[] arr = new Book[20];
	
	int insert(Book ob) {// 추가
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
			if(arr[i] == null) {
				System.out.println("도서가 없습니다");
			}else{
				arr[i].show();
			}
			
		}
	}
	int delete(int index) {
		if(arr[index] != null) {
			arr[index] = null;
			return 1;
		}
		return 0;
	}
	
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

	
