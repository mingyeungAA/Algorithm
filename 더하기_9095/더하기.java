package ���ϱ�_9095;

import java.util.Scanner;

// 1,2,3 ���ϱ�
// ����Ž��
// https://www.acmicpc.net/problem/9095

public class ���ϱ� {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int[]dp = new int[11];
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int j=4; j<=10; j++) {
			dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
		}
		
		// ��� �غ����� �Է¹ޱ�
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			// ���� ���� �Է¹ޱ�
			int su = sc.nextInt();
			System.out.println(dp[su]);
			
		}

	}

}
