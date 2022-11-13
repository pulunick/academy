package day07;

public class Ex05 {
	public static void main(String[] args) {
		// 2차원 배열
		
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		int[] arr3 = { 11, 12, 13, 14, 15 };
		int[] arr4 = { 16, 17, 18, 19, 20 };
		int[] arr5 = { 21, 22, 23, 24, 25 };
		
		int[][] arr = { arr1, arr2, arr3, arr4, arr5 };
		

		
		System.out.println(arr[0][0]);
		System.out.println(arr[2][3]);
		
		arr = new int[5][5];	// 모든 값은 0으로 초기화된다
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = i * 5 + j + 1;
			}
		}
		System.out.println(arr[0][0]);
		System.out.println(arr[2][3]);
		System.out.println(arr[4][4]);
		
		
		arr = new int[][] {
//			i				j [0] [1] [2] [3] [4]
		/* [0] */			{  1,  2,  3,  4,  5 },
		/* [1] */			{  6,  7,  8,  9, 10 },
		/* [2] */			{ 11, 12, 13, 14, 15 },
		/* [3] */			{ 16, 17, 18, 19, 20 },
		/* [4] */			{ 21, 22, 23, 24, 25 }
				};
				
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] : %d\n", i, j, arr[i][j]);
			}
			
		}
		
		
	}

}

// 2차원 배열 나만의 이해법 [3][5] 라면 3*5 즉, 15칸 짜리 배열이 만들어진다!(바둑판)
