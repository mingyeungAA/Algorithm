package NoLookNoSee_1764;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// �躸��
// https://www.acmicpc.net/problem/1764
// ���� �Ѱ�...�� ��ȿ����!!

public class NoLookNoSee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("N : ");
		int N = sc.nextInt();  //�赵 ���� ���
		System.out.println("M : ");
		int M = sc.nextInt();  //���� ���� ���
		String[] arr01 = new String[N];  //�赵 ���� ��� ���� �迭
		String[] arr02 = new String[M];  //���� ���� ��� ���� �迭
		
		//�ΰ��� �迭�� �̸� �ֱ�
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
		//�ΰ��� �迭 ���ؼ�, �Ȱ��� �̸��� ������, count����, �� �̸� ���
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
