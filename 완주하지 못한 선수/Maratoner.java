package Hash_Maratoner;

//완주하지 못한 선수
//https://programmers.co.kr/learn/courses/30/lessons/42576

import java.util.*;

class Solution_03 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer> hash = new HashMap<>();
        
        for(String player : participant){
        	// getOrDefault(Object key, Object defaultValue) : key의 값(return value)을 가져오는데, 만약 없으면 defaultValue로 가져온다.
            // 넣어준 키값이 없으므로, 0이 리턴되고 +1 되서 , 1이 리턴된다.
        	// hash.put(player, 1)
        	hash.put(player, hash.getOrDefault(player,0)+1);
        }
        
        for(String player : completion){
        	// get(Object key) : key의 값을 가져온다.(value를 리턴한다.)
        	// hasp.put(player, 0)
            hash.put(player, hash.get(player)-1);
        }
        
        for(String key : hash.keySet()){
            if(hash.get(key) != 0){ //key가 1이면 (participant에 남아있는 value)
                answer = key;
            }
        }
        return answer;
    }
}
