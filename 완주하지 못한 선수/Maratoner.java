package Hash_Maratoner;

//�������� ���� ����
//https://programmers.co.kr/learn/courses/30/lessons/42576

import java.util.*;

class Solution_03 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer> hash = new HashMap<>();
        
        for(String player : participant){
        	// getOrDefault(Object key, Object defaultValue) : key�� ��(return value)�� �������µ�, ���� ������ defaultValue�� �����´�.
            // �־��� Ű���� �����Ƿ�, 0�� ���ϵǰ� +1 �Ǽ� , 1�� ���ϵȴ�.
        	// hash.put(player, 1)
        	hash.put(player, hash.getOrDefault(player,0)+1);
        }
        
        for(String player : completion){
        	// get(Object key) : key�� ���� �����´�.(value�� �����Ѵ�.)
        	// hasp.put(player, 0)
            hash.put(player, hash.get(player)-1);
        }
        
        for(String key : hash.keySet()){
            if(hash.get(key) != 0){ //key�� 1�̸� (participant�� �����ִ� value)
                answer = key;
            }
        }
        return answer;
    }
}
