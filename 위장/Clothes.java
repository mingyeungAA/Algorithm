package 위장;

import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
    	
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<clothes.length; i++){
        	//map.put(종류,값);
        	//getOrDefault(key, defaultValue) : key가 있으면 그 key의 값을 반환, key가 없으면 defaultValue를 반환한다.
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }
        //가짓수를 전부 곱하면 된다.
        for(String key : map.keySet()){
            answer *= (map.get(key)+1);
        }
        //아무것도 안입은 상태 빼기
        return answer-1;
    }
}