package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream("ex03.dat");
		
		// 웹 상의 이미지 주소를 작성
//		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2F20160605_128%2Fbumnyun_1465131629486Pgg7k_JPEG%2F%25C0%25CC%25B9%25CC%25C1%25F6_4.jpg&type=sc960_832";
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2F20160511_226%2Fqkrwnstlr112_1462954272054adhe5_JPEG%2Fhanzo-concept.jpg&type=sc960_832";
		URL url = new URL(path);

		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String contentType = conn.getContentType();	// 연결된 자원의 컨텐트 유형을 문자열 형태로 확인할 수 있다
		Scanner sc = new Scanner(System.in);
		String fileName;
		
		System.out.println("컨텐트 유형은 " + contentType + "입니다");
		System.out.print("원하는 파일 이름을 입력하세요 : ");
		fileName = sc.nextLine();
		
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream(fileName);

		
		byte[] buffer = new byte[1024];
		int readBytes;
		int allCount = 0;
		
		while((readBytes = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, readBytes);
			allCount += readBytes;
			System.out.printf("=== %d byte ===\n", allCount);
		}
		
		fis.close();
		fos.close();
		sc.close();
	}
}
