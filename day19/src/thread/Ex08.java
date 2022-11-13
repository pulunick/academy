package thread;

// 자바에서 다중 스레드를 구현하려면, Thread 클래스를 상속해야 한다
// 자바에서는 다중 상속을 허용하지 않는다
// 이미 슈퍼클래스를 가지는 클래스를 스레드로 처리하려면...? => 인터페이스

class NumberThread extends Object implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 25; i++) {
				System.out.println(i + " ");	
		}
	}
}

public class Ex08 {
	public static void main(String[] args) {
		NumberThread ob = new NumberThread(); // Runnable 객체를
		Thread th = new Thread(ob); // Thread 생성자 매개변수로 전달한다
		th.start(); // start를 호출하면 run()의 내용을 별도의 스레드에서 실행한다

		// Runnable은 함수형 인터페이스라서, 람다식 객체 생성이 가능하다
		Thread th2 = new Thread(() -> {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.println(ch + " ");
			}
		});
		th2.start();

		new Thread(() -> System.out.println("Hello ")).start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " ");
		}

		System.out.println();
	}

}
