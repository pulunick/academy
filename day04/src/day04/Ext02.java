package day04;

public class Ext02{
	static int getMaxNum(int a1, int a2, int a3) {
		int max = a1;
		if(max < a2) max = a2;
		if(max < a3) max = a3;
		return max;
	}
	
	static int getReverseNumber(int num) {
		int ret = 0;
		while(true) {
			ret += num % 10;
			ret *= 10;
			num /= 10;
			if(num < 10) {
				return ret + num;	
				// 반복문 안에서 return을 수행하면 반복문과 상관없이 함수가 즉시 종료된다
			}
		}
	}
	static int getFee(int time) {
		int over = ((time - 21) / 10) * 500;
		return time > 30 ? 3000 + over : 3000;
		// 삼항 연산은 값을 결정하고, return 은 값을 반환하기 때문에
		// 조건에 따라서 서로 다른 2개의 값을 반환할 경우
		// return 다음에 삼항 연산을 사용할 수도 있다.
	}
	
	static int getSummary(int a, int b) {
//		int sum = 0;
//		for(int i = a; i <= b; i++) {
//			sum += i;
//		}
//		return sum;
		return (a + b) * (b - a + 1) / 2;		//등차수열
	} 
	
	public static void main(String[] args) {
		
		// 1) 세 정수를 전달받아서, 가장 큰 수를 반환하는 함수를 정의하고 호출하여 확인하세요
		int n1 = getMaxNum(20, 5, -300);
		System.out.println("n1 : " + n1);
		
		// 2) 정수를 전달받아서, 정수를 거꾸로 뒤집은 값을 반환하는 함수를 작성하세요 (while)
		int n2 = getReverseNumber(1234);
		System.out.println("n2 : " + n2);
		
		// 3) 놀이기구 이용시간에 따른 요금을 계산하여 반환하는 함수를 작성하세요 (if)
		int n3 = getFee(41);
		System.out.println("n3 : " + n3);
		
		// 4) 두 정수 a, b를 전달받아서 a와 b사이의 모든 합계를 반환하는 함수를 작성하세요 (for)
		int n4 = getSummary(1, 100);
		System.out.println("n4 : " + n4);
		
		
		
		
		
		
		
		
		
	}
}
