package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) throws IOException{
	// if 문제
	Scanner sc = new Scanner(System.in); 
	
	// 1) 세 정수를 입력받아서, 최소값을 찾아서 출력하세요
	int a, b, c;
	int min;
	int d;
	int e;
	
	
	System.out.print("세 가지 정수를 입력하세요 : ");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	
	if(a > b) {
		if(b > c)
			min = c;
		else
			min = b;
	}
	else {
		if(a > c)
			min = c;
		else
			min = a;
	}
	System.out.println("최소값 : "+ min);
	
	// 2) 정수를 입력받아서, 정수의 절대값을 출력하는 코드를 작성하세요
	
	
	
	System.out.print("정수를 입력하세요 : ");
	d = sc.nextInt();
	
	int absD = (d >= 0) ? d : -d;
	
	System.out.println("정수의 절대값 : " + absD );
	
	
	
	// 3) 정수를 입력받아서, 입력받은 수가 홀수인지 짝수인지 판별하여 출력하세요
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String result;

	System.out.print("정수를 입력하세요 : ");
	e = sc.nextInt();
	
	result = e % 2 == 0? "짝수" : "홀수";
	
	System.out.println(result);
	
	sc.close();
	

		
	}

}
