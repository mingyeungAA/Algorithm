package 색종이만들기_2630;

import java.util.Arrays;
import java.util.Scanner;

// 색종이 만들기
// https://www.acmicpc.net/problem/2630

public class 색종이만들기 {
	
	static int[][] arr;
	static int w=0;
	static int b=0;
	static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//한변의 길이 n (2,4,8,16,32,64,128 중 하나이다.)
		n = sc.nextInt();
		
		arr = new int[n][n];
		
		//입력받기(0과 1)
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
				// 1로 가득찼는지 검사
				// 1이면 블루(b)
				if(arr[i][j]==1) {
					count++;
				}
			}
		}
		
		// 갯수가 0이면, w++
		if(count == 0) {
			w++;
		// 갯수가 n*n이면, b는 1개
		}else if(count == n*n) {
			b++;
		// 둘다 아니면 재귀 1,2,3,4 분할하여 재귀
		// 갯수가 1부터 15까지면
		}else {
			div(x, y, n/2); //0,0,4
			div(x, y+n/2, n/2); //0,4,4
			div(x+n/2, y, n/2);  //4,0,4
			div(x+n/2, y+n/2, n/2);  //4,4,4
		}
		
	}

}
