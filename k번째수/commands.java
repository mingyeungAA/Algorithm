package k번째수;

import java.util.*;
//자르고 -> 정렬하고 -> 해당 값 반환하기
class Solution {
    public int[] solution(int[] array, int[][] commands) {
    	
        int[] answer = new int[commands.length];
        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0; i<commands.length; i++){
        	//배열은 0번지부터 시작하니까 -1을 해준다.
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
            	//list에 넣기
                list.add(array[j]);
            }
            //정렬해준다.
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
            //clear를 해줘야 다음 i값이 넣어진다.
            list.clear();
        }
        return answer;
    }
}
