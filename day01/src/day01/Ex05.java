package day01;

import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		// 제어문 (control statement)
		// 프로그램의 진행 흐름을 제어하는 구문 (진행이 일률적이지 않다)
		
		Random ran = new Random();
		int n1 = ran. nextInt(10) + 1;
		int n2 = ran. nextInt(10) + 1;
		int n3 = ran. nextInt(10) + 1;
		int min;
		
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		if(n1 > n2) {
			if(n2 > n3)
				min = n3;
			else
				min = n2;
		}
		else {
			if(n1 > n3)
				min = n3;
			else
				min = n1;
		}
		System.out.printf("가장 작은수 : %d",min);
		
		
		// 아래에 코드를 작성하여 3개의 정수중 가장 작은 수를 화면에 출력하세요.
		// 먼저 코드를 생각해보고 코드를 쓰는 습관을 가지기.
		
		// 다른 풀이
		min = n1;		// n1이 최소값이라 가정하고
		if(n2 < min)	// 만약, n2가 현재 최소값보다 더 작으면
			min = n2;	// n2의 값을 최소값에 저장
		if(n3 < min)	// 만약, n3가 현재 최소값보다 더 작으면
			min = n3;	// n3의 값을 최소값에 저장
		System.out.printf("가장 작은수 : %d",min);
		
		
	}

}







// 문제를 풀때 내가 먼저 내가 쓰는 언어로 쓴 뒤 그것을 자바코드로 쓰는 것을 연습하자.
// 문법을 배우는 이유는 내 언어를 자바언어로 표현하기 위해 배우는 것.