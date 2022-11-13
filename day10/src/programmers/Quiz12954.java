package programmers;

public class Quiz12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        

        for(int i=0; i < n; i++)
            answer[i]= x*(i+1);
        return answer;
    }
}