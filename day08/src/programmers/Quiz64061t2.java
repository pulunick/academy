package programmers;
import java.util.ArrayList;


public class Quiz64061t2 {
	 public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        int crane = 0;
	        ArrayList<Integer> basket = new ArrayList<Integer>();

	        //moves 배열 수 만큼 크레인 작동
	        for (int i = 0; i < moves.length; i++) {
	            //배열상 0 에 해당하는 줄이 moves 에는 1로 설정되어 있으므로 -1 해줌. 
	            crane = moves[i] - 1;
	            //최대 가로 줄 수 만큼 크레인 작동
	            for (int j = 0; j < board.length; j++) {
	                //인형을 만난다면
	                if (board[j][crane] != 0) {
	                    //리스트에 인형 담기
	                    basket.add(board[j][crane]);
	                    //옮겨간 인형에 해당하는 칸을 빈칸으로 만듦
	                    board[j][crane] = 0;

	                    //크레인 작동 여부 확인용 코드
	                    //System.out.println("크레인 작동 "+board[j][crane]);

	                    //바구니에 인형이 2개 이상 있고, 새로 들어온 인형과 그 이전 인형이 같다면
	                    if (basket.size() > 1 && basket.get(basket.size() - 1) == basket.get(basket.size() - 2)) {
	                        //바구니의 제일 위에 있는 인형 제거 2번 해주기
	                        basket.remove(basket.size() - 1);
	                        basket.remove(basket.size() - 1);
	                        //인형 2개 제거된 것 체크.
	                        answer = answer+ 2;
	                    }
	                    //인형을 만났으면 다음 moves 가 행해져야 하므로 break 해줌
	                    break;
	                }
	            }
	        }
	        //바구니에 남은 인형 확인용 코드
	        //for(int k=0;k<basket.size();k++)
	        //  System.out.println("바구니 "+basket.get(k));

	        return answer;
	    }
	}

