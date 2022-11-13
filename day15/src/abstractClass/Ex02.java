package abstractClass;

abstract class Button {
	
	// abstract 메서드는 상속받아서 써야하기 때문에 private으로 지정할 수 없다
	// protected 혹은 public으로 설정해야 한다
	// protected : 패키지가 달라도 상속관계에 있으면 접근 가능
	// public : 패키지나 상속여부에 상관없이 누구나 접근 가능
	protected abstract void onclick();
	
	public void click() {
		this.onclick();
	}	
}
class MessageButton extends Button {

	@Override
	protected void onclick() {
		System.out.println("Hello, world !!");
	}
	
}

class NotepadButton extends Button {

	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다
			String cmd = "notepad";				// 실행할 명령어 준비
			Process pro = rt.exec(cmd);			// 실행후 프로세스를 저장해두었다가
			Thread.sleep(2000);					// 2초 후
			pro.destroy();						// 프로세스를 종료한다
			
		} catch(Exception e) {}
	}
	
}

class CalcButton extends Button {
	
	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다
			String cmd = "calc";				// 실행할 명령어
			rt.exec(cmd);						// 명령어를 실행

		} catch(Exception e) {}
		
	}
}

public class Ex02 {
	public static void main(String[] args) {
//		Button btn1 = new Button();
		MessageButton btn2 = new MessageButton();
		btn2.click();
		
		NotepadButton btn3 = new NotepadButton();
		btn3.click();
		
		Button btn4 = new CalcButton();	//서브 클래스의 객체를 슈퍼 클래스로 참조한다
		btn4.click();
		// 추상 클래스가 직접 객체를 생성할 수는 없지만, 자료형으로써 참조변수를 사용하는 것은 가능하다
		
		Button btn5 = new Button() {
			@Override
			protected void onclick() {
				try {
					Runtime rt = Runtime.getRuntime();
					String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
					String url = " http://search.naver.com/search.naver?query=아이유";
					cmd += url;
					rt.exec(cmd);
					
				} catch(Exception e) {}	
			}
		};
		btn5.click();
		// 오버라이드는 상속받을때만 쓸 수 있다. 즉 위 버튼은 오버라이드가 되었으므로, 버튼 그자체가 아니다.
		// 버튼이란 클래스를 상속받은 서브클래스이지만 클래스 이름이 없다. --> 익명 내부 클래스
		// 버튼을 만드는데 필요한 것은 온클릭이란 함수를 오버라이딩만 하면된다. -> 별도의 클래스를 만들지 않고
		// 버튼이란 추상클래스를 이용해 즉석으로 서브 클래스를 생성하고 객체를 생성한다.
		// 익명 내부 클래스 : bin에 Ex02$1(형식으로) 서브클래스를 생성
		// 자주 쓸꺼면 서브클래스를 생성 자주 안쓰면 익명 클래스로 생성.
	}

}
