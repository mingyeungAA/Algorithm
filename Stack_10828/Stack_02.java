package Stack_10828;

import java.util.Scanner;
import java.util.Stack;

public class Stack_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Stack 크기를 입력해주세요 : ");
		int n=sc.nextInt();  //stack크기
		String order;
		
		
		for(int i=0; i<n; i++) {
			System.out.println("명령어를 입력해주세요 : ");
			order = sc.next();
			
			if(order.equals("push")) {
				int a = sc.nextInt(); //stack에 넣을 값
				stack.push(a);
				
			}else if(order.equals("pop")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.pop());
				}
				
			}else if(order.equals("size")) {
				System.out.println(stack.size());
				
			}else if(order.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				
			}else if(order.equals("top")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					// peek() : top이 가리키는 데이터를 읽는다.
					System.out.println(stack.peek());
				}
				
			}
		} 
		
	}

}
