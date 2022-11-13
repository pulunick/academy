package sort;

import java.util.Arrays;

public class Ex06 {
	static void showArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 8, 4, 6 };
		showArray(arr);
		
		Arrays.sort(arr); 	// 별도의 객체를 생성하지 않아도, 정렬 함수를 호출할 수 있다(static)
		showArray(arr);
		
		
 	}

}

// 배열의 연습은 필수다 -> 추후 콜렉션을 연습하는데 도움이 많이 된다