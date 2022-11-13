package day02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		String path = "https://blogfiles.pstatic.net/MjAyMjA4MDlfMTg4/MDAxNjYwMDUxNjY3OTEy.N-Xx_p22igvPRrzzNcFkBXm3rI9yV-UJBVszpgYhUO8g.j9UdGXqCfTCc_Q1300X_Nsef_YZwMIELEw7zk4Dm1Tkg.JPEG.sot888/1660051385661.jpg";
		
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
		try {
			bis = new BufferedInputStream(new URL(path).openStream());
			fos = new FileOutputStream(new File("my.jpg"));
			
			byte[] buffer = new byte[1024];	// 버퍼, 1바이트씩 처리하면 함수호출이 너무 많다.(1024만큼의 바가지를 만든다라고 생각)
			int count, total = 0;			// 일정한 크기만큼 데이터를 모아서 한번에 처리한다
			
			while((count = bis.read(buffer, 0, 1024)) != -1) {
				total += count;
				System.out.println(total);
				fos.write(buffer, 0, count);
				
			}
		} finally {
			bis.close();
			fos.close();
		}
		System.out.println("끝");
		
		

	}

}


//https://terianp.tistory.com/19(참고 버퍼의 개념)

