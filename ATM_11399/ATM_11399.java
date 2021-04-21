package ATM_11399;

import java.util.Arrays;
import java.util.Scanner;

// �׸��� �˰���
// https://www.acmicpc.net/problem/11399
// ���ð��� ����


public class ATM_11399 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] time = new int[N];
		
		for(int i=0; i<time.length; i++) {
			time[i] = sc.nextInt();
		}
		
		// ����
		Arrays.sort(time);
		
		int prev = 0;  // ���������� ���ð� ������
		int sum = 0;  // ����� ���ð� ����
		
		for(int i=0; i<N; i++) {
			//���������� ���ð��� ���� ����� �ɸ��� �ð��� �����ش�.
			sum += prev+time[i];
			
			//���������� �����տ� ���� �ɸ��� �ð��� �����ش�.
			prev += time[i];
		}
		System.out.println(sum);
	}

}
