package Queue_10845;

import java.util.Scanner;

public class Queue {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String order;
		System.out.println("�迭 ũ�� �Է� : ");
		int n=scanner.nextInt();  //�迭 ũ��
		int arr[] = new int[n];
		int f = -1;  //���� ������ ++��
		int rear = -1;  //���� �߰��� ++��
		
		for(int i=0 ; i<n; i++) {
			System.out.println("��ɾ� �Է� : ");
			order = scanner.next();
			
			if(order.equals("push")) {  //�� �ֱ�
				
				arr[++rear] = scanner.nextInt();
			
			}else if(order.equals("pop")) {  //�� ����
				if(rear==f) { //�� ������ -1 ���
					System.out.println(-1);
				}else {  //��������, f++;
					
					System.out.println(arr[++f]); 
				}
				
			}else if(order.equals("front")) {  //�� �� ���� ���
				if(rear==-1) {  //���� ������, -1 ���
					System.out.println(-1);
				}else {
					System.out.println(arr[f+1]);
				}
				
			}else if(order.equals("back")) {  //�� �� ���� ���
				System.out.println(arr[rear]);
				
			}else if(order.equals("size")) {  //�迭 ������
				
				if(rear==f) {
					System.out.println(0);
				}else {
					System.out.println(rear+1);
				}
				
			}else if(order.equals("empty")) {
				if(rear == f) {  //�迭�� ��������� , 1�� ���
					System.out.println(1);
				}else {  //�迭�� ������� ������, 0 ���
					System.out.println(0);
				}
				
			}
		}
		
		
	}

}
