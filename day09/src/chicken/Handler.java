package chicken;
// 치킨 객체들을 어떻게 제어(기능)할지.

public class Handler {	// 데이터를 제어하고, 기능을 포함하는 클래스
	
	// 여러 데이터를 저장하기 위한 배열
	Chicken[] arr = new Chicken[10];
	
	// Chicken 타입의 객체를 전달받아서 배열의 빈 칸에 저장하는 기능(메서드)
	int insert(Chicken ob) {
		// data 배열에서 빈칸(null)을 찾아서, 추가하고 반복 종료
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;	// 1개가 추가되었습니다
			}
		}
		return 0;	// 0개가 추가되었습니다 (빈칸이 없으면 추가할 수 없음)
	}
	
	// data 배열의 데이터 중 빈칸이 아닌것만 화면에 출력하기
	void show() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].show();
			}
		}

	}

}

// void = 출력