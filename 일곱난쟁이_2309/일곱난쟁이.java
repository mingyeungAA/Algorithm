package 일곱난쟁이_2309;

import java.util.Arrays;
import java.util.Scanner;

// 일곱난쟁이
// 완전탐색
// https://www.acmicpc.net/problem/2309

public class 일곱난쟁이 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] arr = new int[9];
		
		// 아홉명의 난쟁이 키를 입력받는다.
		// 아홉명 키를 합해준다.
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		//서로 다른 인덱스가 되려면, 무조건 j는 i보다 1 큰수에서 시작하면됨!!(안겹치도록)
		for(int i=0; i<arr.length ;i++) {
			for(int j=1; j<arr.length; j++) {
				//합계에서 두수를 뺀 값이 100이면 조건에 맞는다.
				//조건에 맞으면, 두수는 0으로 만들어준다.
				if(sum-arr[i]-arr[j] == 100) {
					arr[i]=0;
					arr[j]=0;
				}
			}
		}
		
		//sort는 오름차순 : 작은 수부터 나열됨
		Arrays.sort(arr);
	
		
		//출력
		for(int i=0 ;i<arr.length; i++) {
			if(arr[i] != 0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
