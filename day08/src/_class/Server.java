package _class;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(1234);	// 1234번 포트를 열어둔다
		System.out.println("서버 대기중...");			
		Socket so = ss.accept();					// 대상이 접속하면 소켓을 받는다
		
		System.out.println("접속 !!");
		Scanner sc = new Scanner(so.getInputStream());	// 소켓에서 들어오는 데이터를 읽는 스캐너
		while(sc.hasNextLine()) {		// 내용이 있으면
			System.out.println(sc.nextLine());	// 출력
		}
		System.out.println("종료");
		sc.close();
		so.close();
		ss.close();
	}
	
}