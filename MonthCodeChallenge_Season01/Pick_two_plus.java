package MonthCodeChallenge_Season01;

import java.util.ArrayList;
import java.util.Collections;

// �� �� �̾Ƽ� ���ϱ�
// https://programmers.co.kr/learn/courses/30/lessons/68644

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int sum=0;
        
        //�����ϱ� ���� answer�迭
        //�ϴ� ���־���� �迭
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        // 1. ���� �ٸ� �ε����� �μ��� ���ϴ� ����
        for(int i=0 ; i<numbers.length ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){  //�ٸ� �ε����� �Ƿ���, ������ j�� i���� 1 ū������ �����ϸ��!!
                sum = numbers[i] + numbers[j];
                if(list.indexOf(sum) == -1){ //list�� ���� ������ -1�� �����ϱ� ������, ���� ���ٸ�
                    list.add(sum);  //����Ʈ�� �� ���
                }
            }
        }
        
        // 2. �����ؼ� answer�迭�� �ֱ�
        Collections.sort(list);
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
                                          
  }
}