package day03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		// 아래 코드의 실행을 확인하고, 코드의 흐름을 분석해보세요
		
		Scanner sc = new Scanner(System.in);
		int size = 100;
		int current;
		
		System.out.print("0 ~ 100 사이 입력 : ");
		current = sc.nextInt();
		current = current * 100 / size;
		
		System.out.print("[");
		for(int i = 0; i < 50; i++) {
			if(i == 25) {
				System.out.printf(" %3d%% ", current); //전체의 절반에 도달했을 때 %를 출력하라
			}
			else if(i < current / 2) { // 입력된 수가 cur보다 작은구간까지 #을 출력
				System.out.print("#");
			}
			else {						// 위 구간 외는 _가 나오게 출력
				System.out.print("_");
			}
			Thread.sleep(100); 	// CPU에게 0.1초만큼 기다리게 한다 , Thread 사용시 
		}
		System.out.println("]");
		sc.close();
	}
}



/*Thread.sleep 사용법
 * 매개값에는 얼마 동안 일시 정지 상태로 있을것인지 밀리세컨드 (1/1000) 단위로 시간을 알려주면 됩니다.
 * 1000이라는 값을 주면 스레드는 1초동안 일시 정지 상태가 됩니다. 일시 정지 상태에서 주어진 시간이 되기전에 interrupt() 
 * 메소드가 호출되면 InterruptedException이 발생하기 때문에 예외 처리가 필요합니다. 
 * 
 */
