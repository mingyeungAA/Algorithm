package Deque_10866;


import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Q {
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deque의 크기를 입력해주세요 : ");
		int n=sc.nextInt();  //Deque 크기 입력
		String order;
		int a;  //Deque에 넣을 값
		int f = -1;  //맨 앞 정수. 앞에서 삽입되면 ++됌. 앞에서 삭제되면
		int b = n;  //맨 뒤 정수. 뒤에서 삽입되면 --됌.
		
		for(int i=0; i<n ; i++) {
			System.out.println("명령어를 입력해주세요 : ");
			order = sc.next();
			
			if(order.equals("push_back")) {  //맨 뒤에 값 넣기
				a = sc.nextInt();
				deque.offerLast(a);
				
				
			}else if(order.equals("push_front")) {  //맨 앞에 값 넣기
				a = sc.nextInt();
				deque.offerFirst(a);
				
			}else if(order.equals("pop_front")) {  //맨 앞에 값 빼기
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					
					System.out.println(deque.removeFirst());
				}
				
			}else if(order.equals("pop_back")) {  //맨 뒤에 값 빼기
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					
					System.out.println(deque.removeLast());
				}
				
			}else if(order.equals("size")) {  //Deque 크기
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
