package Queue_10845;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Queue_02_10845 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Queue<Integer> que = new LinkedList<>();
		
		System.out.println("Queue�� ũ�⸦ �Է����ּ��� : ");
		int n = sc.nextInt();  //queue ũ��
		int a;  //queue�� ���� ��
		int last = 0;  //queue�� �ִ� �� ������ ����
		String order;
		
		for(int i=0 ; i<n ; i++) {
			System.out.println("��ɾ �Է����ּ��� : ");
			order = sc.next();
			
			if(order.equals("push")) {
				a = sc.nextInt();
				last = a;
				que.add(a);
				
			}else if(order.equals("pop")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}else {
					// poll() : �� ���� �� ������
					System.out.println(que.poll());
				}
				
			}else if(order.equals("front")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}else {
					// peek() : �� ���� �� Ȯ��
					System.out.println(que.peek());
				}
				
			}else if(order.equals("back")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(last);
				}
				
			}else if(order.equals("empty")) {
				if(que.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				
			}else if(order.equals("size")) {
				System.out.println(que.size());
			}
		}
		
		
		
	}

}
