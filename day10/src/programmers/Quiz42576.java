package programmers;

import java.util.Arrays;

public class Quiz42576 {
    static String solution(String[] participant, String[] completion) {
        // 문자열의 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);
        
//      for(String p : participant) {
//    	System.out.print(p + " ");
//    }System.out.println();
//    
//    for(String c : completion) {
//    	System.out.print(c + " ");
//    }System.out.println();
//    
        
        int i;
        for(i = 0; i < completion.length; i++) {
        	if(participant[i].equals(completion[i]));
        	else {
        		return participant[i];
        	}
        }
        

        return participant[participant.length-1];
    }
	
    public static void main(String[] args) {
    	String[] p1 = {"leo", "kiki", "eden"};
    	String[] c1 = {"eden", "kiki"};
    			
    	String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
    	String[] c2 = {"josipa", "filipa", "marina", "nikola"};
    			
    	String[] p3 = {"mislav", "stanko", "mislav", "ana"};
    	String[] c3 = {"stanko", "ana", "mislav"};
    	
    	System.out.println(solution(p1, c1).equals("leo"));
    	System.out.println(solution(p2, c2).equals("vinko"));
    	System.out.println(solution(p3, c3).equals("mislav"));
	}
}

// return을 하면 함수를 나가게 된다.