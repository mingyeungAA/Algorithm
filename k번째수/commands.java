package k��°��;

import java.util.*;
//�ڸ��� -> �����ϰ� -> �ش� �� ��ȯ�ϱ�
class Solution {
    public int[] solution(int[] array, int[][] commands) {
    	
        int[] answer = new int[commands.length];
        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0; i<commands.length; i++){
        	//�迭�� 0�������� �����ϴϱ� -1�� ���ش�.
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
            	//list�� �ֱ�
                list.add(array[j]);
            }
            //�������ش�.
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
            //clear�� ����� ���� i���� �־�����.
            list.clear();
        }
        return answer;
    }
}
