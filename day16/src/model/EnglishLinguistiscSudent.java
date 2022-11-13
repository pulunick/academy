package model;

public class EnglishLinguistiscSudent extends Student {
	
	private int literatrure;	// 문학 (영문학)
	private int translation;	// 번역

	public EnglishLinguistiscSudent(String name, int kor, int eng, int mat, int literature, int translation) {
		super(name, kor, eng, mat);
		this.literatrure = literature;
		this.translation = translation;
		
		// 상속받아서 내가 가지고 있으니까, this로 접근 가능
		this.sum = kor + eng + mat + literature + translation;
		
		// 슈퍼클래스에서 만들어진 필드이니까 super로 접근 가능 // 둘다 같은 대상을 가르키고 있다
		super.avg = this.sum / 5.0;
	}
	
	@Override
	public int getSum() {
		return sum;
	}

	@Override
	public double getAvg() {
		return avg;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("[영어영문학과] 이름 : %s, 합계 : %d, 평균 : %.2f\n", name, sum, avg);
	}
	@Override
	public void showDetail() {
		System.out.println("--------------------");
		System.out.println("[영어영문학과]" + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("문학 : " + literatrure);
		System.out.println("번역 : " + translation);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("--------------------");
		System.out.println();
	}



	public int getLiteratrure() {
		return literatrure;
	}
	public void setLiteratrure(int literatrure) {
		this.literatrure = literatrure;
	}
	public int getTranslation() {
		return translation;
	}
	public void setTranslation(int translation) {
		this.translation = translation;
	}

}
