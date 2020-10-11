package ���ǰ��;

// ���α׷��ӽ� > ���ǰ��
// https://programmers.co.kr/learn/courses/30/lessons/42840

import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] answers) { //answers : ����
       
        //���� ���� ��� ������������
        int[] answer = {};
        
        int answer1=0, answer2=0, answer3 = 0;
        
        // �����ڵ��� ���� �迭�� ����ֱ�
        int[] p01 = {1,2,3,4,5};
        int[] p02 = {2,1,2,3,2,4,2,5};
        int[] p03 = {3,3,1,1,2,2,4,4,5,5};
        
        // answer�迭�� �����ڵ��� ������ ��!
        // �����̸� ++ ���ֱ�
        for(int i=0 ; i<answers.length; i++){
            if(p01[i % p01.length] == answers[i])
                answer1++;
            if(p02[i % p02.length] == answers[i])
                answer2++;
            if(p03[i % p03.length] == answers[i])
                answer3++;
        }
        
        //�� �߿��� ���� ���� ���� ��� ���ϱ�
        int max = Math.max(Math.max(answer1,answer2),answer3);
        
        List<Integer> list = new ArrayList<Integer>();
        if(max == answer1){ //max���� answer1�� ���� ������ 1�� �ִ´�.
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