package TreeCircuit_1991;

import java.util.Scanner;

// 트리 순회
// https://www.acmicpc.net/problem/1991

public class TreeCircuit {
	//전위순회 (루트 왼쪽 오른쪽)
	public static void preorder(int[][] a, int x) {
		if(x == -1) {
			return;
		}
		
		System.out.println((char)(x+'A'));  //루트 -> 문자형으로 반환됨
		preorder(a, a[x][0]);//왼쪽
		preorder(a, a[x][1]);//오른쪽
	}
	
	//중위순회 (왼쪽 루트 오른쪽)
	public static void inorder(int[][] a, int x) {
		if(x == -1) {
			return;
		}
		inorder(a, a[x][0]);//왼쪽
		System.out.println((char)(x+'A'));//루트
		inorder(a, a[x][1]);//오른쪽
	}
	
	//후위순회 (왼쪽 오른쪽 루트)
	public static void postorder(int[][] a, int x) {
		if(x == -1) {
			return;
		}
		postorder(a, a[x][0]);
		postorder(a,a[x][1]);
		System.out.println((char)(x+'A'));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//노드 개수 받기
		int n = sc.nextInt();
		
		//엔터 제거
		sc.nextLine();
		
		int[][] a = new int[26][2];  //[알파벳26개][이진트리(왼쪽 오른쪽 2가지)]
		
		for(int i=0 ; i<n; i++) {
			String line = sc.nextLine();  //값입력받을겨(enter치기 전까지 입력받음)
			
			//문자형에 문자형을연산하면 결과가 각 문자형의 int값들의 연산과 같다.
			//'A'를 빼주는 이유 : 0-25까지 26개의 index로 대문자 알파벨을 강제 매칭
			
			//각 레벨에서의 부모 노드의 index값 
			//-> i=0일때 line은 A B C이고 charAt(0)은 A를 가리키며, 이 A는 'A'와 빼기 연산되어 0이 된다. 
			//   그래서 맨 처음 x는 0이다.
			int x = line.charAt(0)-'A'; 
			char y = line.charAt(2); //왼쪽(B) -> i가 0일때,A B C에서 charAt(2)는 B이다.
			char z = line.charAt(4); //오른쪽(C) -> i가 0일때,A B C에서 charAt(4)는 C이다.

			
			//왼쪽에 자식이 없으면,
			if(y == '.') {  
				a[x][0] = -1;
			}else {
				a[x][0] = y-'A';
			}
			
			//오른쪽에 자식이 없으면, 
			if(z == '.') {
				a[x][1] = -1;
			}else {
				a[x][1] = z-'A';
			}
		}
		
		//a를 0부터 시작한다.(출력)
		preorder(a,0);
		System.out.println();
		inorder(a,0);
		System.out.println();
		postorder(a, 0);
		System.out.println();
		
		
	}

}
