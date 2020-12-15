package 가장큰수;

import java.util.*;
class Solution02 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        //int형 배열은 단순 크기 비교로 정렬하기 어렵다.
        //정렬이 용이한 String형태로 변환
        for(int i=0; i<numbers.length; i++){
            arr[i] = (String.valueOf(numbers[i]));
        }
        
        //정렬
        //Comparator 사용
        //두 String을 합해서 더 큰 쪽이 우선순위가 있도록
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        //가장 앞자리가 큰 숫자가 arr[0]에 담긴다.
        if(arr[0].equals("0")){
            return "0";
        }
        //순차적으로 저장하여 return한다.
        for(int i=0; i<arr.length ;i++){
            answer += arr[i];
        }
        return answer;
    }
}