package NoLookNoSee_1764;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//�躸��
//https://www.acmicpc.net/problem/1764

public class NoLookNoSee_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N : ");
		int N = sc.nextInt(); //�赵 ���� ���
		System.out.println("M : ");
		int M = sc.nextInt(); //���� ���� ���
		
		// HashSet : ��������. �ߺ� �ȵ�
		Set<String> hs = new HashSet<String>();  //�赵 ���� ����� HashSet
		List<String> list = new ArrayList<String>();
		
		//�赵 ���� ��� �ֱ�
		for(int i=0 ; i<N ; i++) {  
			hs.add(sc.next());
		}
		
		//���� ���� ��� �Է��ϱ�
		for(int i=0; i<M; i++) {
			String name=sc.next();
			if(hs.contains(name)) {  // �Է¹��� name�� hs�� �� �̸��� ������
				list.add(name);      // list�� �ֱ�
			}
		}
		
		//�� ���
		System.out.println(list.size());
		//�̸� ���
		for(int i=0; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}

}
