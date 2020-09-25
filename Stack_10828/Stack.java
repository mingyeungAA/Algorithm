package Stack_10828;

import java.util.Scanner;

public class Stack {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 크기 입력  : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int top = -1;
		String order;
		
		System.out.println("명령어 입력 : ");
		for(int i=0 ; i<n ; i++) {
			order = sc.next();
			
			if(order.equals("push")) {
				top++;
				arr[top]=sc.nextInt();
			
			}else if(order.equals("pop")) {
				
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
					top--;
				}
			}else if(order.equals("size")) {
				System.out.println(top+1);
			
			}else if(order.equals("empty")) {
				if(top == -1) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			
			}else if(order.equals("top")) {
				if(top==-1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
				}
			}
			
		}
	
		sc.close();
	}

}
