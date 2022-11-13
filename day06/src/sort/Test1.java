package sort;

public class Test1 {
	static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + "");
			System.out.printf("%d : %d\n", i, arr[i]); // (배열 확인)
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 배열 각 요소를 비교하여 정렬하기 위해 먼저 출력해보기

		int[] arr = { 2, 7, 8, 4, 6 };

		showArray(arr);

		// 내림차순 정렬
		for (int i = 0; i < arr.length - 1; i++) { // 0, 1, 2, 3
			for (int j = i + 1; j < arr.length; j++) {// (i+1) ~ 4
				System.out.printf("%d > %d : %b\n", arr[i], arr[j], arr[i] > arr[j]);
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println("\t교환 !!");
				}

			}

		}

		showArray(arr);

	}

}