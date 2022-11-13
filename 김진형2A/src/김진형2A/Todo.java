package 김진형2A;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Todo {
	String title;
	Date dodate;
	String complet;

	Todo(String title, Date dodate, String complet) {
		this.title = title;
		this.dodate = dodate;
		this.complet = complet;
	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String form = "[%s] %s \t %s";
		String str = String.format(form, sdf.format(dodate), title, complet);
		return str;
	}

}

