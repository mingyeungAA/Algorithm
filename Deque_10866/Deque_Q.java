package Deque_10866;


import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Q {
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deque�� ũ�⸦ �Է����ּ��� : ");
		int n=sc.nextInt();  //Deque ũ�� �Է�
		String order;
		int a;  //Deque�� ���� ��
		int f = -1;  //�� �� ����. �տ��� ���ԵǸ� ++��. �տ��� �����Ǹ�
		int b = n;  //�� �� ����. �ڿ��� ���ԵǸ� --��.
		
		for(int i=0; i<n ; i++) {
			System.out.println("��ɾ �Է����ּ��� : ");
			order = sc.next();
			
			if(order.equals("push_back")) {  //�� �ڿ� �� �ֱ�
				a = sc.nextInt();
				deque.offerLast(a);
				
				
			}else if(order.equals("push_front")) {  //�� �տ� �� �ֱ�
				a = sc.nextInt();
				deque.offerFirst(a);
				
			}else if(order.equals("pop_front")) {  //�� �տ� �� ����
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					
					System.out.println(deque.removeFirst());
				}
				
			}else if(order.equals("pop_back")) {  //�� �ڿ� �� ����
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					
					System.out.println(deque.removeLast());
				}
				
			}else if(order.equals("size")) {  //Deque ũ��
				System.out.println(deque.size());
				
			}else if(order.equals("empty")) {
				if(deque.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				
			}else if(order.equals("front")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.peekFirst());
				}
				
			}else if(order.equals("back")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.peekLast());
				}
				
			}
		}
		
	}

}
