package collection;

import java.util.HashMap;
import java.util.Scanner;

class MyChromeDriver {
	
	private final String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
	private final Runtime rt = Runtime.getRuntime();
	
	public void open(String url) {
		run(url);
	}
	public void open(String url, HashMap<String, String> param) {
		url += "?";
		for(String key : param.keySet()) {
			String value = param.get(key);
			url += key + "=" + value + "&";
		}
		run(url);
	}
	private void run(String url) {
		try {
			rt.exec(chromePath + " " + url);
		} catch (Exception e) {}
	}
}

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String query, where = "";
		
		System.out.print("검색어를 입력 : ");
		query = sc.nextLine();
		
		System.out.print("어느 탭에서 검색합니까 (1. 통합 | 2. 이미지 | 3. 뉴스 | 4.동영상) : ");
		num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1:		where = "nexearch"; break; 
		case 2:		where = "image"; 	break; 
		case 3:		where = "news"; 	break;
		case 4:		where = "video"; 	break; 
		}
		
		MyChromeDriver ob = new MyChromeDriver();
//		ob.open("www.ncs.go.kr");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("query", query);
		param.put("where", where);
		
		ob.open("search.naver.com/search.naver", param);
		sc.close();

	}
}