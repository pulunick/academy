package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n1 = ran.nextInt(15) + 1;
		int n2 = ran.nextInt(15) + 1;
		int n3 = ran.nextInt(15) + 1;
		int current;
		int near1, near2, near3;
		int min;
		
		
		
		/*
		 * 		1층에서 15층 사이의 엘리베이터 3개가 있습니다
		 * 		사용자에게 현재 층을 입력받아서 가장 가까운 엘리베이터가 이동할수 있도록
		 * 		출력문을 만들어서 출력해주세요
		 */
		
		System.out.printf("%d, %d, %d\n", n1, n2, n3);
		
		System.out.print("현재 층수를 입력하세요 : ");
		current = sc.nextInt();		// 현재 층수를 입력받는다
		
		near1 = (current - n1 >= 0) ? current - n1 : n1 - current;
		near2 = (current - n2 >= 0) ? current - n2 : n2 - current;
		near3 = (current - n3 >= 0) ? current - n3 : n3 - current;
		
		System.out.printf("%d, %d, %d\n", near1, near2, near3);
		
		if(near1 > near2) {
			if(near2 > near3)
				min = near3;
			else
				min = near2;
		}
		else {
			if(near1 > near3)
				min = near3;
			else
				min = near1;
		}
		
		if(min == near1) System.out.println("첫 번째 엘리베이터가 움직입니다.");
		if(min == near2) System.out.println("두 번째 엘리베이터가 움직입니다.");
		if(min == near3) System.out.println("세 번째 엘리베이터가 움직입니다.");
		
		
		
		sc.close();
		
		
		}
		
}


//어떻게 풀어나가야하는지 코드를 생각하는 과정을 아는 것이 훨씬 중요하다.
//생각하는 과정을 일기처럼 적는 것도 추천.
