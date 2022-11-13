package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		// 텍스트 파일 내용 불러오기
		// Scanner는 표준 입출력에 대한 예외는 처리되어 있지만, 파일 입출력은 예외를 직접 처리해야 한다
		
		File f = new File("C:\\20221110","b.txt");
		Scanner sc = new Scanner(f);
		String content = "";
		
		while (sc.hasNextLine()) {		// Iterator.hasNext(), Enumeration.hasMoreElements()
			String data = sc.nextLine();// Iterator.next(), Enumeration.nextElement()
			content += data;
			content += "\n";		// 따로 엔터키값을 붙혀줘야한다.(nextLine때문에 줄바꿈이 안들어가져있기 때문)
		}
		sc.close();
		System.out.println(content);
		
		
	}

}
