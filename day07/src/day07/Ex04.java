package day07;

import java.util.List;
import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		
		StringList list = new StringList();
		
		list.add("Hello");
		list.add("world");
		list.add("java");
		list.add("spring");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Hello");
		list2.add("world");
		list2.add("java");
		list2.add("spring");
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list.size());
		System.out.println(list2.size());
		
		
	}
}