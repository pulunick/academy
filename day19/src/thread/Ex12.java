package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TimerTask;

class Ticto extends TimerTask implements Runnable {
	int count = 0;
	boolean over;

	public Ticto(int count) {
		this.count = count;
	};

	@Override
	public void run() {

		for (int i = count; i != 0; i--) {
			// count값이 0일때까지 감소
			System.out.println("[카운트다운 : " + count + "]");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count--; // count 감소
			if (i == 1) {
				cancel(); // 타이머 종료
				System.out.println("[카운트다운 : 종료]");
			}
		}
		over = true;
	}
	public boolean isOver() {
		return over;
	}
	
}

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list2 = new ArrayList<String>();
		String input = null;
		Ticto timer = new Ticto(5);
		Thread th = new Thread(timer);

//			th.run();
		th.start();

		
		while (timer.isOver() == false) {
			System.out.println("문자열을 마구마구 입력하세요 : ");
			input = sc.nextLine();
			list2.add(input);
		}
		for (String s : list2) {
			System.out.println(s);
		}
		sc.close();
	}
}










