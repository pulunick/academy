package day01;

public class Ex04 {
	public static void main(String[] args) {
		// 논리 연산에 의한 연산 미수행
		int n1 = -1, n2 = 0, n3 = 1, n4 = 2;
		
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		boolean flag1 = n1++ + ++n2 < 0 && n3-- * ++n4 == 0;
		System.out.println(flag1);
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		// 첫번째와 두번째 조건이 모두 참이여야 하는데 첫번째 조건이 false가 나올 경우 전체가 false이므로 두번째 연산을 수행하지 않는다.
		// 두 조건중 첫번째 조건만으로 전체결과가 확정된다면
		// 두번째 조건은 연산을 수행하지 않는다
		// ++ : 항의 값에 1을 더한다. -- = 항의 값에 1을 뺀다.
		// && : 좌항과 우황이 모두 '참'일 때만 전체가 참이 된다.
		
	}
	

}
