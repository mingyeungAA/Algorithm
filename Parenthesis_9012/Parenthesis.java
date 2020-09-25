package Parenthesis_9012;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/* ���� �����غ���! Ʋ��..������
		// "("�� ")"�� ������ �������� : ¦���� true, Ȧ���� false
		// ¦������, "((()()"��  false�� �Ǿ�� �ȴ�....
		
		System.out.println("������ ������ �����ּ���.");
		int input =  sc.nextInt();
		
		int count = 0;
		String[] arr = new String[input];
		// "(" �� ")"�� ������ ������
		for(int i = 0; i<input ; i++) {  //�迭�� �Է¹��� ����ŭ �ݺ��������ǵ�
			if(input >= 2 & input <= 50) { 
				System.out.println("��ȣ�� �Է����ּ���.");
				arr[i] = sc.next();
				if(arr[i].length()%2 == 0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			
			
			
			}else {
				System.out.println("2�� 50������ ���� �Է����ּ���!");
			}
			
		}
		*/
		
		/////////////////////////////////////////////////////
		//���� �ٽ� Ǯ���!!
		
		// ������ȣ�� ������ stack�� �־���
		// ���� ��ȣ�� �� ���� pop �Ұ�!
		// ������ ����ٰ� ������ YES�� �ƴϴ�. ������� �ٽ� �ݴ°�ȣ�� ������ �׶� NO
		
		System.out.println("������ ������ �����ּ���.");
		int input =  sc.nextInt();
		
		for(int i=0 ; i<input ; i++) {  //�Է��� ����ŭ �ݺ�
			
			String parth = sc.next();  //��ȣ �Է�
			String res = "YES";  //res�� �⺻ YES�̴�. 
			Stack st = new Stack<>();
			
			for(int j = 0; j<parth.length(); j++) {
				
				if(parth.charAt(j)=='(') {  //������ȣ�̸�, stack�� ����
					st.push(1);
					
				}else if(parth.charAt(j) == ')') {
					if(st.isEmpty()) {  //stack�� ����� ')'�� ����,
						res = "NO";
						break;
					}else {  //stack�� �Ⱥ������, 
						st.pop();
					}
				}
			}
			if(!st.isEmpty()) {  //������� ������, 
				res="NO";
			}
			System.out.println(res);
		}
		
	}

}
