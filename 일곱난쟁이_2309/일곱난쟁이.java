package �ϰ�������_2309;

import java.util.Arrays;
import java.util.Scanner;

// �ϰ�������
// ����Ž��
// https://www.acmicpc.net/problem/2309

public class �ϰ������� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] arr = new int[9];
		
		// ��ȩ���� ������ Ű�� �Է¹޴´�.
		// ��ȩ�� Ű�� �����ش�.
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		//���� �ٸ� �ε����� �Ƿ���, ������ j�� i���� 1 ū������ �����ϸ��!!(�Ȱ�ġ����)
		for(int i=0; i<arr.length ;i++) {
			for(int j=1; j<arr.length; j++) {
				//�հ迡�� �μ��� �� ���� 100�̸� ���ǿ� �´´�.
				//���ǿ� ������, �μ��� 0���� ������ش�.
				if(sum-arr[i]-arr[j] == 100) {
					arr[i]=0;
					arr[j]=0;
				}
			}
		}
		
		//sort�� �������� : ���� ������ ������
		Arrays.sort(arr);
	
		
		//���
		for(int i=0 ;i<arr.length; i++) {
			if(arr[i] != 0) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
