package 회의실배정_1931;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1931

public class 회의실배정_1931 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][]arr = new int[N][2];
		for(int i=0; i<arr.length; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		//정렬
		//종료시간이 같으면, 시작시간이 빠른순으로 정렬
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
		
		// 직전 종료시간이 다음 회의시작시간보다 작거나 같으면 갱신
		for(int i=0; i<N; i++) {
			if(prev_end_time <= arr[i][0]) {
				prev_end_time = arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
