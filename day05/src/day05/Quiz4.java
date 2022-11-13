package day05;

public class Quiz4 {
    static String profile(long data ) {
        String result = "";
        long age_k = 0;
        long gender_k = data % 10000000;
 
        for(long i = data; i > 100; i /= 10) {
        	age_k = i / 10;            
        }
        for(long i = gender_k; i > 10; i /= 10) {
        	gender_k = i / 10;
        }    

        long age = (gender_k > 2 && age_k < 23) ? 2022 - (2000 + age_k) + 1 : 2022 - (1900 + age_k) + 1;                
        String gender = "";
        if(gender_k == 1 || gender_k == 3) {
            gender = "남성";            
        }
        else if (gender_k == 2 || gender_k == 4) {
            gender = "여성";
        }
        else {
            gender = "성별 확인 불가 상태";
        }        
        result = String.format("%d세, %s입니다", age, gender);        
        
        return result;
    }
    static String profile(String data) {
        String result = "";
        String age_s1 = data.substring(0, 2);
        String gender_s2 = data.substring(7, 8);
        int age_i1 = Integer.parseInt(age_s1);
        int gender_i2 = Integer.parseInt(gender_s2);
 
        int age = (gender_i2 > 2 && age_i1 < 23) ? 2022 - (2000 + age_i1) + 1 : 2022 - (1900 + age_i1) + 1;                
        String gender = "";
        if(gender_i2 == 1 || gender_i2 == 3) {
            gender = "남성";            
        }
        else if (gender_i2 == 2 || gender_i2 == 4) {
            gender = "여성";
        }
        else {
            gender = "성별 확인 불가 상태";
        }        
        result = String.format("%d세, %s입니다", age, gender);        
        
        return result;
    }
	public static void main(String[] args) {
		// 주민등록번호를 전달받아서 나이와 성별을 출력하는 함수를 작성하세요
		// 인자는 정수 혹은 문자열로 전달할 수 있습니다
		// 결과는 String.format을 이용하여 나이, 성별을 문자열형식으로 반환합니다
		
		String s1 = profile(9305162345678L);	// long
		String s2 = profile("930516-2345678");	// String
		
		System.out.println(s1);	// 30세, 여성입니다
		System.out.println(s2);	// 30세, 여성입니다
	}
}