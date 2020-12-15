package ����ū��;

import java.util.*;
class Solution02 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        
        //int�� �迭�� �ܼ� ũ�� �񱳷� �����ϱ� ��ƴ�.
        //������ ������ String���·� ��ȯ
        for(int i=0; i<numbers.length; i++){
            arr[i] = (String.valueOf(numbers[i]));
        }
        
        //����
        //Comparator ���
        //�� String�� ���ؼ� �� ū ���� �켱������ �ֵ���
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        //���� ���ڸ��� ū ���ڰ� arr[0]�� ����.
        if(arr[0].equals("0")){
            return "0";
        }
        //���������� �����Ͽ� return�Ѵ�.
        for(int i=0; i<arr.length ;i++){
            answer += arr[i];
        }
        return answer;
    }
}