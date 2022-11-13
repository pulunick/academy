package day13;

class Test1 {
	private int n1 = 10;
	int n2 = 20;		// package는 기본값이므로, 접근제한자를 작성하지 않는다
	protected int n3 = 30;
	public int n4 = 40;
	
	public void showN1() {
		System.out.println(this.n1);	// private이라도 내부에서는 접근 가능
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Test1 ob = new Test1();
//		System.out.println(ob.n1);	// The field Test1.n1 is not visible
		ob.showN1(); 	// 필드에 직접적으로 접근할 수는 없지만, 매서드를 통하여 출력을 할 수는 있다
						// 출력은 가능하지만, 값을 변경할 수는 없다
						// 클래스에서 메서드를 통하여 허용한 작업만 수행할 수 있다.
		System.out.println(ob.n2);
		System.out.println(ob.n3);
		System.out.println(ob.n4);
		
//		ob.n1 += 5;		// The field Test1.n1 is not visible
		ob.n2 += 5;		// 서로 다른 클래스이지만, 같은 패키지 내에 속해있다.
		ob.n3 += 5;		// 상속은 아니지만 같은 패키지
		ob.n4 += 5;		// 동일 클래스 여부에 상관없이 누구에게나 접근을 허용한다
		
		/*
		 * 		클래스의 구성요소
		 * 
		 * 		1) 필드 : 객체의 속성을 저장한다
		 * 		2) 메서드 : 객체의 기능을 정의한다
		 * 		3) 생성자 : 객체 생성 시 초기값 할당 및 초기작동을 지정한다
		 * 		4) 접근 제한자 : 객체 외부에서 내부로 접근하는 행위를 허용하거나 거부한다
		 * 
		 * 		private		: 외부에서의 모든 접근을 허용하지 않는다 (내부에서는 자유롭게 접근 가능)
		 *		package		: 같은 패키지 폴더 내에서의 접근을 허용한다 (지정하지 않았을 경우 기본값)
		 *		protected   : 같은 패키지 + 상속 관계에서의 접근을 허용한다
		 *		public		: 모든 접근을 허용한다 
		 *
		 * 
		 * 
		 */
	}

}
