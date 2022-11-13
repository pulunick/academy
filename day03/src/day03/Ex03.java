package day03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a;
		String bar1 = "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n";
		String bar2 = "│    │    │    │    │    │    │\n";
		
		//0~30 사이의 정수를 입력받아서, 입력받은 위치에 ↑가 위치하도록 코드를 작성하세요.
		
		System.out.print("숫자 입력 1~30 : ");
		a = sc.nextInt();
		
		System.out.println(bar1 + bar2);
		
		for(int i = 1; i<=a; i++) {
			System.out.print(" ");
		}
		System.out.print("↑");
		
		sc.close();
		
		
	}

}

//선생님 답안
// for(int i = 0; i<a; i++) {