package movie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {
	String title;		
	String director;
	String[] actors;
	String genre;
	int runningTime;
	Date openningDate;
	double grade;
	
	// 클래스의 모든 멤버필드를 매개변수로 전달받아서, 객체를 생성하는 생성자 자동으로 만들기
	// source - generate constructor using fields

	Movie(String title, String director, String[] actors, String genre, 
			int runningTime, Date openningDate,
			double grade) {

		this.title = title;
		this.director = director;
		this.actors = actors;
		this.genre = genre;
		this.runningTime = runningTime;
		this.openningDate = openningDate;
		this.grade = grade;
	}

	String getInfo() { // 목록에서 사용할 간략한 정보만 문자열로 반환
		String form = "[%s] %s, %s (%.2f)";
		String result = String.format(form, title, actors[0], actors[1], grade);
		return result;
	}

	String getDetail() {	/// 검색에서 사용할 상세한 정보를 모두 문자열로 반환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String form = "-------------------------\n";
		form += "제목 : %s\n";
		form += "감독 : %s\n";
		form += "출연 : %s\n";	// 배열을 문자열로 변환하는 추가 함수를 황용
		form += "장르 : %s\n";
		form += "상영시간 : %d분\n";
		form += "개봉일자 : %s\n";	// yyyy년 MM월 dd일 형식으로 반환해야 함
		form += "평점 : %.2f\n";
		form += "-------------------------\n";
		String result = String.format(form, title, director, 
				arrToString(actors), genre, runningTime,
				sdf.format(openningDate), grade);
		return result;
	}
	
	String arrToString(String[] arr) {	// 배우 목록이 배열이므로, 문자열로 변환해야 출력할 수 있다.
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i != arr.length - 1) {
				result += ", ";
			}
		}
		return result;
	}

}







