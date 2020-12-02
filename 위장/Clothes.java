package ����;

import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
    	
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<clothes.length; i++){
        	//map.put(����,��);
        	//getOrDefault(key, defaultValue) : key�� ������ �� key�� ���� ��ȯ, key�� ������ defaultValue�� ��ȯ�Ѵ�.
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }
        //�������� ���� ���ϸ� �ȴ�.
        for(String key : map.keySet()){
            answer *= (map.get(key)+1);
        }
        //�ƹ��͵� ������ ���� ����
        return answer-1;
    }
}