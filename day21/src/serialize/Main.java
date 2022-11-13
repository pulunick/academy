package serialize;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
		Handler handler = new Handler();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		int select, row;
		String title;
		Date date;
		Todo st;

		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 제목순 정렬");
			System.out.println("5. 날짜순 정렬");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
				handler.showList();
				break;
			case 2:
				System.out.print("제목 : ");
				title = sc.nextLine();
				System.out.print("날짜 : ");
				date = sdf.parse(sc.nextLine());
				st = new Todo(title, date);
				handler.insert(st);
				break;
			case 3:
				System.out.print("삭제할 제목 입력 : ");
				title = sc.nextLine();
				row = handler.delete(title);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
			case 4:
				handler.sortByName();
				break;
			case 5:
				handler.sortBysdf();
				break;
			case 0:
				handler.save();
				sc.close();
			}

		} while (select != 0);

		handler.save(); // 메인이 종료되기 직전 저장한다
	}

}
