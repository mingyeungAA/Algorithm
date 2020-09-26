package NoLookNoSee_1764;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//듣보잡
//https://www.acmicpc.net/problem/1764

public class NoLookNoSee_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N : ");
		int N = sc.nextInt(); //듣도 못한 사람
		System.out.println("M : ");
		int M = sc.nextInt(); //보도 못한 사람
		
		// HashSet : 순서없음. 중복 안됨
		Set<String> hs = new HashSet<String>();  //듣도 못한 사람는 HashSet
		List<String> list = new ArrayList<String>();
		
		//듣도 못한 사람 넣기
		for(int i=0 ; i<N ; i++) {  
			hs.add(sc.next());
		}
		
		//보도 못한 사람 입력하기
		for(int i=0; i<M; i++) {
			String name=sc.next();
			if(hs.contains(name)) {  // 입력받은 name과 hs에 들어간 이름이 같으면
				list.add(name);      // list에 넣기
			}
		}
		
		//수 출력
		System.out.println(list.size());
		//이름 출력
		for(int i=0; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}

}
