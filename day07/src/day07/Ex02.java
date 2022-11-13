package day07;

import java.util.Scanner;

public class Ex02 {
	static void show(String[] arr) {
		System.out.printf("arr[%d] : { ", arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length - 1 ? " }\n" : ", ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = 3;
		String[] arr = new String[length]; // new 때문에 항상 새로운 값을 가리키게 된다
		String[] tmp;
		String input;

		show(arr);
		
		//엔터키를 입력하면 종료하게 한다	
		
		while (true) {
			System.out.print("문자 입력 하세요 : ");
			input = sc.nextLine();
			if (input.equals("")) {
				break;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == null) {
					arr[i] = input;
					break; // break를 걸어주지 않을시 모든 인덱스에 같은 값이 적용된다.
				}
			}


			if (arr[arr.length - 1] != null) {
				tmp = new String[arr.length + length]; // new 때문에 새로운 값을 가리키게 된다
				for (int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i];
				}
				arr = tmp;
			}
			show(arr);
		}
		
		System.out.println("끝!");
		sc.close();
	}
	

}

// 
