package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex04 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Todo> list = null;
		// ex03.dat의 객체를 list에 저장하여 아래 출력코드가 작동할 수 있도록 처리하세요
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
		list = (ArrayList<Todo>) ois.readObject();
		ois.close();
		
		for(int i = 0; i < list.size(); i++) {
			Todo t = list.get(i);
			System.out.println(t);
		}
		System.out.println("\n==================================\n");
		
		for(Todo t : list) {
			System.out.println(t);
		}
		System.out.println("\n==================================\n");
		
		// list는 빈칸이란 것이 없다. 안에 있는 요소에 대한 일괄작업을 하므로 한줄에 넣을 수 있게 만들어 주는 것이 좋다.
		list.forEach(t -> System.out.println(t));
		System.out.println("\n==================================\n");
		
		list.forEach(System.out::println);
		System.out.println("\n==================================\n");
		
		
	}
}

