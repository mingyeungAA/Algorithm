package Poketmon_Master_1620;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PoketMon {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		System.out.println("Map의 크기를 입력해주세요 : ");
		int N = sc.nextInt();  //포켓몬 전체 갯수
		int M = sc.nextInt();  //몇개를 맞출것인지
	
		
		String[] ss = new String[N];
		
		for(int i=0; i<N ; i++) {  //포켓몬 입력받기
			map.put(ss[i] = sc.next(), i+1);  
		}
		for(int i=0; i<M ;i++) {
			System.out.println("입력하세요 : ");
			String inp = sc.next();  //포켓몬이름을 입력하면,
			if('0'<=inp.charAt(0) && inp.charAt(0)<='9') {
				System.out.println(ss[Integer.parseInt(inp)-1]);  //숫자로 출력됨
			}else {  //숫자로 입력하면,
				System.out.println(map.get(inp));  //포켓몬 이름으로 출력됨
			}
		}
		
		
	}

}
