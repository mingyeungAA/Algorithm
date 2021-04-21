package ATM_11399;

import java.util.Arrays;
import java.util.Scanner;

// 그리드 알고리즘
// https://www.acmicpc.net/problem/11399
// 대기시간의 총합


public class ATM_11399 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] time = new int[N];
		
		for(int i=0; i<time.length; i++) {
			time[i] = sc.nextInt();
		}
		
		// 정렬
		Arrays.sort(time);
		
		int prev = 0;  // 이전까지의 대기시간 누적합
		int sum = 0;  // 사람별 대기시간 총합
		
		for(int i=0; i<N; i++) {
			//이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
			sum += prev+time[i];
			
			//이전까지의 누적합에 현재 걸리는 시간을 더해준다.
			prev += time[i];
		}
		System.out.println(sum);
	}

}
