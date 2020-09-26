package NoLookNoSee_1764;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 듣보잡
// https://www.acmicpc.net/problem/1764
// 내가 한거...넘 비효율적!!

public class NoLookNoSee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("N : ");
		int N = sc.nextInt();  //듣도 못한 사람
		System.out.println("M : ");
		int M = sc.nextInt();  //보도 못한 사람
		String[] arr01 = new String[N];  //듣도 못한 사람 넣을 배열
		String[] arr02 = new String[M];  //보도 못한 사람 넣을 배열
		
		//두개의 배열에 이름 넣기
		for(int i=0; i<N; i++) {
			arr01[i]=sc.next();
		}
		
		for(int j=0 ;j<M ;j++) {
			arr02[j]=sc.next();
		}
		
		/*
		for(int i=0 ; i<arr02.length; i++) {
			System.out.println(arr02[i]);
		}
		System.out.println(arr02.length);
		*/
		List<String> list = new ArrayList<String>();
		//두개의 배열 비교해서, 똑같은 이름이 있으면, count세고, 그 이름 출력
		for(int i=0; i<arr01.length ;i++) {
			for(int j=0; j<arr02.length; j++) {
				if(arr01[i].equals(arr02[j])) {
					count++;
					list.add(arr02[j]);
				}
			}
		}
		System.out.println(count);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
	}

}
