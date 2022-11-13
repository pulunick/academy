package day07;

import java.util.Scanner;

public class Ex03 {
	static void show(String[] arr) {
		System.out.printf("arr[%d] : { ", arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length - 1 ? " }\n" : ", ");
		}
	}
	public static void main(String[] args) {
		int length = 3;
		Scanner sc = new Scanner(System.in);
		String input;
		String[] arr = new String[length];
		String[] tmp;
		
		while(true) {
			System.out.print("문자열 입력 : ");
			input = sc.nextLine();	// next() 는 엔터키만 입력한 경우 입력으로 처리하지 않는다
			if("".equals(input)) {	// 입력했는데도 내용이 없으면 ""
				break;
			}
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == null) {	// 입력한 적이 없으면 null
					arr[i] = input;
					break;
				}
			}
			if(arr[arr.length - 1] != null) {
				tmp = new String[arr.length + length];
				for(int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i];
				}
				arr = tmp;
			}
			show(arr);
		}
		sc.close();
		System.out.println("끝");
	}
}

