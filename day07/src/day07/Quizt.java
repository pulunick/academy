package day07;

public class Quizt {
	static void guide(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}

	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int length = 5;
		int[][] arr = new int[length][length];
		int num = 0;
		int x = -1, y = 0;
		int sign = 1;

		while (true) {
			for (int i = 0; i < length; i++) {
				x += sign;
				arr[y][x] = ++num;
			}
			length--;
			if (length == 0)
				break;

			for (int i = 0; i < length; i++) {
				y += sign;
				arr[y][x] = ++num;
			}
			sign = -sign;
		}
		show(arr);
	}
}

// 디버깅을 많이 해야한다.
