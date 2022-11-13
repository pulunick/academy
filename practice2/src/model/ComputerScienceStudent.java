package model;

public class ComputerScienceStudent extends Student {
	
	private int java;
	private int network;
	private int linux;

	public ComputerScienceStudent(String name, int kor, int eng, int mat, int java, int network, int linux) {
		super(name, kor, eng, mat);
		this.java = java;
		this.network = network;
		this.linux = linux;
		// 생성자에서 합계 평균을 구하지 않고, getter를 요청받을 때 합계와 평균을 계산하여 반환
	}

	@Override
	public void showInfo() {
		System.out.printf("[컴퓨터공학과] 이름 : %s, 합계 : %d, 평균 : %.2f\n", name, getSum(), getAvg());
	}
	@Override
	public void showDetail() {
		System.out.println("--------------------");
		System.out.println("[컴퓨터공학과]" + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("자바 : " + java);
		System.out.println("네트워크 : " + network);
		System.out.println("리눅스 : " + linux);
		System.out.println("합계 : " + getSum());
		System.out.printf("평균 : %.2f\n", getAvg());
		System.out.println("--------------------");
		System.out.println();
	}
	
	@Override
	public int getSum() {
		sum = kor + eng + mat + java + network + linux;
		return sum;
	}
	@Override
	public double getAvg() {
		avg = sum / 6.0;
		return avg;
	}

	
	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getNetwork() {
		return network;
	}

	public void setNetwork(int network) {
		this.network = network;
	}

	public int getLinux() {
		return linux;
	}

	public void setLinux(int linux) {
		this.linux = linux;
	}
}