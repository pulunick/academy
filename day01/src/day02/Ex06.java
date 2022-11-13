package day02;

public class Ex06 {

	public static void main(String[] args) {
		// 반복문
		
		int num = 10;
		if(num < 20) {
			System.out.println("if) num : " + ++num);
		}
		
		while(num< 20) {
			// 조건이 거짓이 되기 전까지 반복하여 수행한다
			// 조건이 참인 동안 반복하여 수행한다 (while)
			System.out.println("while) num : " + ++num);
		}
		
		for(int i = 0; num < 30; i++) {
			System.out.println("for) num : " + ++num);
		}
		//num < 30; <<-조건이다(for문)
//		
//		while(true) {			// 반복은 '무조건' 돌아가기 때문에 
//			System.out.println("infinite loop) num : " + ++num);
//			if(num == 10000) {	// 특정 조건에서 반복을 탈출할 조건을 탐색한다
//				break; //break는 if를 제외한 제어문의 블럭을 아래로 빠져나간다.
//			}
//		}
//		System.out.println("끝");

		
	}

}
