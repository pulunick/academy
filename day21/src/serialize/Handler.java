package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Handler {
	
	private ArrayList<Todo> list;
	
	public Handler() throws IOException, ClassNotFoundException {
		this.load();
	}
	
	@SuppressWarnings("unchecked")
	private void load() throws IOException, ClassNotFoundException { // 생성자 내부에서 호출함. 파일에서 객체를
																							// 불러와서 리스트에 저장
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
		list = (ArrayList<Todo>) ois.readObject();
		ois.close();
	}

	public void save() throws IOException { // main에서 호출함. 리스트 객체를 파일로 저장
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ex03.dat"));
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}

	public void showList() {
		for (Todo st : list) {
			System.out.println(st);
		}
		System.out.println();
	}

	public void insert(Todo todo) { // 객체를 전달받아서 추가하기
		list.add(todo);
		System.out.println("추가 성공");
	}

	public int delete(String title) { // 선택한 객체의 index를 확인하여 제거하기
		if (list.removeIf(st -> st.getTitle().equals(title))) {
			return 1;
		}
		return 0;
	}

	public void sortByName() { // 이름순 정렬
		list.sort((a, b) -> a.getTitle().compareTo(b.getTitle())); 
	}

	public void sortBysdf() { // 날짜순 정렬
		list.sort((a, b) -> a.getDate().compareTo(b.getDate())); 
	}

}
