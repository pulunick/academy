package tv;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		int remote;
		Scanner sc = new Scanner(System.in);
		//  TV 클래스를 구성하여 실제 현실의 TV기능을 모두 구현해보세요
		
//		tv.powerBtn();
//		for(int i = 0; i< 10; i++) {
//			tv.channelUp();
//		}
//		tv.mute();
//		tv.mute();
//		
//		for(int i= 0; i < 10; i++) {
//			tv.volumelUp();
//		}
//		tv.powerBtn();
//		tv.show();
//		
		while(true) {
			System.out.println("====TV 등장!====");
			System.out.println("1. 전원 ");
			System.out.println("2. 채널 업");
			System.out.println("3. 채널 다운");
			System.out.println("4. 볼륨 업");
			System.out.println("5. 볼륨 다운");
			System.out.println("6. 음소거");
			System.out.print("리모컨 입력하세요 : ");
			remote = Integer.parseInt(sc.nextLine());
			
			
			switch(remote) {
			case 1 : tv.powerBtn();
			case 2 : tv.channelUp();
			case 3 : tv.channelDown();
			case 4 : tv.volumelUp();
			case 5 : tv.volumeDown();
			case 6 : tv.mute();
			}
			
		}
		
		
		
		
	}
	

}
