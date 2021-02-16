package 핸드폰번호가리기;

public class HidePhoneNumber {
	
	public static String solution(String phone_number) {
		String answer = "";
		
		for(int i=0; i<phone_number.length(); i++) {
			if(i < phone_number.length()-4) {
				answer += "*";
			}else {
				answer+=phone_number.charAt(i);
			}
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String phone_number01 = "01033334444";
		String phone_number02 = "027778888";
		
		System.out.println(solution(phone_number01));
		System.out.println(solution(phone_number02));
	}

}
