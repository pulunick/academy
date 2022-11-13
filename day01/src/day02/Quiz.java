package day02;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// if 문제
		
		/*
		 * 		이용 시간에 따라 요금을 책정하는 놀이기구가 있다
		 * 		기본요금 3천원으로 시작하여 10분당 추가요금 500원이 발생한다
		 * 		요금표는 아래와 같은 규칙으로 적용한다
		 * 
		 * 		0 ~ 30		3000원
		 * 		31 ~ 40 	3500원
		 * 		41 ~ 50 	4000원
		 *		...
		 *
		 * 		이용시간을 분으로 입력받아서, 금액을 계산하여 출력하는 코드를 작성하세요
		 *
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int pri = 3000, time, o;
		
		System.out.print("시간 입력 (분) : ");
		time = sc.nextInt();
		
		if(time > 30) {
			if(time % 10 != 0) {
			o = (((time - 30) / 10) + 1) * 500;
			

		}
		else {
			o = ((time-30) / 10) * 500;
		}
			pri = 3000 + o;
		}
		
		System.out.println("요금 : " + pri);
		
	
		sc.close();


}
	
	// This method must return a result of type int
	// 자바는 결과를 반환하기로 했으면 무조건 해야한다.
	static int getPri(int time){
		int pri, o;
		
		if(time > 30) {
			if(time % 10 != 0) {
			o = (((time - 30) / 10) + 1) * 500;
			

		}
		else {
			o = ((time-30) / 10) * 500;
		}
			pri = 3000 + o;
			return pri;
		}
		return 3000;
	}
	
}

	
	
//	int pri =3000, time, p, o;
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.print("이용시간을 입력하시오 : ");
//	time = sc.nextInt();
//	p = (time/10)-2;
//	if(p<0){
//		System.out.printf("이용요금은 %d원 입니다.", pri);
//		}
//	else {
//		o=(500*p)+pri;
//		System.out.printf("이용요금은 %d원 입니다.", o);
//	}
//	sc.close();