package ȸ�ǽǹ���_1931;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1931

public class ȸ�ǽǹ���_1931 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][]arr = new int[N][2];
		for(int i=0; i<arr.length; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		//����
		//����ð��� ������, ���۽ð��� ���������� ����
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		// ���� ����ð��� ���� ȸ�ǽ��۽ð����� �۰ų� ������ ����
		for(int i=0; i<N; i++) {
			if(prev_end_time <= arr[i][0]) {
				prev_end_time = arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
