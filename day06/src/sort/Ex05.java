package sort;

public class Ex05 {
	static void showArray(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
//			System.out.println(arr[i] + "");
			System.out.printf("%d : %d\n", i, arr[i]); //(배열 확인)
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 배열 각 요소를 비교하여 정렬하기 위해 먼저 출력해보기
		
		int[] arr = { 8, 7, 2, 4, 6 };
		
		showArray(arr);
		
		//정렬
		for(int i = 0; i < arr.length - 1; i++) { // 0, 1, 2, 3
			for(int j = i + 1; j < arr.length; j++) {// (i+1) ~ 4
				System.out.printf("%d > %d : %b\n", arr[i], arr[j], arr[i] > arr[j]);
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println("\t교환 !!");
				}
				
			}
			// System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		// 두 수를 비교하기 위해 비교 기준을 i로 정하고, 비교 대상을 j로 정하여
		// 기준과 대상의 크기에 따라 두 변수의 값을 교환하면서
		// 정렬을 수행하는 방식을 선택 정렬이라고 한다
		// (n번째 칸에 맞는 가장 작은 값을 선택하여 위치시킨다.)
		showArray(arr);

	}
	

}

/*	배열의 총 길이 수 만큼 반복문 수행
 *	가장 작은 수를 맨 뒤로 밀면서 반복문 수행, 수행 횟수는 1씩 줄어듦
 *	앞수와 뒷수 비교
 *	낮은 수를 tmp로 넣고
 *  높은 수는 앞수로 교체
 *  낮은 수는 뒷수로 교체하여, 반복문 수행될 때마다 낮은 수가 뒤로 밀리게끔 swap
 */
