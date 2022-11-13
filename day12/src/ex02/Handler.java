package ex02;

public class Handler {
	
	Student[] arr = new Student[5];

	String examAll() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
				result += arr[i].toString();
				result += "\n";
		}
		return result;
	}

	int insert(Student ob) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}

	String search(String find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(find)) {
				return arr[i].toString();
			}
		}
		return null;
	}

	int update(String find, String sub, int grade) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(find)) {
				switch(sub){
				case "국어" :
					arr[i].kor = grade;
					break;
				case "영어" :
					arr[i].eng = grade;
					break;
				case "수학" :
					arr[i].mat= grade;
					break;
				}
				arr[i].sum = arr[i].kor + arr[i].eng + arr[i].mat;
				arr[i].avg = arr[i].sum / 3.0;
				return 1;
			}
		}
		return 0;
	}

	int delete(String find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(find)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
	// 목록, 추가, 단일검색(이름), 수정, 삭제

}
