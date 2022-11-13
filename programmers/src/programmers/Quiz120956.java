package programmers;

public class Quiz120956 {
	public static void main(String[] args) {
		
		String[] babbling = { "aya", "yeye", "u", "maa", "wyeoo" };
		int answer = 0;
		for (String str : babbling) {
//			System.out.printf("[%s]", str);
			if(str == "ayaaya" || str == "yeye" || str == "woowoo" || str =="mama") {
				continue;
			}
//			System.out.printf("[%s]", str);
			
				
			
			if(str.length() == 0) {
				answer++;
			
			}
			System.out.print(answer);
		}
		
	}

}
