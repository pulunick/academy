package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		Doctor d1 = new Doctor("지녕이", "의사");
		Doctor d2 = new Doctor("왕왕이", "의사");
		Singer s1 = new Singer("전소연", "가수");
		Singer s2 = new Singer("아이유", "가수");
		Teacher t1 = new Teacher("김진형", "컴퓨터 강사");
		Teacher t2 = new Teacher("원종래", "컴퓨터 대장 강사");
		// Human의 서브클래스는 여러개를 만들어도 됩니다
//		Human h1 = d1;
//		Human h2 = d2;
//		Human h3 = s1;
//		Human h4 = s2;
//		Human h5 = t1;
//		Human h6 = t2;
		
		// 이때, 최소 2명의 의사를 포함시킵니다
//		air.entrance(d1);
//		air.entrance(d2);
//		air.entrance(s1);
//		air.entrance(s2);
//		air.entrance(t2);
//		air.entrance(t1);
		
		Human[] waiting = {d1, d2, s1, s2 , t2, t1};
		
		for(int i = 0; i < waiting.length; i++) {
			Human ob = waiting[i];
			air.entrance(ob);
		}
		
//		System.out.println(air.entrance(d1));
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
			
		int pa = air.emergency();
		
		air.healing(pa);

	}

}
// 함수 문제 많이 풀어보기

// public int f(int a) ==> int a = 변수, 그릇
// int answer = f(a); ==> a = 값
