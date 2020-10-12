package �����̸����_2630;

import java.util.Arrays;
import java.util.Scanner;

// ������ �����
// https://www.acmicpc.net/problem/2630

public class �����̸���� {
	
	static int[][] arr;
	static int w=0;
	static int b=0;
	static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�Ѻ��� ���� n (2,4,8,16,32,64,128 �� �ϳ��̴�.)
		n = sc.nextInt();
		
		arr = new int[n][n];
		
		//�Է¹ޱ�(0�� 1)
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		div(0,0,n);
		System.out.println(w);
		System.out.println(b);
		
	}
	
	 
	public static void div(int x, int y, int n) { //0,0,8
		int count=0;
		
		for(int i=x ; i<x+n; i++) {
			for(int j=y; j<y+n; j++) {
				// 1�� ����á���� �˻�
				// 1�̸� ���(b)
				if(arr[i][j]==1) {
					count++;
				}
			}
		}
		
		// ������ 0�̸�, w++
		if(count == 0) {
			w++;
		// ������ n*n�̸�, b�� 1��
		}else if(count == n*n) {
			b++;
		// �Ѵ� �ƴϸ� ��� 1,2,3,4 �����Ͽ� ���
		// ������ 1���� 15������
		}else {
			div(x, y, n/2); //0,0,4
			div(x, y+n/2, n/2); //0,4,4
			div(x+n/2, y, n/2);  //4,0,4
			div(x+n/2, y+n/2, n/2);  //4,4,4
		}
		
	}

}
