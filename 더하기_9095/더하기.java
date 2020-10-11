package 더하기_9095;

import java.util.Scanner;

// 1,2,3 더하기
// 완전탐색
// https://www.acmicpc.net/problem/9095

public class 더하기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int[]dp = new int[11];
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int j=4; j<=10; j++) {
			dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
		}
		
		// 몇번 해볼건지 입력받기
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			// 구할 정수 입력받기
			int su = sc.nextInt();
			System.out.println(dp[su]);
			
		}

	}

}
