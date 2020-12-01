package phone_book;

import java.util.*;
class Solution02 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String,String> map = new HashMap<String, String>();
        for(String tel : phone_book){
            map.put(tel,"prefix");
        }
        
        for(String idx : phone_book){
            for(int i=0; i<idx.length() ; i++){
                 if(map.containsKey(idx.substring(0,i))){
                     return false;
                 }
            }
        }
        return answer;
    }
}