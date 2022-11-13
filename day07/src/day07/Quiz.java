package day07;

public class Quiz {
	static void guide(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		guide(arr);
		show(arr);
		
		// 가로로 증가하는 동안 i의 값은 고정됨 j의 값은 증가
		// 세로로 증가하는 동안 j의 값은 고정됨 i의 값은 증가
		// 가로로 감소하는 동안 i의 값은 고정됨 j의 값은 감소
		// 세로로 증가하는 동안 i의 값은 고정됨 i의 값은 감소
		
		// num의 크기를 지정하기 위해 배열 i j 변수 선언.
		int a = 5;			//배열 i의 크기
		int b = 5;			//배열 j의 크기 
		
		// 1부터 시작
		int num = 1;
		
		//(0, -1)부터 시작해야함
		int x = 0;			//배열 시작 x값
		int y = -1;			//배열 시작 y값
		
		int width = a;		// 가로
		int height = b-1;	// 세로
		
		while(num <= a*b) {
			
			//가로로 y값 1씩 증가 
			for (int i = 0; i < width; i++) {// 시행횟수를 가로값으로 설정 0부터 시작 4까지 계산됨 총5회
				arr[x][++y] = num++; 
			}
			width--;
//			show(arr);
			//세로로 x값 1씩 증가
			for (int i = 0; i < height; i++) {// 시행횟수를 세로값으로 설정 0부터 시작 3까지 계산됨 총4회
				arr[++x][y] = num++;
			}
			height--;
//			show(arr);
			
			//가로 역으로 y값 1씩 감소
			for(int i = 0; i < width; i++) {
				arr[x][--y] = num++;
			}
			width--;
//			show(arr);
			
			//세로 역으로 x값 1씩 감소
			for(int i = 0; i < height; i++) {
				arr[--x][y] = num++;
			}
			height--;
		}
		show(arr);

	}


}

// y = 0 x = -1 -> (0, -1)
// while 안에 for문을 쓴다.
// 변수를 만들고 변수의 초기값을 지정하고 문제를 여러번 풀어본 사람만 풀 수 있다.
// 부호반전 함수.
// 대입식을 다 쓴다음 반복문을 쭉 쓰고 규칙성 찾기 놀이 가능.
// 클래스 상속 이전까지 시험. 멤버필드 멤버메소드 생성자 데이터섹터