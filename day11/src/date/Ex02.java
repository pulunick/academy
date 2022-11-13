package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) throws ParseException {
		// java.util.Date
		// 다양한 데이터를 구성할 때 primitive나 String이 아닌 것 중에서 가장 많이 사용하는 자료형
		
		// 컴퓨터는 1970년 1월 1일을 0시 0분 0초를 기준으로 지난 시간을 초단위로 계산한다
		// 자바에서는 1초 대신 1/1000 초(millisecond)로 기록한다
		
		Date today = new Date();	// 생성자에 값을 전달하지 않으면, 객체 생성 시점의 날짜를 적용
		System.out.println(today);
		
		long ln1 = today.getTime();
		System.out.printf("ln1 : %,d\n", ln1);
		
		// 날짜를 문자열 형식으로 간편하게 바꿔주는 자료형 : SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s1 = sdf.format(today);	// today를 위 형식에 맞춰 문자열로 변환
		System.out.println(s1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String s2 = sdf2.format(today);
		System.out.println("지금은 " + s2 + "입니다");
		
		Date d2 = sdf.parse("2022-12-25");
		System.out.println(d2);

	}
}
// Date 클래스에 대해 잘 알아두자.



