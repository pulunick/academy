package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		// 텍스트 파일에 문자열 기록하기
		
		File f = new File("C:\\20221110", "c.txt");
		FileOutputStream fos = new FileOutputStream(f);	// 빨간밑줄 뜨면 throw 후 throws IOException 으로 바꿔준다
		
		String test = "Hello, world !!\n";
		test += "안녕하세요\n";
		
		fos.write(test.getBytes());	// 파일에 데이터를 기록할 때는 바이트 단위로 쪼개서 전달해야 한다
		fos.flush();				// 출력 버퍼에 남아있는 데이터를 파일로 밀어넣는다	
				// flush : "버퍼에 있는 데이터를 모두 처리해라"는 함수
				
					/* Write()함수를 cpu가 처리했다고 해도 모든 데이터가 물리적으로 디스크에 전부
						저장되지 않을 수도 있다는것이다.
						일부는 버퍼라는 임시 저장소에 쓰기를 대기할 수도 있다.*/

		fos.close();
		
		System.out.println("끝");
		
		
	}

}
