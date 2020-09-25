package Queue_10845;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Queue_02_10845 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Queue<Integer> que = new LinkedList<>();
		
		System.out.println("Queue의 크기를 입력해주세요 : ");
		int n = sc.nextInt();  //queue 크기
		int a;  //queue에 넣을 값
		int last = 0;  //queue에 있는 맨 마지막 정수
		String order;
		
		for(int i=0 ; i<n ; i++) {
			System.out.println("명령어를 입력해주세요 : ");
			order = sc.next();
			
			if(order.equals("push")) {
				a = sc.nextInt();
				last = a;
				que.add(a);
				
			}else if(order.equals("pop")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}else {
					// poll() : 맨 앞의 값 꺼내기
					System.out.println(que.poll());
				}
				
			}else if(order.equals("front")) {
				if(que.isEmpty()) {
					System.out.println(-1);
				}else {
					// peek() : 맨 앞의 값 확인
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
