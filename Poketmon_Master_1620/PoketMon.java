package Poketmon_Master_1620;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PoketMon {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		System.out.println("Map�� ũ�⸦ �Է����ּ��� : ");
		int N = sc.nextInt();  //���ϸ� ��ü ����
		int M = sc.nextInt();  //��� ���������
	
		
		String[] ss = new String[N];
		
		for(int i=0; i<N ; i++) {  //���ϸ� �Է¹ޱ�
			map.put(ss[i] = sc.next(), i+1);  
		}
		for(int i=0; i<M ;i++) {
			System.out.println("�Է��ϼ��� : ");
			String inp = sc.next();  //���ϸ��̸��� �Է��ϸ�,
			if('0'<=inp.charAt(0) && inp.charAt(0)<='9') {
				System.out.println(ss[Integer.parseInt(inp)-1]);  //���ڷ� ��µ�
			}else {  //���ڷ� �Է��ϸ�,
				System.out.println(map.get(inp));  //���ϸ� �̸����� ��µ�
			}
		}
		
		
	}

}
