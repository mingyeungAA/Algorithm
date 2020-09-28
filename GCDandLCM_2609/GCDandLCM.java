package 최대공약수and최소공배수_2609;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2609

public class GCDandLCM {
	
	public static int gcd(int a, int b) {  //최대공약수
		
		while(b>0) {
			int tmp = a%b;
			a=b;
			b=tmp;
		}
		
		return a;
	}
	
	public static int lcm(int a, int b) {  //최소공배수
		
		return (a*b)/gcd(a,b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력해주세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("최대공약수 : ");
		System.out.println(gcd(a,b));
		System.out.println("최소공배수 : ");
		System.out.println(lcm(a,b));
		
	}

}
