package model;

public abstract class Student {
	//필드
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;
	protected int sum;
	protected double avg;
	
	//생성자
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;	// protected는 같은 패키지를 포함하며,
		this.kor = kor;		// 다른 패키지라고 하더라도 상속관계에 있다면 접근을 허용한다
		this.eng = eng;
		this.mat = mat;
	}
	
	// 추상메서드
	public abstract int getSum();
	public abstract double getAvg();
	public abstract void showInfo();			// 이름, 합계, 평균을 한줄에 출력 (목록에서 사용)
	public abstract void showDetail();			// 모든 속성값을 각 한줄마다 출력	  (검색에서 사용)
	
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

}
