package ex02;

public class Student {
	
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	// 생성자는 name, kor, eng, mat만 받는다
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = sum / 3.0;
	}
	// 객체만 출력해도 알아서 문자열로 바꿔서 출력된다(toString()) 자바의 모든 객체는 toString을 오버라이딩 할 수 있다.
	// 앞에 무조건 public을 붙여야한다.
	public String toString() {		// 오버라이딩 하는 중임.
		String form = "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n";
		form += "이름 : %s\n";
		form += "국어점수 : %d점\n";
		form += "영어점수 : %d점\n";
		form += "수학점수 : %d점\n";
		form += "합계 : %d점\n";
		form += "평균 : %.1f점\n";
		form += "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ";
		String str = String.format(form, name, kor, eng, mat, sum, avg);
		return str;
	}

}
