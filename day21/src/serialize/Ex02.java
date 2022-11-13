package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex02 {
	
	@SuppressWarnings("unchecked")	// 확인되지 않은 클래스 다운 캐스팅에 대하여 경고하지 않는다
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("ex01.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<String> list = (ArrayList<String>) ois.readObject();
		System.out.println("불러온 리스트 : " + list);
		
		ois.close();
	}
}
