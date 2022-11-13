package day03;

import java.util.Scanner;

public class Ex06t {
	public static void main(String[] args) {
		// if 문제
		Scanner sc = new Scanner(System.in);
		// 1) 세 정수를 입력받아서, 그 중에서 최소값을 찾아서 출력하세요
		int n1, n2, n3, min;
		System.out.print("1) 세 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(true)		min = n1;
		if(n2 < min)	min = n2;
		if(n3 < min)	min = n3;
		System.out.printf("%d, %d, %d 중에서 최소값은 %d입니다\n\n", n1, n2, n3, min);
		
		// 2) 정수를 입력받아서, 정수의 절대값을 출력하는 코드를 작성하세요
		System.out.print("2) 절대값을 출력할 정수 입력 : ");
		int q2 = sc.nextInt();
		System.out.printf("%d의 절대값은 %d입니다\n\n", q2, q2 < 0 ? -q2 : q2);
		
		// 3) 정수를 입력받아서, 입력받은 수가 홀수인지 짝수인지 판별하여 결과를 문자열로 출력하세요
		System.out.print("3) 홀짝을 판별할 정수를 입력 : ");
		int q3 = sc.nextInt();
		System.out.printf("%d는 %s입니다\n", q3, q3 % 2 == 0 ? "짝수" : "홀수");
		
		sc.close();
	}
}
