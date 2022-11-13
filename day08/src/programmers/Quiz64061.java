package programmers;

import java.util.Stack;

public class Quiz64061 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;		// 인형 제거 횟수
        
        Stack<Integer> stack = new Stack<>(); // 스택설정
   
		for (int i = 0; i < moves.length; i++) { // 행 이동은 moves로 실행
			for (int j = 0; j < board.length; j++) {// board 열 이동
				// 비어있는 0을 지나가기 위해 if 설정
				if (board[j][moves[i] - 1] != 0) { // moves 인덱스가 0부터 시작해야하기에 moves -1
					// stack.empty -> 비어있지 않을 경우 그리고
					// stack.peek -> 스택에 가장 위의 값을 반환
					// 이동한 곳의 값과 같을 경우.
					if (!stack.empty() && stack.peek() == board[j][moves[i] - 1]) {
						answer += 2;
						
						stack.pop(); // 스택의 맨 위의 값을 꺼내온다 
						
						board[j][moves[i] - 1] = 0; // 0으로 만들어준다.
						
						break;
						
					} else {
						stack.push(board[j][moves[i] - 1]);
						break;
					}
				}
				
			}

		}
		return answer*2;
	}
        
    public static void main(String[] args) {
		int[][] board = {
				{0, 0, 0, 0, 0}, 
				{0, 0, 1, 0, 3}, 
				{0, 2, 5, 0, 1}, 
				{4, 2, 4, 4, 2}, 
				{3, 5, 1, 3, 1}, 

		};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
		int answer = solution(board, moves);
		System.out.println(answer == 4);
	}
    

}
// -1을 해줘야 한다.
// for ( A : B) = B에서 차례대로 객체를 꺼내서 A에 넣겠다.