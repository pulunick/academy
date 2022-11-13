package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	static void prepareDummy() throws ParseException {

		Movie t1 = new Movie("블랙아담", "자움 콜렛 세라", 
				"드웨인 존슨,노아 센티네오,피어스 브로스넌,퀸테사 스윈들".split(","), "액션", 125,
				sdf.parse("2022-10-19"), 7.63);
		Movie t2 = new Movie("리멤버", "이일형", "이성민,남주혁".split(","), "드라마", 
				128, sdf.parse("2022-10-26"), 7.50);
		Movie t3 = new Movie("자백", "윤종석", "소지섭,김윤진".split(","), "스릴러", 
				100, sdf.parse("2022-10-26"), 7.14);

		Handler.arr[0] = t1;
		Handler.arr[1] = t2;
		Handler.arr[2] = t3;
	}

	public static void main(String[] args) throws ParseException {

		prepareDummy();
		// static이므로 객체 생성 없이 속성이나 기능에 접근할 수 있다
		System.out.println(Handler.getList());
		int row = 0, chart;
		String result;
		String keyword;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. 영화 목록");
			System.out.println("2. 영화 추가");
			System.out.println("3. 영화 삭제");
			System.out.println("4. 영화 단일검색");
			System.out.println("5. 영화 다중검색");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			chart = Integer.parseInt(sc.nextLine());

			switch (chart) {
			case 1: // 영화 목록
				result = Handler.getList();
				System.out.println(result);
				break;

			case 2: // 영화 추가
				Movie ob = input(sc);
				row = Handler.insert(ob);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;

			case 3: // 영화 삭제
				System.out.print("어떻게 삭제하시겠습니까? (1. 번호 | 2. 제목) : ");
				chart = Integer.parseInt(sc.nextLine());
				row = delete(sc, chart);
				System.out.println(row == 1 ? "삭제 성공 " : "삭제 실패");

			case 4: // 영화 검색
				System.out.println("검색어를 입력하세요 : ");
				keyword = sc.nextLine();
				System.out.println(Handler.search(keyword));
				break;

			case 5: // 영화 다중검색
				System.out.print("검색어를 입력하세요 : ");
				keyword = sc.nextLine();
				System.out.println(Handler.searchList(keyword));
				break;
			}

		} while (chart != 0);
		System.out.println("---영화차트 프로그램 종료---");
		sc.close();
	}

	static int delete(Scanner sc, int chart) {
		int idx, row = 0;
		String title;
		if (chart == 1) {
			System.out.print("영화 번호를 입력하세요 : ");
			idx = Integer.parseInt(sc.nextLine());
			row = Handler.delete(idx);
		} else if (chart == 2) {
			System.out.print("영화 제목을 입력하세요 : ");
			title = sc.nextLine();
			row = Handler.delete(title);
		} else {
			System.out.print("번호 선택이 잘못되었습니다. 다시 선택해주세요");
		}
		return row;
	}

	static Movie input(Scanner sc) throws ParseException {
		String title;
		String director;
		String[] actors;
		String genre;
		int runningTime;
		Date openningDate;
		double grade;

		System.out.print("제목 : ");
		title = sc.nextLine();
		System.out.print("감독 : ");
		director = sc.nextLine();
		System.out.print("배우 : ");
		actors = sc.nextLine().split(",");
		System.out.print("장르 : ");
		genre = sc.nextLine();
		System.out.print("상영시간 : ");
		runningTime = Integer.parseInt(sc.nextLine());
		System.out.print("상영날짜  : ");
		openningDate = sdf.parse(sc.nextLine());
		System.out.print("평점 :");
		grade = Double.parseDouble(sc.nextLine());

		Movie ob = new Movie(title, director, actors, genre, runningTime, openningDate, grade);
		return ob;
	}
}
