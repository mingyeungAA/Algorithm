package MonthCodeChallenge_Season01;

import java.util.ArrayList;
import java.util.Collections;

// 두 개 뽑아서 더하기
// https://programmers.co.kr/learn/courses/30/lessons/68644

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int sum=0;
        
        //정렬하기 전의 answer배열
        //일단 값넣어놓을 배열
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        // 1. 서로 다른 인덱스의 두수를 더하는 과정
        for(int i=0 ; i<numbers.length ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){  //다른 인덱스가 되려면, 무조건 j는 i보다 1 큰수에서 시작하면됨!!
                sum = numbers[i] + numbers[j];
                if(list.indexOf(sum) == -1){ //list에 값이 없으면 -1을 리턴하기 때문에, 값이 없다면
                    list.add(sum);  //리스트에 값 담기
                }
            }
        }
        
        // 2. 정렬해서 answer배열에 넣기
        Collections.sort(list);
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
                                          
  }
}