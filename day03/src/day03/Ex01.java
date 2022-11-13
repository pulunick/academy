package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 길이가 정해지지 않은 반복
		// 사용자에게 정수를 입력받아서 합계를 누적시킨다
		// 만약 0을 입력하면 더이상 더하지 않겠다 라는 의미로 생각하여 반복을 중단한다
		
		int input, sum = 0;
		
		while(true) {
			System.out.print("숫자 입력 (0을 입력하면 끝납니다) : ");
			input = sc.nextInt();
			
			sum += input;

			if(input == 0)  break;
				
		} 
		
		System.out.println("합계 : "+ sum);
		sc.close();

	}
	

}
// \n은 문자열에서 줄바꿈을 의미한다.
// 잘 작성된 코드는 노란색 