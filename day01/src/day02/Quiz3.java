package day02;

public class Quiz3 {

	public static void main(String[] args) {
		// 1) while을 이용하여 정수를 거꾸로 뒤집어서 다른 변수에 저장한 후 출력하세요
		int n1 = 1234;
		int n2 = 0;
		
		while (n1 != 0) {
			int digit = n1 % 10;
			n2 = n2 * 10 + digit;
			n1 /= 10;
		}
		System.out.println("n2 : " + n2); //4321
		
		// 2) for를 이용하여 1부터 1000사이의 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		int oddSum = 0, evenSum = 0;
		
		//for(int i = 0; i < 1000; i++) {
		//	totalSum = totalSum + (i+1);
		//}
		
		//System.out.println("1부터 1000까지의 숫자의 합은" + totalSum + "입니다.\n");
		
		for(int i = 1; i<=1000; i++) {
			boolean isOdd = i % 2 == 1;
			System.out.println(i + " : " + isOdd);
			if(isOdd) {
				oddSum += i;
			}
			else {
				evenSum += i;
			}
		}
		
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);

	}

}


// 1) n1의 가장 오른쪽 자리를 하나 가져와서 n2에 더한다
// 2) n1의 가장 오른쪽 자리는 사용했으니 제거한다
// 3) 다음 숫자를 더하면 자릿수가 겹치니까 자릿수 처리 - 1의 자리 숫자를 10의 자리로 옮기기 위해서 10을 곱한다

// 컴퓨터는 0.xxxxx를 0으로 간주한다.
// 나누기를 한 몫으