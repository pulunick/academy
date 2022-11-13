package 김진형2A;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		int row;
		String result, finish;
		String title;
		Date dodate;
		String complet;
		int calender;
		Todo ob;

		do {
			System.out.println("\tSimple Todo List (작성자 : 김진형)");
			System.out.println();
			System.out.println("1. 목록 | 2. 추가 | 3. 완료처리 | 4.삭제 | 0. 종료");
			System.out.print("메뉴 선택 >>> ");
			calender = Integer.parseInt(sc.nextLine());

			switch (calender) {
			case 1: // 목록
				result = hd.calenderAll();
				System.out.println(result);
				break;
			case 2: // 추가
				System.out.print("할 일을 입력하세요 : ");
				title = sc.nextLine();
				System.out.print("날짜를 입력하세요(yyyy.MM.dd) : ");
				dodate = sdf.parse(sc.nextLine());
				complet = sc.nextLine();
				ob = new Todo(title, dodate, complet);
				row = hd.insert(ob);
				if (row == 1)
					System.out.println("할일 추가 성공!!");
				if (row == 0)
					System.out.println("할일 추가 실패!!");
				break;
			case 3: // 완료처리
				System.out.print("완료처리할 할 일을 입력하세요 : ");
				finish = sc.nextLine();
				result = hd.update(finish);
				break;
			case 4: // 삭제
				System.out.print("삭제할 할 일을 입력하세요 : ");
				finish = sc.nextLine();
				row = hd.delete(finish);
				if (row == 1)
					System.out.println("삭제 성공!!");
				if (row == 0)
					System.out.println("삭제 실패!!");
				break;
			}

		} while (calender != 0);
		System.out.println("---TodoList 종료---");
		sc.close();

	}

}
