package day06;

public class Ex01 {
	public static void main(String[] args) {
		// 배열(array) : 같은 자료형의 여러 데이터를 묶어서 관리하는 자료구조
		// 배열은 여러 값을 구별하기 위해 index라고 하는 정수 값을 이용한다
		// 배열의 각 멤버 요소는 단일 변수와 동일하다
		
		int[] arr = { 2, 7, 8, 4, 6 };
		
		// arr배열의 0번째 요소 (변수)의 값은 2이다.
		// arr배열의 1번째 요소 (변수)의 값은 7이다.
		// arr배열의 2번째 요소 (변수)의 값은 8이다.
		// arr배열의 3번째 요소 (변수)의 값은 4이다.
		// arr배열의 4번째 요소 (변수)의 값은 6이다.
		
		// 배열안에 5개의 정수가 포함되어 있어서, 배열의 길이는 5이다.
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("배열의 길이 : " + arr.length);
		
		// 배열의 요소를 반복문으로 출력해보기
		for(int i = 0; i < arr.length; i++) {// 배열 및 리스트를 대상으로, 항상 0부터 크기까지
			System.out.println(arr[i]);
		}
		System.out.println();
		
		// 배열의 멤버 요소는 일반 변수와 동일하게 취급한다
		
		// 대입
		arr[0] = 3;
		
		// 연산
		arr[1] += 1;
		
		//출력
		System.out.println(arr[2]);
		
		
	}

}

// 한칸한칸 크기가 동일하다(배열)
// 배열의 길이는 바뀌지 않는다.
// 동일한 자료형의 데이터를 연속된 공간에 저장하기 위한 자료구조

// 변수란 데이터를 저장하기 위해 프로그램에 의해 이름을  할당받은 메모리 공간을 의미한다.

// 멤버는 두가지로 구분된다.
// 1. 필드(Field)
// 2. 매서드(Method)
// 인스턴스 멤버