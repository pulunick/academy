package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		String input;
		Date start;
		long dayCount, st, et;
		
		System.out.print("날짜 입력 (yyyy-MM-dd) : ");
		input = sc.nextLine();
		System.out.print("몇일 : ");
		dayCount = Long.parseLong(sc.nextLine());
		
		start = sdf.parse(input); // 문자열을 날짜로 바꾸는 것 parse
		st = start.getTime();	// long으로 꺼내오는 것이 getTime
		et = st + 60 * 60 * 24 * dayCount * 1000;
		// 60초 * 60분 * 24시간 * dayCount일 * 1000(millisecond)
		
		for(long i = st; i < et; i += (60 * 60 * 24 * 1000)) {// 자바가 1/1000초 단위라 * 1000
			Date d = new Date(i);
			String s = sdf2.format(d);	// Date를 문자열로 바꾸는 것 format
			System.out.println(s);
		}
		System.out.println("끝");
		sc.close();
		
		
	}
}

/*
 *  1000 			초단위
 *  60*1000 		분단위
 *  60*60*1000 		시간단위
 *  24*60*60*1000	날짜단위
 *  
 */

//