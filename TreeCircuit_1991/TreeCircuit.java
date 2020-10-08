package TreeCircuit_1991;

import java.util.Scanner;

// Ʈ�� ��ȸ
// https://www.acmicpc.net/problem/1991

public class TreeCircuit {
	//������ȸ (��Ʈ ���� ������)
	public static void preorder(int[][] a, int x) {
		if(x == -1) {
			return;
		}
		
		System.out.println((char)(x+'A'));  //��Ʈ -> ���������� ��ȯ��
		preorder(a, a[x][0]);//����
		preorder(a, a[x][1]);//������
	}
	
	//������ȸ (���� ��Ʈ ������)
	public static void inorder(int[][] a, int x) {
		if(x == -1) {
			return;
		}
		inorder(a, a[x][0]);//����
		System.out.println((char)(x+'A'));//��Ʈ
		inorder(a, a[x][1]);//������
	}
	
	//������ȸ (���� ������ ��Ʈ)
	public static void postorder(int[][] a, int x) {
		if(x == -1) {
			return;
		}
		postorder(a, a[x][0]);
		postorder(a,a[x][1]);
		System.out.println((char)(x+'A'));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//��� ���� �ޱ�
		int n = sc.nextInt();
		
		//���� ����
		sc.nextLine();
		
		int[][] a = new int[26][2];  //[���ĺ�26��][����Ʈ��(���� ������ 2����)]
		
		for(int i=0 ; i<n; i++) {
			String line = sc.nextLine();  //���Է¹�����(enterġ�� ������ �Է¹���)
			
			//�������� �������������ϸ� ����� �� �������� int������ ����� ����.
			//'A'�� ���ִ� ���� : 0-25���� 26���� index�� �빮�� ���ĺ��� ���� ��Ī
			
			//�� ���������� �θ� ����� index�� 
			//-> i=0�϶� line�� A B C�̰� charAt(0)�� A�� ����Ű��, �� A�� 'A'�� ���� ����Ǿ� 0�� �ȴ�. 
			//   �׷��� �� ó�� x�� 0�̴�.
			int x = line.charAt(0)-'A'; 
			char y = line.charAt(2); //����(B) -> i�� 0�϶�,A B C���� charAt(2)�� B�̴�.
			char z = line.charAt(4); //������(C) -> i�� 0�϶�,A B C���� charAt(4)�� C�̴�.

			
			//���ʿ� �ڽ��� ������,
			if(y == '.') {  
				a[x][0] = -1;
			}else {
				a[x][0] = y-'A';
			}
			
			//�����ʿ� �ڽ��� ������, 
			if(z == '.') {
				a[x][1] = -1;
			}else {
				a[x][1] = z-'A';
			}
		}
		
		//a�� 0���� �����Ѵ�.(���)
		preorder(a,0);
		System.out.println();
		inorder(a,0);
		System.out.println();
		postorder(a, 0);
		System.out.println();
		
		
	}

}
