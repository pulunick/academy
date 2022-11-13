package _class;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket so = new Socket("192.168.112.7", 1234);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
		bw.append("여러줄을 입력하는것이\n 가능하네요?");
		bw.flush();
		bw.close();
		
		so.close();
		
	}
}
