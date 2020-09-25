package Queue_10845;

import java.util.Scanner;

public class Queue {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String order;
		System.out.println("배열 크기 입력 : ");
		int n=scanner.nextInt();  //배열 크기
		int arr[] = new int[n];
		int f = -1;  //정수 삭제시 ++됨
		int rear = -1;  //정수 추가시 ++됨
		
		for(int i=0 ; i<n; i++) {
			System.out.println("명령어 입력 : ");
			order = scanner.next();
			
			if(order.equals("push")) {  //값 넣기
				
				arr[++rear] = scanner.nextInt();
			
			}else if(order.equals("pop")) {  //값 빼기
				if(rear==f) { //값 없으면 -1 출력
					System.out.println(-1);
				}else {  //값있으면, f++;
					
					System.out.println(arr[++f]); 
				}
				
			}else if(order.equals("front")) {  //맨 앞 정수 출력
				if(rear==-1) {  //값이 없으면, -1 출력
					System.out.println(-1);
				}else {
					System.out.println(arr[f+1]);
				}
				
			}else if(order.equals("back")) {  //맨 뒤 정수 출력
				System.out.println(arr[rear]);
				
			}else if(order.equals("size")) {  //배열 사이즈
				
				if(rear==f) {
					System.out.println(0);
				}else {
					System.out.println(rear+1);
				}
				
			}else if(order.equals("empty")) {
				if(rear == f) {  //배열이 비어있으면 , 1을 출력
					System.out.println(1);
				}else {  //배열이 비어있지 않으면, 0 출력
					System.out.println(0);
				}
				
			}
		}
		
		
	}

}
