package sort;

public class Ex04 {
	static void showArray(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i] + "");
			System.out.printf("%d : %d\n", i, arr[i]); //(배열 확인)
		}
		System.out.println();
	}
	public static void main(String[] args) {

		// 배열의 두 요소를 교환하기
		// 배열의 각 요소는 일반 변수와 동일하게 취급한다
		
		int[] arr = { 10, 20 };
		showArray(arr);
		
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		showArray(arr);
		
	}

}
