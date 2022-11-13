package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex09 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list = Arrays.asList(arr);
		List<Integer> list2 = new ArrayList<Integer>(list);
		
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		
		list.sort((a, b) -> a - b);
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
	}
}
