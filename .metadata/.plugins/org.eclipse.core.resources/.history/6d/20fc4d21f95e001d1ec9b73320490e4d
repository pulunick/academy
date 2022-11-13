package management;

import java.util.Scanner;

import model.ComputerScienceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Input {
	public static Student makeComputerScienceStudent(Scanner sc) {
		ComputerScienceStudent st;
		String name;
		int kor, eng, mat, java, network, linux;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어점수 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.print("자바점수 : ");
		java = Integer.parseInt(sc.nextLine());
		System.out.print("네트워크점수 : ");
		network = Integer.parseInt(sc.nextLine());
		System.out.print("리눅스점수 : ");
		linux = Integer.parseInt(sc.nextLine());
		st = new ComputerScienceStudent(name, kor, eng, mat, java, network, linux);
		return st;
	}

	public static Student makeEnglishLinguisticStudent(Scanner sc) {
		EnglishLinguisticStudent st;
		String name;
		int kor, eng, mat, lit, trans;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어점수 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.print("문학점수 : ");
		lit = Integer.parseInt(sc.nextLine());
		System.out.print("번역점수 : ");
		trans = Integer.parseInt(sc.nextLine());
		st = new EnglishLinguisticStudent(name, kor, eng, mat, lit, trans);
		return st;
	}
}
