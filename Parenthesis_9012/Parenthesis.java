package Parenthesis_9012;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/* 내가 생각해본것! 틀림..ㅎㅎㅋ
		// "("와 ")"의 갯수를 세어주자 : 짝수면 true, 홀수면 false
		// 짝수여도, "((()()"는  false가 되어야 된다....
		
		System.out.println("데이터 갯수를 적어주세요.");
		int input =  sc.nextInt();
		
		int count = 0;
		String[] arr = new String[input];
		// "(" 와 ")"의 갯수를 세주자
		for(int i = 0; i<input ; i++) {  //배열을 입력받은 수만큼 반복문돌릴건데
			if(input >= 2 & input <= 50) { 
				System.out.println("괄호를 입력해주세요.");
				arr[i] = sc.next();
				if(arr[i].length()%2 == 0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			
			
			
			}else {
				System.out.println("2와 50사이의 수를 입력해주세요!");
			}
			
		}
		*/
		
		/////////////////////////////////////////////////////
		//보고 다시 풀어본것!!
		
		// 열린괄호는 무조건 stack에 넣어줌
		// 닫힌 괄호가 들어간 순간 pop 할것!
		// 스택이 비었다고 무조건 YES는 아니다. 비었을때 다시 닫는괄호가 나오면 그때 NO
		
		System.out.println("데이터 갯수를 적어주세요.");
		int input =  sc.nextInt();
		
		for(int i=0 ; i<input ; i++) {  //입력한 수만큼 반복
			
			String parth = sc.next();  //괄호 입력
			String res = "YES";  //res는 기본 YES이다. 
			Stack st = new Stack<>();
			
			for(int j = 0; j<parth.length(); j++) {
				
				if(parth.charAt(j)=='(') {  //열린괄호이면, stack에 넣자
					st.push(1);
					
				}else if(parth.charAt(j) == ')') {
					if(st.isEmpty()) {  //stack이 비었고 ')'이 들어가면,
						res = "NO";
						break;
					}else {  //stack이 안비었으면, 
						st.pop();
					}
				}
			}
			if(!st.isEmpty()) {  //비어있지 않으면, 
				res="NO";
			}
			System.out.println(res);
		}
		
	}

}
