package ���ڼ���;

class WaterMelon {
	
	public static String solution(int n) {
		String answer = "";
		
		for(int i=0; i<n; i++) {
			
			if(i%2==0) {
				answer+="��";
			}
			if(i%2==1){
				answer+="��";
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int n01 = 3;
		System.out.println(solution(n01));
		
		int n02 = 4;
		System.out.println(solution(n02));
	}

}
