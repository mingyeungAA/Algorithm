package ���￡���輭��ã��;

public class FindKim {
	public static String solution(String[] seoul) {
		String answer = "";
		
		for(int i=0 ;i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer+="�輭���� "+i+"�� �ִ�.";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		System.out.println(solution(seoul));
		
	}

}
