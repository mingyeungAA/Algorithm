package kakao_2019_winter_intership;

import java.util.Stack;

class Solution {
	public static int solution(int[][] board, int[] moves) {  //moves는 인형옮기는 크레인
		int answer = 0; //사라진 인형갯수
		
		
		/* 0 0 0 0 0
		 * 0 0 1 0 3
		 * 0 2 5 0 1
		 * 4 2 4 4 2
		 * 3 5 1 3 1        board
		 * --------------------------------
		 * 1 2 3 4 5        moves
		 */
		
		Stack<Integer> stack = new Stack<>();  //바구니
		stack.push(0);  //0을 넣어놔야지. moves와 바구니stack의 맨위값과 비교해야되는데, 아무것도 없으면 오류가 난다.

		for (int move : moves) {
			for (int j = 0; j < board.length; j++) { //해당 라인에서 인형을 뽑기 위해 board의 길이만큼 돌린다.(가로줄)
				
				if (board[j][move - 1] != 0) {  //인형이 있다면(인형이 없지않으면)
					
					if (stack.peek() == board[j][move - 1]) {  //바구니의 맨앞 인형과 같은인형이면,
						
						stack.pop();
						answer += 2;
					
					} else {  //다른인형이면,
						stack.push(board[j][move - 1]);  //인형을 바구니stack에 넣기
					
					}
					
					board[j][move - 1] = 0;  //인형이 없다.
					break;
				}
			}
		}
		return answer;
	}
}
