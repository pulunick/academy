package day04;

public class Ex02 {
	// y = f(x)
	static int getMaxNum(int a, int b, int c) {
		int max = a;
		if(max < b)		max = b;
		if(max < c)		max = c;
		return max;
	}
		
		
	static int getReverseNumber(int a1) {
		int b1 = 0;
		
		while (a1 != 0) {
			int digit = a1 % 10;
			b1 = b1 * 10 + digit;
			a1 /= 10;
			
			
		}
		return b1;
		
	
	}
	
	static int getFee(int a2) {
		int pri = 3000, overcost;
		
		if(a2 > 30) {
			if(a2 % 10 !=0) {
				overcost = (((a2-30) / 10) + 1) *500;
			}
			else {
				overcost = ((a2-30) / 10) * 500;
			}
			pri += overcost;
		}
		return pri;
	}
	
	static int getSummary(int a3, int a4) {
		int b4 = 0;
		
		for(int i = a3; i <= a4; i++) {
			b4 += i;
		}
		return b4;
	}
	
	public static void main(String[] args) {
		// 1) 세 정수를 전달받아서, 가장 큰 수를 반환하는 함수를 정의하고 호출하여 확인하세요
		int n1 = getMaxNum(2,5,7);
		
		System.out.println("n1 : " + n1);
		
		// 2) 정수를 전달받아서, 정수를 거꾸로 뒤집은 값을 반환하는 함수를 작성하세요(while)
		int n2 = getReverseNumber(1234);
		System.out.println("n2 : " + n2);
		
		// 3) 놀이기구 이용시간에 따른 요금을 게산하여 반환하는 함수를 작성하세요 (if)
	    int n3 = getFee(40);
	    System.out.println("n3 : " + n3);
	    // 4) 두 정수 a, b를 전달받아서 a와 b 사이의 모든 합계를 반환하는 함수를 작성하세요(for)
	    int n4 = getSummary(1, 100);
	    System.out.println("n4 : " + n4);
		
	}

}

// 반복문 안에서 return을 수행하면 반복문과 상관없이 함수가 종료된다
// return은 함수안에서 등장하면(어디서든) 즉시 함수가 종료되며 값을 반환한다.
