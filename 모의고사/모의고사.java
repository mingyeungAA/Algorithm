package 모의고사;

// 프로그래머스 > 모의고사
// https://programmers.co.kr/learn/courses/30/lessons/42840

import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] answers) { //answers : 정답
       
        //제일 맞힌 사람 오름차순으로
        int[] answer = {};
        
        int answer1=0, answer2=0, answer3 = 0;
        
        // 수포자들의 정답 배열에 담아주기
        int[] p01 = {1,2,3,4,5};
        int[] p02 = {2,1,2,3,2,4,2,5};
        int[] p03 = {3,3,1,1,2,2,4,4,5,5};
        
        // answer배열과 수포자들의 정답을 비교!
        // 정답이면 ++ 해주기
        for(int i=0 ; i<answers.length; i++){
            if(p01[i % p01.length] == answers[i])
                answer1++;
            if(p02[i % p02.length] == answers[i])
                answer2++;
            if(p03[i % p03.length] == answers[i])
                answer3++;
        }
        
        //이 중에서 제일 많이 맞은 사람 구하기
        int max = Math.max(Math.max(answer1,answer2),answer3);
        
        List<Integer> list = new ArrayList<Integer>();
        if(max == answer1){ //max값과 answer1의 값이 같으면 1을 넣는다.
            list.add(1);  
        }
        if(max == answer2){
            list.add(2);
        }
        if(max == answer3){
            list.add(3);
        }
       
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        
        
        
        return answer;
    }
}