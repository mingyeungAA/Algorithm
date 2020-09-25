package kakao_2019_winter_intership;

import java.util.Stack;

class Solution {
	public static int solution(int[][] board, int[] moves) {  //moves�� �����ű�� ũ����
		int answer = 0; //����� ��������
		
		
		/* 0 0 0 0 0
		 * 0 0 1 0 3
		 * 0 2 5 0 1
		 * 4 2 4 4 2
		 * 3 5 1 3 1        board
		 * --------------------------------
		 * 1 2 3 4 5        moves
		 */
		
		Stack<Integer> stack = new Stack<>();  //�ٱ���
		stack.push(0);  //0�� �־������. moves�� �ٱ���stack�� �������� ���ؾߵǴµ�, �ƹ��͵� ������ ������ ����.

		for (int move : moves) {
			for (int j = 0; j < board.length; j++) { //�ش� ���ο��� ������ �̱� ���� board�� ���̸�ŭ ������.(������)
				
				if (board[j][move - 1] != 0) {  //������ �ִٸ�(������ ����������)
					
					if (stack.peek() == board[j][move - 1]) {  //�ٱ����� �Ǿ� ������ ���������̸�,
						
						stack.pop();
						answer += 2;
					
					} else {  //�ٸ������̸�,
						stack.push(board[j][move - 1]);  //������ �ٱ���stack�� �ֱ�
					
					}
					
					board[j][move - 1] = 0;  //������ ����.
					break;
				}
			}
		}
		return answer;
	}
}
