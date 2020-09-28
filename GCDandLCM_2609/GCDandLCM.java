package �ִ�����and�ּҰ����_2609;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2609

public class GCDandLCM {
	
	public static int gcd(int a, int b) {  //�ִ�����
		
		while(b>0) {
			int tmp = a%b;
			a=b;
			b=tmp;
		}
		
		return a;
	}
	
	public static int lcm(int a, int b) {  //�ּҰ����
		
		return (a*b)/gcd(a,b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է����ּ��� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("�ִ����� : ");
		System.out.println(gcd(a,b));
		System.out.println("�ּҰ���� : ");
		System.out.println(lcm(a,b));
		
	}

}
