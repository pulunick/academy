package day07;

public class Ex06 {
	
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
		
		int num = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = ++num;
			}
		}
		show(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = i * 5 + j + 1;
			}
		}
		show(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				boolean flag = i == 0 || i == 4 || j == 0 || j==4;
				arr[i][j] = flag ? 1 : 0;
			}
		}
		show(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				boolean flag = i == 2 || j == 2;
				arr[i][j] = flag ? 1 : 0;
			}
		}
		show(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				boolean flag = (i - j == 2) || (j - i == 2) || (i == j) && (i % 2 == 1) ; 
				arr[i][j] = flag ? 1 : 0;
			}
		}
		show(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				boolean flag1 = i - j == 2;
				boolean flag2 = j - i == 2;
				boolean flag3 = i + j == 2;
				boolean flag4 = i + j == 6;
				
				boolean flag = flag1 || flag2 || flag3 || flag4;
				
				arr[i][j] = flag ? 1 : 0;
			}
		}
		show(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i % 2 == 1) {
					arr[i][j] = (i+1)*5 - j;
				}
				else {
					arr[i][j] = i * 5 + j + 1;
				}
			}
		}
		show(arr);
		
		//teacher
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = i * 5;

//				int tmp;			
//				if(i % 2 == 0) {
//					tmp = j + 1;
//				}
//				else {
//					tmp = 5 - j;
//				}
				int tmp = i % 2 == 0 ? j + 1 : 5 - j;
				arr[i][j] = i * 5 + tmp;
			}
		}
		show(arr);
		
		
		
	}

}

// i번째는 세로 j번째는 가로
// 각각의 칸의 공통점 혹은 규칙을 찾아내서 코드로 작성하기.
// 조건을 만들어두고 조건을 추가하는 것에 굉장히 용이하다(자바는)
// 코드의 최적화가 중요한 것이 아닌 내가 생각한대로 코드가 움직이느냐가 중요하다.
// 내가 원리를 알고 쓸 수 있게 코드를 길게 늘려서 쓰도록 하자(줄여서 쓰는것보다 더 중요한부분 줄이는 것은 언제든 가능하다)


