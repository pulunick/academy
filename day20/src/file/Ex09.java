package file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		File f = new File("ex08.txt");
		Scanner sc = new Scanner(f);
		List<Menu> list = new ArrayList<Menu>();
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] arr = line.split(":");
			String name = arr[0];
			int price = Integer.parseInt(arr[1]);
			Menu ob = new Menu(name, price);
			list.add(ob);
		}
		list.forEach(menu -> menu.show());
		sc.close();
	}
}
