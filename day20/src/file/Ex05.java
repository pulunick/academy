package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("a.txt");
		FileWriter fw = new FileWriter(f, true);	// append : true / false
								// autoFlush : 자동으로 flush
								// 최종적으로 FileWriter를 통해 문자열을 기록해주면된다
		
		fw.append("Hello");
		fw.append(",");
		fw.append("world\n");
		
		fw.close();
		
		System.out.println("끝");
	}

}
