package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ex04 {
	public static void main(String[] args) throws IOException {
		// 내용을 기록할 파일을 불러온다
		File f = new File("C:\\20221110", "d.txt");
		
		// 파일에 기록하기 위해서 파일 출력 스트림을 생성한다 (대상 파일을 지정하면서 append 여부에 true를 전달)
		FileOutputStream fos = new FileOutputStream(f, true);
		
		// 출력스트림을 통해 writer(문자열을 전문적으로 기록하는 클래스)를 생성하고, 글자 인코딩은 UTF-8로 지정
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		
		// 바이트 단위로 전달하지 않고, 문자열 통째로 전달하면 알아서 처리하는 BufferedWriter를 연결
		BufferedWriter bw = new BufferedWriter(osw);
		
		String now = new SimpleDateFormat("hh시 mm분 ss초").format(new Date());
		
		// append : 추가
		bw.append("안녕하세요\n");
		bw.append("오늘은 11월 10일 입니다\n");
		bw.append(now + "\n\n");
		
		bw.flush();
		bw.close();
		System.out.println("끝");
	}

}
