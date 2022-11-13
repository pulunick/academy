package day05;

public class Ex03 {
	public static void main(String[] args) {
		// 문자열 관련 함수
		
		String s1 = "root:x:0:0:root:/root:/bin/bash";
		String[] arr = s1.split(":");	//구분자 split = 분리
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		String s2 = "https://search.naver.com/search.naver?query=아이유&where=image";
		String[] a1 = s2.split("\\?");	// ?는 별도의 기능이 있어서 제거함
		String[] a2 = a1[1].split("&");
		for(int i = 0; i < a2.length; i++) {
			String[] a3 = a2[i].split("=");
			System.out.printf("%s : %s\n", a3[0], a3[1]);
		}
		System.out.println();
		
		// substring : 문자열 빼기 (-)
		// a.substirng(int beginIndex, int endIndex)
		
		String s3 = s2.substring(8, 24);
		System.out.println(s3);
		
		int beginIndex = s2.indexOf("search");
		int endIndex = s2.lastIndexOf("search") - 1;
		
		System.out.printf("%d ~ %d\n", beginIndex, endIndex);
		
		String s4 = s2.substring(beginIndex, endIndex);
		System.out.println(s4);
		
		// 문자열의 일치 비교
		String t1 = "apple";
		String t2 = new String("apple");	//Scanner로 입력받는 문자열도 똑같다
		String t3 =	"apple";	
		
		System.out.printf("%s,%s,%s\n", t1, t2, t3);
		
		//바라보는 대상이 일치하는가
		System.out.println("t1 == t2 : " +(t1 == t2));
		System.out.println("t1 == t3 : " +(t1 == t3));
		
		// 각 대상의 내용이 똑같은가
		System.out.println("t1.equals(t2) : " + t1.equals(t2));
		System.out.println("t1.equals(t3) : " + t1.equals(t3));
	}
}

// beginIndex, endIndex : 따로공부.
// "apple"; : 리터럴 상수
//	equals()는 메소드,  ==는 비교를 위한 연산자
// 	equals 메소드는 대상의 내용 자체를 비교
//	== 연산자는 비교하고자 하는 대상의 주소값을 비교
// 	문자열을 비교할때는 무조건 equals 사용
